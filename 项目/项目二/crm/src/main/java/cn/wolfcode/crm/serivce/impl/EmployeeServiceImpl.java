package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.mapper.EmployeeMapper;
import cn.wolfcode.crm.qo.EmployeeQueryObject;
import cn.wolfcode.crm.qo.PageResult;
import cn.wolfcode.crm.serivce.IEmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
    }

    @Override
    public void save(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void delate(Long id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Employee employee) {
    employeeMapper.updateByPrimaryKey(employee);
    }

    @Override
    public Employee get(Long id) {
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = employeeMapper.selectAll();
        return employees;

    }

    @Override
    public Employee login(String username, String password) {
        return employeeMapper.login(username, password);
    }

    @Override
    public PageInfo<Employee> query(EmployeeQueryObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize());
        List<Employee> list = employeeMapper.queryForList(qo);
        return new PageInfo<>(list);
    }

    @Override
    public void relation(Long employeeId, Long roleId) {
        employeeMapper.relation(employeeId, roleId);
    }

    @Override
    public List<Role> selectRelation(Long id) {
        List<Role> roles = employeeMapper.selectRelation(id);
        return roles;
    }

    @Override
    public void delrelation(Long id) {
        employeeMapper.delrelation(id);
    }

    //保存用户session
    public void loginSession(String username, String password, Employee employee){
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        //获取session值
        HttpSession session = ((ServletRequestAttributes) requestAttributes).getRequest().getSession();

        //设置用户信息session值
        session.setAttribute("EMPLOYEE_IN_SESSION", employee);



    }


    //导入用户数据
    @Override
    public void importXls(MultipartFile file) throws IOException {
        //创建excel
        HSSFWorkbook excel = new HSSFWorkbook(file.getInputStream());
        //获取表
        HSSFSheet sheet = excel.getSheet("员工信息表");
        //获取最后一行行数
        int lastRowNum = sheet.getLastRowNum();
        //遍历行
        for(int i = 0; i < lastRowNum; i++){
            HSSFRow row = sheet.getRow(i + 1);
            String name = row.getCell(0).getStringCellValue();
            String email = row.getCell(1).getStringCellValue();
            HSSFCell cell = row.getCell(2);
            DataFormatter formatter = new DataFormatter();
            String str = formatter.formatCellValue(cell);
            int age = Double.valueOf(str).intValue();

            Employee employee = new Employee();
            employee.setName(name);
            employee.setEmail(email);
//            employee.setAge(Integer.valueOf(age));
            employee.setAge(age);
            employee.setPassword(new Md5Hash("1", name).toString());
            employeeMapper.insert(employee);


        }
    }

    @Override
    public HSSFWorkbook exportXls() {
        //获取所有用户数据（数据库）
        List<Employee> employees = employeeMapper.selectAll();
        //调用poi api， 产生excel数据
        //创建excel文档
        HSSFWorkbook excel = new HSSFWorkbook();
        //设置sheet名字
        HSSFSheet sheet = excel.createSheet("员工信息表");
        //设置首行
        HSSFRow row = sheet.createRow(0);
        //设置首列
        row.createCell(0).setCellValue("用户名");
        row.createCell(1).setCellValue("邮箱");
        row.createCell(2).setCellValue("年龄");
        //导入用户信息
        for(int i = 0; i < employees.size(); i++){
            HSSFRow row1 = sheet.createRow(i + 1);
            row1.createCell(0).setCellValue(employees.get(i).getName() != null ? employees.get(i).getName(): "");
            row1.createCell(1).setCellValue(employees.get(i).getEmail() != null ? employees.get(i).getEmail(): "");
            row1.createCell(2).setCellValue(employees.get(i).getAge() != null ? employees.get(i).getAge().toString(): "");

        }

        return excel;
    }

    @Override
    public List<Employee> listEmployeesByRoleSns(String... sn) {
        List<Employee> employees = employeeMapper.listEmployeesByRoleSns(sn);
        return employees;
    }


}
