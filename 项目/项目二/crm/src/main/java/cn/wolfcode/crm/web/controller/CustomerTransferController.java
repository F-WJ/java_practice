package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.domain.CustomerTransfer;
import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.qo.CustomerTransferObject;
import cn.wolfcode.crm.serivce.ICustomerService;
import cn.wolfcode.crm.serivce.ICustomerTransferService;
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
@RequestMapping("/customerTransfer")
public class CustomerTransferController {

    @Autowired
    private ICustomerTransferService customerTransferService;

    @Autowired
    private ISystemdictionaryitemService systemdictionaryitemService;

    @Autowired
    private ICustomerService customerService;


    @RequiresPermissions(value = {"移交历史查询", "customerTransfer:list"}, logical = Logical.OR)
    @RequestMapping("/list")
    public String potentialList(Model model, CustomerTransferObject qo){


        //权限限制
        //检测用户角色是否超管和销售经理
        Employee currentEmpoyee = (Employee) SecurityUtils.getSubject().getPrincipal();
        if(!(currentEmpoyee.isAdmin() || SecurityUtils.getSubject().hasRole("Market_Manager"))){
            qo.setSellerId(currentEmpoyee.getId());
        }

        //查询
        PageInfo pageResult = customerTransferService.query(qo);
        //共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        return "customerTransfer/list";
    }


    @RequiresPermissions(value = {"移交历史添加/编辑", "customerTransfer:saveOrUpdate"}, logical = Logical.OR)
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JsonResult saveOrUpdate(CustomerTransfer customerTransfer){
        JsonResult result = new JsonResult();
        try {
            if(customerTransfer.getId() != null){
                customerTransferService.update(customerTransfer);
            }else{
                System.out.println(customerTransfer);
                //添加记录人
                Employee employee = (Employee) SecurityUtils.getSubject().getPrincipal();
                customerTransfer.setOperatorId(employee.getId());
                //添加创建时间
                customerTransfer.setOperateTime(new Date());
                //修改客户新的销售员(通过客户id和新销售员id，来修改值)
                customerService.updateSellerById(customerTransfer.getCustomerId(), customerTransfer.getNewsellerId());
                //默认设置到潜在用户

//                //保存移交信息
                customerTransferService.save(customerTransfer);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.mark("移交历史添加/编辑操作失败");
        }
        return result;
    }

    @RequiresPermissions(value = {"吸纳", "customerTransfer:absorb"}, logical = Logical.OR)
    @RequestMapping("/absorb")
    @ResponseBody
    public JsonResult absorb(CustomerTransfer customerTransfer){
        JsonResult result = new JsonResult();
        try {
            if(customerTransfer.getId() != null){
                customerTransferService.update(customerTransfer);
            }else{
                System.out.println(customerTransfer);
                //添加记录人
                Employee employee = (Employee) SecurityUtils.getSubject().getPrincipal();
                customerTransfer.setOperatorId(employee.getId());
                //添加创建时间
                customerTransfer.setOperateTime(new Date());
                //修改客户新的销售员(通过客户id和新销售员id，来修改值)
                customerService.updateSellerById(customerTransfer.getCustomerId(), employee.getId());
                //默认设置到潜在用户

//                //保存移交信息
                customerTransfer.setNewsellerId(employee.getId());
                customerTransferService.save(customerTransfer);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.mark("吸纳操作失败");
        }
        return result;
    }







}
