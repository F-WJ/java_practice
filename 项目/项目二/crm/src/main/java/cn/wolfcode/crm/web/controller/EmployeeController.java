package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.domain.Department;
import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.mapper.EmployeeMapper;
import cn.wolfcode.crm.qo.EmployeeQueryObject;
import cn.wolfcode.crm.serivce.IDepartmentService;
import cn.wolfcode.crm.serivce.IEmployeeService;
import cn.wolfcode.crm.serivce.IRoleService;
import cn.wolfcode.crm.util.JsonResult;
import com.github.pagehelper.PageInfo;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import sun.rmi.runtime.Log;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDepartmentService departmentService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private EmployeeMapper employeeMapper;


    @RequiresPermissions(value = {"员工列表", "employee:list"}, logical = Logical.OR)
    @RequestMapping("/list")
    public String list(Model model, EmployeeQueryObject qo){
//        查询
        PageInfo pageResult = employeeService.query(qo);
        List<Employee> employees = pageResult.getList();
        //添加部门信息到用户上
        for(Employee list: employees){
            Long deptId = list.getDeptId();
            Department department = departmentService.get(deptId);
            list.setDept(department);
        }


//        回显操作
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("qo", qo);
        model.addAttribute("depts", departmentService.getAll());
        return "employee/list";
    }

    @RequiresPermissions(value = {"员工编辑", "employee:input"}, logical = Logical.OR)
    @RequestMapping("/input")
    public String input(Model model, Long id){
        if(id != null){

            Employee employee = employeeService.get(id);
            //回显部门信息
            Department department = departmentService.get(employee.getDeptId());
            employee.setDept(department);
            //回显当前用户角色
            //通过用户id查找角色关联数据
            List<Role> roles = employeeService.selectRelation(id);
            //绑定到当前employee的roles上
            if(roles != null){
                employee.setRoles(roles);
            }
            model.addAttribute("employee", employee);
        }

        model.addAttribute("depts", departmentService.getAll());
        model.addAttribute("roles", roleService.getAll());
        return "employee/input";
    }

    @RequiresPermissions(value = {"员工添加/更新", "employee:saveOrUpdate"}, logical = Logical.OR)
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Employee employee, Long[] ids){
        //保存所有信息到数据库上
        //保存部门id
        employee.setDeptId(employee.getDept().getId());
        if(employee.getId() != null){
            employeeService.update(employee);
            //绑定角色到用户上（为了以后的查询模块）
            if(ids != null){
                //删除关联角色
                employeeService.delrelation(employee.getId());
                for(Long roleId : ids){
                    //获取用户id
                    Long employeeId = employee.getId();
                    //保存到关联表上
                    employeeService.relation(employeeId, roleId);
                }
            }

        }else{
            //密码MD5加密
            String password = new Md5Hash(employee.getPassword(), employee.getName()).toString();
            employee.setPassword(password);
            employeeService.save(employee);
            //绑定角色到用户上（为了以后的查询模块）
            if(ids != null){
                for(Long roleId : ids){
                    //获取用户id
                    Long employeeId = employee.getId();
                    //保存到关联表上
                    employeeService.relation(employeeId, roleId);
                }
            }
        }
        return "redirect:/employee/list.do";

    }

    @RequiresPermissions(value = {"员工删除", "employee:delete"}, logical = Logical.OR)
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Long id){
        JsonResult result = new JsonResult();
            try{
                //删除关联角色
                employeeService.delrelation(id);
                employeeService.delate(id);
            }catch (Exception e){
                e.printStackTrace();
                result.mark("删除操作失败，请重试");
            }
        return result;
    }

    @RequiresPermissions(value = {"员工导出", "employee:exportXls"}, logical = Logical.OR)
    @RequestMapping("/exportXls")
    public void exportXls(HttpServletResponse response) throws Exception {
        //将数据导出到excel
        HSSFWorkbook  excel = employeeService.exportXls();
        //把excel数据导出到页面
        response.setHeader("Content-Disposition", "attachment;filename=employee_import.xls");
        excel.write(response.getOutputStream());

    }

    @RequiresPermissions(value = {"员工导入", "employee:importXls"}, logical = Logical.OR)
    @RequestMapping("/importXls")
    @ResponseBody
    public JsonResult importXls(MultipartFile file) {
        JsonResult result = new JsonResult();
        try{
            employeeService.importXls(file);
        }catch (Exception e){
            e.printStackTrace();
            result.mark("导入失败，请重试");
        }
        return result;
    }


    //批量删除
    @RequiresPermissions(value = {"员工导入", "employee:importXls"}, logical = Logical.OR)
    @RequestMapping("/batchDelete")
    @ResponseBody
    public JsonResult batchDelete(Long[] ids){
        JsonResult result = new JsonResult();
        try{
            //删除关联角色
            employeeMapper.batchdelrelation(ids);
            employeeMapper.batchDelate(ids);
        }catch (Exception e){
            e.printStackTrace();
            result.mark("删除操作失败，请重试");
        }
        return result;
    }


}
