package cn.wolfcode.crm.shiro;

import cn.wolfcode.crm.util.JsonResult;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Component("crmFormAuthenticationFilter")
public class CRMFormAuthenticationFilter  extends FormAuthenticationFilter {
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        //认证成功信息
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().print(JSON.toJSONString(new JsonResult()));
        return false;
    }

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        //认证失败信息
        response.setContentType("application/json;charset=utf-8");
        JsonResult jsonResult = new JsonResult();
        jsonResult.mark("密码或者账号错误");
        try {
            response.getWriter().print(JSON.toJSONString(jsonResult));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
