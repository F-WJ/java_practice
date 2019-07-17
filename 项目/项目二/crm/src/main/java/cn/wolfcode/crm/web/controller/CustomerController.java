package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.domain.Customer;
import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.qo.CustomerObject;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.serivce.ICustomerService;
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
@RequestMapping("/customer")
public class CustomerController {



    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ISystemdictionaryService systemDictionaryService;

    @Autowired
    private ISystemdictionaryitemService systemdictionaryitemService;

    @Autowired
    private IEmployeeService employeeService;


    @RequiresPermissions(value = {"所有客户查询", "customer:list"}, logical = Logical.OR)
    @RequestMapping("/list")
    public String list(Model model, CustomerObject qo){
        //回显字典明细（客户工作，客户来源）
        List<Systemdictionaryitem> jobs = systemdictionaryitemService.listItemByParentSn("job");
        model.addAttribute("jobs", jobs);
        List<Systemdictionaryitem> sources = systemdictionaryitemService.listItemByParentSn("source");
        model.addAttribute("sources", sources);

        //回显市场经理和市场专员
        List<Employee> sellers = employeeService.listEmployeesByRoleSns("Market", "Market_Manager");
        model.addAttribute("sellers", sellers);

        //回显字典明细（交流方式）
        List<Systemdictionaryitem> communicationMethod = systemdictionaryitemService.listItemByParentSn("communicationMethod");
        model.addAttribute("communicationMethod", communicationMethod);


        //权限限制
        //检测用户角色是否超管和销售经理
        Employee currentEmpoyee = (Employee) SecurityUtils.getSubject().getPrincipal();
        if(!(currentEmpoyee.isAdmin() || SecurityUtils.getSubject().hasRole("Market_Manager"))){
            qo.setSellerId(currentEmpoyee.getId());
        }

        //查询
        PageInfo pageResult = customerService.query(qo);
        //共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);

        return "customer/list";
    }

    @RequiresPermissions(value = {"潜在客户查询", "customer:potentialList"}, logical = Logical.OR)
    @RequestMapping("/potentialList")
    public String potentialList(Model model, CustomerObject qo){

        //回显字典明细（客户工作，客户来源）
        List<Systemdictionaryitem> jobs = systemdictionaryitemService.listItemByParentSn("job");
        model.addAttribute("jobs", jobs);
        List<Systemdictionaryitem> sources = systemdictionaryitemService.listItemByParentSn("source");
        model.addAttribute("sources", sources);

        //回显市场经理和市场专员
        List<Employee> sellers = employeeService.listEmployeesByRoleSns("Market", "Market_Manager");
        model.addAttribute("sellers", sellers);

        //        //回显字典明细（交流方式）
        List<Systemdictionaryitem> communicationMethod = systemdictionaryitemService.listItemByParentSn("communicationMethod");
        model.addAttribute("communicationMethod", communicationMethod);


        //权限限制
        //检测用户角色是否超管和销售经理
        Employee currentEmpoyee = (Employee) SecurityUtils.getSubject().getPrincipal();
        if(!(currentEmpoyee.isAdmin() || SecurityUtils.getSubject().hasRole("Market_Manager"))){
            qo.setSellerId(currentEmpoyee.getId());
        }
        //设置只查询潜在用户
        qo.setStatus(0);

        //查询
        PageInfo pageResult = customerService.query(qo);
        //共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        return "customer/potential_list";
    }


    @RequiresPermissions(value = {"潜在客户添加/编辑", "customer:saveOrUpdate"}, logical = Logical.OR)
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JsonResult saveOrUpdate(Customer customer){
        JsonResult result = new JsonResult();
        try {
            if(customer.getId() != null){
                customerService.update(customer);
            }else{
                //添加录入此客户信息的人
                Employee employee = (Employee) SecurityUtils.getSubject().getPrincipal();
                customer.setInputUser_id(employee.getId());
                //添加录入时间
                customer.setInput_time(new Date());
                //设置客户默认状态(潜在客户)
                customer.setStatus(0);
                customerService.save(customer);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.mark("潜在客户添加/编辑操作失败");
        }
        return result;
    }

    @RequiresPermissions(value = {"潜在客户修改状态", "customer:updateStatus"}, logical = Logical.OR)
    @RequestMapping("/updateStatus")
    @ResponseBody
    public JsonResult updateStatus(Long customerId, Integer status){
        JsonResult result = new JsonResult();
        try {
            System.out.println(customerId);
            customerService.updateCustomerStatus(customerId, status);
        }catch (Exception e){
            e.printStackTrace();
            result.mark("潜在客户状态操作失败");
        }
        return result;
    }



    @RequiresPermissions(value = {"客户池查询", "customer:poollList"}, logical = Logical.OR)
    @RequestMapping("/poolList")
    public String poolList(Model model, CustomerObject qo){


        //回显字典明细（客户工作，客户来源）
        List<Systemdictionaryitem> jobs = systemdictionaryitemService.listItemByParentSn("job");
        model.addAttribute("jobs", jobs);
        List<Systemdictionaryitem> sources = systemdictionaryitemService.listItemByParentSn("source");
        model.addAttribute("sources", sources);

        //回显市场经理和市场专员
        List<Employee> sellers = employeeService.listEmployeesByRoleSns("Market", "Market_Manager");
        model.addAttribute("sellers", sellers);

        //回显字典明细（交流方式）
        List<Systemdictionaryitem> communicationMethod = systemdictionaryitemService.listItemByParentSn("communicationMethod");
        model.addAttribute("communicationMethod", communicationMethod);


        //权限限制
        //检测用户角色是否超管和销售经理
        Employee currentEmpoyee = (Employee) SecurityUtils.getSubject().getPrincipal();
        if(!(currentEmpoyee.isAdmin() || SecurityUtils.getSubject().hasRole("Market_Manager"))){
            qo.setSellerId(currentEmpoyee.getId());
        }
        //设置只查询客户池用户
        qo.setStatus(2);

        //查询
        PageInfo pageResult = customerService.query(qo);
        //共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        return "customer/pool_list";
    }


    @RequiresPermissions(value = {"失败用户查询", "customer:faillList"}, logical = Logical.OR)
    @RequestMapping("/failList")
    public String failList(Model model, CustomerObject qo){

        //回显字典明细（客户工作，客户来源）
        List<Systemdictionaryitem> jobs = systemdictionaryitemService.listItemByParentSn("job");
        model.addAttribute("jobs", jobs);
        List<Systemdictionaryitem> sources = systemdictionaryitemService.listItemByParentSn("source");
        model.addAttribute("sources", sources);

        //回显市场经理和市场专员
        List<Employee> sellers = employeeService.listEmployeesByRoleSns("Market", "Market_Manager");
        model.addAttribute("sellers", sellers);

        //回显字典明细（交流方式）
        List<Systemdictionaryitem> communicationMethod = systemdictionaryitemService.listItemByParentSn("communicationMethod");
        model.addAttribute("communicationMethod", communicationMethod);


        //权限限制
        //检测用户角色是否超管和销售经理
        Employee currentEmpoyee = (Employee) SecurityUtils.getSubject().getPrincipal();
        if(!(currentEmpoyee.isAdmin() || SecurityUtils.getSubject().hasRole("Market_Manager"))){
            qo.setSellerId(currentEmpoyee.getId());
        }
        //设置只查询失败用户
        qo.setStatus(3);

        //查询
        PageInfo pageResult = customerService.query(qo);
        //共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        return "customer/fail_list";
    }

    @RequiresPermissions(value = {"正式用户查询", "customer:formalList"}, logical = Logical.OR)
    @RequestMapping("/formalList")
    public String formalList(Model model, CustomerObject qo){

        //回显字典明细（客户工作，客户来源）
        List<Systemdictionaryitem> jobs = systemdictionaryitemService.listItemByParentSn("job");
        model.addAttribute("jobs", jobs);
        List<Systemdictionaryitem> sources = systemdictionaryitemService.listItemByParentSn("source");
        model.addAttribute("sources", sources);

        //回显市场经理和市场专员
        List<Employee> sellers = employeeService.listEmployeesByRoleSns("Market", "Market_Manager");
        model.addAttribute("sellers", sellers);

        //回显字典明细（交流方式）
        List<Systemdictionaryitem> communicationMethod = systemdictionaryitemService.listItemByParentSn("communicationMethod");
        model.addAttribute("communicationMethod", communicationMethod);


        //权限限制
        //检测用户角色是否超管和销售经理
        Employee currentEmpoyee = (Employee) SecurityUtils.getSubject().getPrincipal();
        if(!(currentEmpoyee.isAdmin() || SecurityUtils.getSubject().hasRole("Market_Manager"))){
            qo.setSellerId(currentEmpoyee.getId());
        }
        //设置只查询成功用户
        qo.setStatus(1);

        //查询
        PageInfo pageResult = customerService.query(qo);
        //共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        return "customer/formal_list";
    }

    @RequiresPermissions(value = {"流失用户查询", "customer:lossList"}, logical = Logical.OR)
    @RequestMapping("/lossList")
    public String lossList(Model model, CustomerObject qo){

        //回显字典明细（客户工作，客户来源）
        List<Systemdictionaryitem> jobs = systemdictionaryitemService.listItemByParentSn("job");
        model.addAttribute("jobs", jobs);
        List<Systemdictionaryitem> sources = systemdictionaryitemService.listItemByParentSn("source");
        model.addAttribute("sources", sources);

        //回显市场经理和市场专员
        List<Employee> sellers = employeeService.listEmployeesByRoleSns("Market", "Market_Manager");
        model.addAttribute("sellers", sellers);

        //回显字典明细（交流方式）
        List<Systemdictionaryitem> communicationMethod = systemdictionaryitemService.listItemByParentSn("communicationMethod");
        model.addAttribute("communicationMethod", communicationMethod);


        //权限限制
        //检测用户角色是否超管和销售经理
        Employee currentEmpoyee = (Employee) SecurityUtils.getSubject().getPrincipal();
        if(!(currentEmpoyee.isAdmin() || SecurityUtils.getSubject().hasRole("Market_Manager"))){
            qo.setSellerId(currentEmpoyee.getId());
        }
        //设置只查询成功用户
        qo.setStatus(4);

        //查询
        PageInfo pageResult = customerService.query(qo);
        //共享值
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        return "customer/loss_list";
    }




}
