package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.domain.CustomerTraceHistory;
import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.qo.CustomerTraceHistoryObject;
import cn.wolfcode.crm.serivce.ICustomerTraceHistoryService;
import cn.wolfcode.crm.serivce.IEmployeeService;
import cn.wolfcode.crm.serivce.ISystemdictionaryService;
import cn.wolfcode.crm.serivce.ISystemdictionaryitemService;
import cn.wolfcode.crm.util.JsonResult;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/customerTraceHistory")
public class CustomerTraceHistoryController {

    @Autowired
    private ICustomerTraceHistoryService customerTraceHistoryService;

    @Autowired
    private ISystemdictionaryitemService systemdictionaryitemService;


    @RequiresPermissions(value = {"跟进历史查询", "customerTraceHistory:list"}, logical = Logical.OR)
    @RequestMapping("/list")
    public String potentialList(Model model, CustomerTraceHistoryObject qo){

//        //回显字典明细（交流方式）
        List<Systemdictionaryitem> communicationMethod = systemdictionaryitemService.listItemByParentSn("communicationMethod");
        model.addAttribute("communicationMethod", communicationMethod);





        //权限限制
        //检测用户角色是否超管和销售经理
        Employee currentEmpoyee = (Employee) SecurityUtils.getSubject().getPrincipal();
        if(!(currentEmpoyee.isAdmin() || SecurityUtils.getSubject().hasRole("Market_Manager"))){
            qo.setSellerId(currentEmpoyee.getId());
        }

        //查询
        PageInfo pageResult = customerTraceHistoryService.query(qo);
        //共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        return "customerTraceHistory/list";
    }


    @RequiresPermissions(value = {"跟进历史添加/编辑", "customerTraceHistory:saveOrUpdate"}, logical = Logical.OR)
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JsonResult saveOrUpdate(CustomerTraceHistory customerTraceHistory){
        JsonResult result = new JsonResult();
        try {
            if(customerTraceHistory.getId() != null){
                customerTraceHistoryService.update(customerTraceHistory);
            }else{
                System.out.println(customerTraceHistory);
                //添加记录人
                Employee employee = (Employee) SecurityUtils.getSubject().getPrincipal();
                customerTraceHistory.setInputUserId(employee.getId());
                //添加创建时间
                customerTraceHistory.setInputTime(new Date());
                customerTraceHistoryService.save(customerTraceHistory);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.mark("跟进历史添加/编辑操作失败");
        }
        return result;
    }






}
