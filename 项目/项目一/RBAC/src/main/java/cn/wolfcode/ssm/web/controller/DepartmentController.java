package cn.wolfcode.ssm.web.controller;

import cn.wolfcode.ssm.domain.Department;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;

import cn.wolfcode.ssm.serivce.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {



    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/list")
    public String list(Model model, QueryObject qo){
//        查询所有部门
        PageResult pageResult = departmentService.query(qo);
        List<Department> department = departmentService.getAll();


//        共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("deps", department);
        return "department/list";
    }

    @RequestMapping("/input")
    public String list(Model model, Long id){
        if(id != null){
            model.addAttribute("dept", departmentService.get(id));
        }
        return "department/input";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Department dept){
        if(dept.getId() != null){
            departmentService.update(dept);
        }else{
            departmentService.save(dept);
        }
        return "redirect:/department/list.do";
    }

    @RequestMapping("/delete")
    public String delete(Long id){
        if(id != null){
            departmentService.delate(id);
        }
        return "redirect:/department/list.do";
    }



}
