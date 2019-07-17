import cn.wolfcode.crm.domain.CustomerTransfer;
import cn.wolfcode.crm.mapper.CustomerTransferMapper;
import cn.wolfcode.crm.mapper.EmployeeMapper;
import cn.wolfcode.crm.qo.CustomerTransferObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class shirodemo {
    public static void main(String[] args) {
        IniSecurityManagerFactory iniSecurityManagerFactory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = iniSecurityManagerFactory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token = new UsernamePasswordToken("aaa","123");
        try {
            //开始认证
            subject.login(token);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public void testShiroAutho(){
        //加载配置文件
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiroautho.ini");
        //创建shiro安全管理器
        SecurityManager manager = factory.getInstance();
        //把刚刚创建的安全管理器添加到运行环境中
        SecurityUtils.setSecurityManager(manager);
        //获取登录的用户对象（用户信息）
        Subject subject = SecurityUtils.getSubject();
        System.out.println("登录前的认证状态：" + subject.isAuthenticated());
        //创建登录用户的身份凭证
        UsernamePasswordToken token = new UsernamePasswordToken("test1", "1234");
        //登录认证
        try {
            subject.login(token);
            System.out.println("认证成功");
        }catch (UnknownAccountException e){
            e.printStackTrace();
            System.out.println("用户名错误");
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            System.out.println("密码错误");
        }
        System.out.println("登录后的状态：" + subject.isAuthenticated());

        //权限
        System.out.println(subject.isPermitted("user:delete")); //true
        System.out.println(Arrays.asList(subject.isPermitted("user:list", "user:update")[1]));  //[true]
        System.out.println(Arrays.asList(subject.isPermitted("user:list", "user:update"))); //[[Z@5d5eef3d]

        //角色
        System.out.println(subject.hasRole("role2"));  //true
        System.out.println(subject.hasRoles(Arrays.asList("role1", "role2")));  //[Z@56f4468b
        System.out.println(subject.hasAllRoles(Arrays.asList("role1", "role2", "role3")));  //true


    }

    @Autowired
    private CustomerTransferMapper customerTransferMapper;

    @Test
    public void testDemo(){
        CustomerTransferObject qo = new CustomerTransferObject();
        List<CustomerTransfer> customerTransfers = customerTransferMapper.queryForList(qo);
        System.out.println(customerTransfers);
    }
}

