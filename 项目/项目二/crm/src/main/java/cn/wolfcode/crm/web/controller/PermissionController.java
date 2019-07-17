package cn.wolfcode.crm.web.controller;


import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.qo.PageResult;
import cn.wolfcode.crm.qo.QueryObject;

import cn.wolfcode.crm.serivce.IPermissionService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/permission")
public class PermissionController {



    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("/list")
    public String list(Model model, QueryObject qo){
        //List<Permission> permissions = permissionService.getAll();
        PageInfo<Permission> pageResult = permissionService.query(qo);

//        共享值
        model.addAttribute("pageResult", pageResult);
        return "permission/list";
    }

    @RequestMapping("/input")
    public String input(Model model, Long id){
        if(id != null){
            model.addAttribute("permission", permissionService.get(id));
        }
       return "permission/input";
    }

//    @RequestMapping("/saveOrUpdate")
//    public String saveOrUpdate(Permission permission){
//        if(permission.getId() != null){
//            permissionService.update(permission);
//        }else{
//            //
//            permissionService.save(permission);
//        }
//        return "redirect:/permission/list.do";
//    }
//
//    @RequestMapping("/delete")
//    public String delete(Long id){
//        if(id != null){
//            permissionService.delate(id);
//        }
//        return "redirect:/permission/list.do";
//    }



    @RequestMapping("/reload")
    @ResponseBody
    public Map<String, Boolean> load(){
        HashMap<String, Boolean> result = new HashMap<>();
        try{
            //加载权限
            permissionService.reload();
        }catch (Exception e){
            e.printStackTrace();
            result.put("success", false);
            return result;
        }
        result.put("success", true);
        return result;

    }





}
