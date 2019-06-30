package cn.wolfcode.ssm.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object emp = request.getSession().getAttribute("EMPLOYEE_IN_SESSION");
        if(emp == null){
            response.sendRedirect("/login.jsp");
            return false;
        }

        return true;
    }


}
