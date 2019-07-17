package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.domain.Department;
import cn.wolfcode.crm.qo.PageResult;
import cn.wolfcode.crm.qo.QueryObject;

import cn.wolfcode.crm.serivce.IDepartmentService;
import cn.wolfcode.crm.util.JsonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {



    @Autowired
    private IDepartmentService departmentService;


    @RequestMapping("/list")
    public String list(Model model, QueryObject qo){
//        查询所有部门
        PageInfo pageResult = departmentService.query(qo);
        List<Department> department = departmentService.getAll();

//        共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("deps", department);
        return "department/list";
    }

    @RequestMapping("/input")
    public String input(Model model, Long id){
        if(id != null){
            model.addAttribute("dept", departmentService.get(id));
        }
        return "department/input";
    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JsonResult saveOrUpdate(Department dept){
        JsonResult result = new JsonResult();
        try {
            if(dept.getId() != null){
                departmentService.update(dept);
            }else{
                departmentService.save(dept);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.mark("信息保存失败");
        }
        return result;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Long id){
        JsonResult result = new JsonResult();
        try{
            if(id != null){
                departmentService.delate(id);

            }
        }catch (Exception e){
            result.mark("删除操作失败");
        }

        return result;
    }


}
