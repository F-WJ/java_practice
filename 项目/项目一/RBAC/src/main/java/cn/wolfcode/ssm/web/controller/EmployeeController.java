package cn.wolfcode.ssm.web.controller;

import cn.wolfcode.ssm.domain.Department;
import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.domain.Role;
import cn.wolfcode.ssm.qo.EmployeeQueryObject;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;
import cn.wolfcode.ssm.serivce.IDepartmentService;
import cn.wolfcode.ssm.serivce.IEmployeeService;
import cn.wolfcode.ssm.serivce.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDepartmentService departmentService;

    @Autowired
    private IRoleService roleService;

    @RequestMapping("/list")
    public String list(Model model, EmployeeQueryObject qo){
//        查询
        PageResult pageResult = employeeService.query(qo);
        List<Employee> employees = pageResult.getListData();
        //添加部门信息到用户上
        for(Employee list: employees){
            Long deptId = list.getDeptId();
            Department department = departmentService.get(deptId);
            list.setDept(department);
        }



//        回显操作
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        model.addAttribute("depts", departmentService.getAll());
        return "employee/list";
    }

    @RequestMapping("/input")
    public String list(Model model, Long id){
        if(id != null){

            Employee employee = employeeService.get(id);
            //回显部门信息
            Department department = departmentService.get(employee.getDeptId());
            employee.setDept(department);
            //回显当前用户角色
            //通过用户id查找角色关联数据
            List<Role> roles = employeeService.selectRelation(id);
            //绑定到当前employee的roles上
            if(roles != null){
                employee.setRoles(roles);
            }
            model.addAttribute("employee", employee);
        }

        model.addAttribute("depts", departmentService.getAll());
        model.addAttribute("roles", roleService.getAll());
        return "employee/input";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Employee employee, Long[] ids){
        //保存所有信息到数据库上
        //保存部门id
        employee.setDeptId(employee.getDept().getId());
        if(employee.getId() != null){

            employeeService.update(employee);
            //绑定角色到用户上（为了以后的查询模块）
            if(ids != null){
                //删除关联角色
                employeeService.delrelation(employee.getId());
                for(Long roleId : ids){
                    //获取用户id
                    Long employeeId = employee.getId();
                    //保存到关联表上
                    employeeService.relation(employeeId, roleId);
                }
            }

        }else{

            employeeService.save(employee);
            //绑定角色到用户上（为了以后的查询模块）
            if(ids != null){
                for(Long roleId : ids){
                    //获取用户id
                    Long employeeId = employee.getId();
                    //保存到关联表上
                    employeeService.relation(employeeId, roleId);
                }
            }
        }
        return "redirect:/employee/list.do";

    }

    @RequestMapping("/delete")
    public String delete(Long id){
        if(id != null){
            //删除关联角色
            employeeService.delrelation(id);
            employeeService.delate(id);
        }
        return "redirect:/employee/list.do";
    }



}
