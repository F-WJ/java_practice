package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.domain.Systemdictionary;
import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.qo.SystemdictionaryitemObject;
import cn.wolfcode.crm.serivce.ISystemdictionaryService;
import cn.wolfcode.crm.serivce.ISystemdictionaryitemService;
import cn.wolfcode.crm.util.JsonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/systemDictionaryItem")
public class SystemDictionaryItemController {



    @Autowired
    private ISystemdictionaryitemService systemdictionaryitemService;

    @Autowired
    private ISystemdictionaryService systemdictionaryService;



    @RequestMapping("/list")
    public String list(Model model, SystemdictionaryitemObject qo){
//        查询所有字典
        List<Systemdictionary> dics = systemdictionaryService.getAll();
        //获取当前字典明细信息
        PageInfo pageResult = systemdictionaryitemService.query(qo);

//        共享值

        model.addAttribute("pageResult", pageResult);
        model.addAttribute("dics", dics);
        model.addAttribute("qo", qo);
        return "systemDictionary/item";
    }

    @RequestMapping("/input")
    public String input(Model model, Long id){
        if(id != null){
            model.addAttribute("dept", systemdictionaryitemService.get(id));
        }
        return "systemDictionaryItem/input";
    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JsonResult saveOrUpdate(Systemdictionaryitem systemdictionaryitem){
        JsonResult result = new JsonResult();
        try {
            if(systemdictionaryitem.getId() != null){
                systemdictionaryitemService.update(systemdictionaryitem);
            }else{
                systemdictionaryitemService.save(systemdictionaryitem);
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
                systemdictionaryitemService.delate(id);

            }
        }catch (Exception e){
            result.mark("删除操作失败");
        }

        return result;
    }


}
