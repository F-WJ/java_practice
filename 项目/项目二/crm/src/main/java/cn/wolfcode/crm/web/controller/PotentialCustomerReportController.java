package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.qo.PotenialCustomerReportObject;
import cn.wolfcode.crm.serivce.IPotenialCustomerReportService;
import com.alibaba.fastjson.JSON;
import com.sun.javafx.collections.MappingChange;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customerReport")
public class PotentialCustomerReportController {

    @Autowired
    private IPotenialCustomerReportService potenialCustomerReportService;

    @RequiresPermissions(value = {"潜在用户报表", "customerReport:list"}, logical = Logical.OR)
    @RequestMapping("/list")
    public String list(Model model, @ModelAttribute("qo") PotenialCustomerReportObject qo){
        List<Map<String, Object>> datas = potenialCustomerReportService.listPotentialCustomerData(qo);
        model.addAttribute("datas", datas);
        System.out.println(datas);

        return "customerReport/list";
    }


    @RequestMapping("/chartByPie")
    public String chartByPie(Model model, @ModelAttribute("qo")PotenialCustomerReportObject qo){

        List<Map<String, Object>> datas = potenialCustomerReportService.listPotentialCustomerData(qo);

        List<Map<String, Object>> pieData = new ArrayList<>();
        ArrayList<String> sellers = new ArrayList<>();

        for(Map<String, Object> data : datas){
            HashMap<String, Object> pie = new HashMap<>();
            pie.put("value", data.get("total"));
            pie.put("name", data.get("groupType"));
            sellers.add(data.get("groupType").toString());
            pieData.add(pie);
        }
        System.out.println(pieData);
        System.out.println(JSON.toJSONString(pieData));
        System.out.println(JSON.toJSONString(sellers));

        model.addAttribute("pieData", JSON.toJSONString(pieData));
        model.addAttribute("sellers", JSON.toJSONString(sellers));

        return "customerReport/byPie";
    }


    @RequestMapping("/chartByBar")
    public String chartByBar(Model model, @ModelAttribute("qo")PotenialCustomerReportObject qo){

        List<Map<String, Object>> datas = potenialCustomerReportService.listPotentialCustomerData(qo);

        List<Map<String, Object>> pieData = new ArrayList<>();
        ArrayList<String> sellers = new ArrayList<>();
        ArrayList<Integer> totals = new ArrayList<>();

        for(Map<String, Object> data : datas){
            HashMap<String, Object> pie = new HashMap<>();
            pie.put("value", data.get("total"));
            pie.put("name", data.get("groupType"));
            sellers.add(data.get("groupType").toString());
            totals.add(Integer.valueOf(data.get("total").toString()));
            pieData.add(pie);
        }
        System.out.println(pieData);
        System.out.println(JSON.toJSONString(pieData));
        System.out.println(JSON.toJSONString(sellers));

        model.addAttribute("totals", JSON.toJSONString(totals));
        model.addAttribute("sellers", JSON.toJSONString(sellers));

        return "customerReport/byBar";
    }



}
