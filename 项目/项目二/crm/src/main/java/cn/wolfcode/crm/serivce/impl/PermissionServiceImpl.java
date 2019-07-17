package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.mapper.EmployeeMapper;
import cn.wolfcode.crm.mapper.PermissionMapper;
import cn.wolfcode.crm.mapper.RoleMapper;
import cn.wolfcode.crm.qo.PageResult;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.serivce.IPermissionService;
import cn.wolfcode.crm.util.RequriedPermission;
import cn.wolfcode.crm.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.val;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.*;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private RoleMapper roleMapper;



    public void setPermissionMapper(PermissionMapper permissionMapper) {
    }

    @Override
    public void save(Permission permission) {
        permissionMapper.insert(permission);
    }

    @Override
    public void delate(Long id) {
        permissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Permission permission) {
        permissionMapper.updateByPrimaryKey(permission);
    }

    @Override
    public Permission get(Long id) {
        Permission permission = permissionMapper.selectByPrimaryKey(id);
        return permission;
    }

    @Override
    public List<Permission> getAll() {
        List<Permission> permissions = permissionMapper.selectAll();
        return permissions;

    }

    @Override
    public PageInfo<Permission> query(QueryObject qo) {
            PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize());
            List<Permission> listData = permissionMapper.queryForList(qo);
        return new PageInfo<>(listData);
    }


    //保存用户权限信息session的值
    public void permissionSession(Employee employee) {
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        //获取session值
        HttpSession session = ((ServletRequestAttributes) requestAttributes).getRequest().getSession();
        //获取用户角色信息
        List<Role> roles = employeeMapper.selectRelation(employee.getId());
        if (roles != null) {
            //创建一个arraylist数组
            ArrayList<Permission> permissions = new ArrayList<>();
            //获取当前用户权限信息
            for (Role role : roles) {
                List<Permission> permission = roleMapper.selectRelation(role.getId());
                //去重
//                if(permissions.size() != 0 && permission.size() != 0) {
//                    for (Permission per1 : permission) {
//                            for(Permission per2 : permissions){
//                                if(per1.getName().equals(per2.getName())){
//                                    permissions.addAll(permission);
//                                }
//                            }
//                    }
//                }
                permissions.addAll(permission);
            }
            System.out.println(permissions);
        }

        //设置用户信息session值

    }

    @Override
    public List<String> queryByEmployeeId(Long id) {
        List<String>  expressions = permissionMapper.queryByEmployeeId(id);
        return expressions;
    }


    @Autowired
    private ApplicationContext ctx;


    //通过shiro注解来获取权限信息
    public void reload(){
        //获取当前数据库上的所有权限（用来去重）
        List<String> expessions = permissionMapper.selectAllExpression();
        //获取所有controller
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Controller.class);
        Collection<Object> controllers = beans.values();
        //获取requirepermissions注解的信息
        for(Object controller: controllers){
            Method[] methods = controller.getClass().getSuperclass().getDeclaredMethods();
            for(Method method : methods){
                boolean isExists = method.isAnnotationPresent(RequiresPermissions.class);
                if(isExists){
                    RequiresPermissions annotation = method.getAnnotation(RequiresPermissions.class);
                    String expression = annotation.value()[1];
                    if(expessions.contains(expression)){
                        continue;
                    }
                    //保存到数据库
                    String name = annotation.value()[0];
                    Permission permission = new Permission();
                    permission.setName(name);
                    permission.setExpression(expression);
                    permissionMapper.insert(permission);

                }
            }
        }
    }



    //通过自定义注解来获取权限信息
    public void reloaddemo() {
        List<Permission> permissions = permissionMapper.selectAll();
        HashSet<String> permissionExperssions = new HashSet<>();
        for (Permission permission: permissions) {
            permissionExperssions.add(permission.getExpression());
        }
        //获取容器对象
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Controller.class);
        //获取控制器的方法
        Collection<Object> controllers = beans.values();
        //查找自定义注解
        for(Object controller: controllers){
            //获取所有方法
            Method[] methods = controller.getClass().getDeclaredMethods();
            for(Method method: methods){
                boolean isExists = method.isAnnotationPresent(RequriedPermission.class);
                if(isExists){
                    String expression = StringUtils.getExpression(method);
                    if(!permissionExperssions.contains(expression)){
                        //存入数据库操作
                        Permission permission = new Permission();
                        permission.setName(method.getAnnotation(RequriedPermission.class).name());
                        permission.setExpression(expression);
                        permissionMapper.insert(permission);

                    }
                }
            }
        }

    }


}
