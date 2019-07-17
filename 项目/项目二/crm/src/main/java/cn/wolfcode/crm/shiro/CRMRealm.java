package cn.wolfcode.crm.shiro;

import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.mapper.EmployeeMapper;
import cn.wolfcode.crm.mapper.PermissionMapper;
import cn.wolfcode.crm.mapper.RoleMapper;
import cn.wolfcode.crm.serivce.impl.EmployeeServiceImpl;
import jdk.nashorn.internal.parser.Token;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component("crmRealm")
public class CRMRealm extends AuthorizingRealm {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher){
        super.setCredentialsMatcher(credentialsMatcher);
    }



    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获取当前用户
        Employee employee = (Employee)principalCollection.getPrimaryPrincipal();
        if(employee.isAdmin()){
            //给超级管理员授权角色和权限
            info.addRole("admin");
            info.addStringPermission("*:*");
        }else{
            //查询当前用户的角色sn码和权限表达式
            List<String> sns = roleMapper.queryRoleSnByEmpId(employee.getId());
            List<String> expression = permissionMapper.queryByEmployeeId(employee.getId());
            //授权权限
            info.addRoles(sns);
            info.addStringPermissions(expression);
        }

        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //认证账号
        String name = authenticationToken.getPrincipal().toString();
        Employee employee = employeeMapper.loginName(name);
        if(employee != null) {
            //因为在使用md5加密的时候使用第二个参数盐，认证的时候要配置一个盐(第三个参数)
            return new SimpleAuthenticationInfo(
                    employee,
                    employee.getPassword(),
                    ByteSource.Util.bytes(employee.getName()),
                    this.getName());
        }
        return null;
    }
}
