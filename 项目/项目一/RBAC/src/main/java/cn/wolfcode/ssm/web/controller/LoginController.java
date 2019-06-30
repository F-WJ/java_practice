package cn.wolfcode.ssm.web.controller;

import cn.wolfcode.ssm.domain.Department;
import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.serivce.IDepartmentService;
import cn.wolfcode.ssm.serivce.IEmployeeService;
import com.alibaba.druid.filter.AutoLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("login")
    private String list(String username, String password, HttpSession session, Model model) {
        //获取请求数据，查询数据
        Employee employee = employeeService.login(username, password);
        //通过数据库判断是否有值
        System.out.println(employee);
        if (employee == null) {
            model.addAttribute("msg", "用户名不对或者密码错误");
            return "forward:/login.jsp";
        }
        //设置session
        session.setAttribute("EMPLOYEE_IN_SESSION", employee);
        return "redirect:/list.do";
    }


}
