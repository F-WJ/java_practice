package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.domain.Systemdictionary;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.serivce.ISystemdictionaryService;
import cn.wolfcode.crm.util.JsonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/systemDictionary")
public class SystemDictionaryController {



    @Autowired
    private ISystemdictionaryService systemdictionaryService;


    @RequestMapping("/list")
    public String list(Model model, QueryObject qo){
//        查询所有

        PageInfo pageResult = systemdictionaryService.query(qo);

//        共享值
        model.addAttribute("pageResult", pageResult);
        return "systemDictionary/list";
    }

    @RequestMapping("/input")
    public String input(Model model, Long id){
        if(id != null){
            model.addAttribute("dept", systemdictionaryService.get(id));
        }
        return "systemDictionary/input";
    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JsonResult saveOrUpdate(Systemdictionary systemdictionary){
        JsonResult result = new JsonResult();
        try {
            if(systemdictionary.getId() != null){
                systemdictionaryService.update(systemdictionary);
            }else{
                systemdictionaryService.save(systemdictionary);
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
                systemdictionaryService.delate(id);

            }
        }catch (Exception e){
            result.mark("删除操作失败");
        }

        return result;
    }


}
