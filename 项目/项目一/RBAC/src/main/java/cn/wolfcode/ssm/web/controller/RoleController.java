package cn.wolfcode.ssm.web.controller;

import cn.wolfcode.ssm.domain.Role;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;
import cn.wolfcode.ssm.serivce.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {



    @Autowired
    private IRoleService roleService;

    @RequestMapping("/list")
    public String list(Model model, QueryObject qo){
//        查询所有部门
        List<Role> roles = roleService.getAll();
        PageResult pageResult = roleService.query(qo);

//        共享值
        model.addAttribute("pageResult", pageResult);
        return "role/list";
    }

    @RequestMapping("/input")
    public String list(Model model, Long id){
        if(id != null){
            model.addAttribute("role", roleService.get(id));
        }
        return "role/input";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Role role){
        if(role.getId() != null){
            roleService.update(role);
        }else{
            roleService.save(role);
        }
        return "redirect:/role/list.do";
    }

    @RequestMapping("/delete")
    public String delete(Long id){
        if(id != null){
            roleService.delate(id);
        }
        return "redirect:/role/list.do";
    }



}
