package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.qo.PageResult;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.serivce.IPermissionService;
import cn.wolfcode.crm.serivce.IRoleService;
import cn.wolfcode.crm.util.JsonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {



    @Autowired
    private IRoleService roleService;

    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("/list")
    public String list(Model model, QueryObject qo){
//        查询所有部门
        List<Role> roles = roleService.getAll();
        PageInfo pageResult = roleService.query(qo);

//        共享值
        model.addAttribute("pageResult", pageResult);
        return "role/list";
    }

    @RequestMapping("/input")
    public String input(Model model, Long id){
        //回显当前角色权限
        List<Permission> permission = roleService.selectRelation(id);

        if(permission != null){
            model.addAttribute("permission", permission);
        }

        if(id != null){
            model.addAttribute("role", roleService.get(id));
        }
        model.addAttribute("permissions", permissionService.getAll());
        return "role/input";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Role role, Long[] ids){

        if(role.getId() != null){

            roleService.update(role);
            if(ids != null){
                //删除关联角色
                roleService.delrelation(role.getId());
                for(Long permissionId : ids){
                    //获取权限id
                    Long roleId = role.getId();
                    //保存到关联表上
                    roleService.relation(roleId, permissionId);
                }
            }

        }else{

            roleService.save(role);
            if(ids != null){
                for(Long permissionId : ids){
                    //获取权限id
                    Long roleId = role.getId();
                    //保存到关联表上
                    roleService.relation(roleId, permissionId);
                }
            }

        }
        return "redirect:/role/list.do";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Long id){
        JsonResult result = new JsonResult();
           try{
               roleService.delrelation(id);
               roleService.delate(id);
           }catch (Exception e){
               e.printStackTrace();
               result.mark("删除操作失败，请重试");
           }
        return result;
    }



}
