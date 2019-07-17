package cn.wolfcode.trip.core.util;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class UserContext {
    public  static HttpSession getSession(){
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        //获取session值
        HttpSession session = ((ServletRequestAttributes) requestAttributes).getRequest().getSession();
        return session;
    }

//    //获取
//    public  static Employee getEmployee(){
//        Employee employee = (Employee)(getSession().getAttribute("EMPLOYEE_IN_SESSION"));
//        return employee;
//
//    }
//
//    //设置
//    public static void setEmployee(Employee employee){
//        getSession().setAttribute("EMPLOYEE_IN_SESSION", employee);
//    }
//
//    //权限表达式
//    public static void setExpressions(List<String> expressions) {
//        getSession().setAttribute("EXPRESSION_IN_SESSION", expressions);
//    }
//    public static List<String> getExpressions(){
//        List<String> expressions = (List<String>)(getSession().getAttribute("EXPRESSION_IN_SESSION"));
//        return expressions;
//    }
}
