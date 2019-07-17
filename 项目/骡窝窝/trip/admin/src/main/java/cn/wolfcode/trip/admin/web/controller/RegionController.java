package cn.wolfcode.trip.admin.web.controller;


import cn.wolfcode.trip.core.domain.Region;
import cn.wolfcode.trip.core.service.IRegionService;
import cn.wolfcode.trip.core.util.JsonResult;
import javafx.scene.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping("region")
public class RegionController {

    @Autowired
    private IRegionService regionService;

    @RequestMapping("/list")
    public String list(Model model) {



        return "region/list_json";

    }


    @RequestMapping("/listByParentId")
    @ResponseBody
    public List listByParentId(Long parentId) {
//        1.获取地区数据（sql语句）
            List<Region> list = regionService.listByParentId(parentId);
//        2.修改获取json数据的格式，装换成treeview需要的格式（map）
        ArrayList result = new ArrayList<>();
        for(Region region: list){
            HashMap<String, Object> map = new HashMap<>();
            map.put("id", region.getId());
            map.put("text", region.getName());
            map.put("result", region.result());
            map.put("states", region.getState());
            if(region.getState() == 1){
                map.put("tags", new String[]{"推荐"});
            }
            map.put("lazyLoad", true);
            result.add(map);
        }
//        3.返回结果
        return result;

    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JsonResult saveOrUpdate(Region region){
        JsonResult result = new JsonResult();
        try {
            if(region.getId() == null){
                //保存
                regionService.save(region);
            }else{
                //修改
                regionService.update(region);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.mark("操作失败");
        }
        return result;
    }

    @RequestMapping("/changeState")
    @ResponseBody
    public JsonResult changeState(Long id, Integer state){
        JsonResult result = new JsonResult();
        try{
            regionService.updateState(id, state);
        }catch (Exception e){
            e.printStackTrace();
            result.mark("操作失败");
        }
        return result;
    }


}
