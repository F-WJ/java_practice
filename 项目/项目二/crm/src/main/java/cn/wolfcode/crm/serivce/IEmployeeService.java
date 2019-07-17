package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.qo.EmployeeQueryObject;
import cn.wolfcode.crm.qo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IEmployeeService {
    //保存
    void save(Employee employee);
    //删除
    void delate(Long id);
    //修改
    void update(Employee employee);
    //查单个
    Employee get(Long id);
    //查多个
    List<Employee> getAll();

    //查用户
    Employee login(String username, String password);

    PageInfo<Employee> query(EmployeeQueryObject qo);

    void relation(Long employeeId, Long roleId);

    List<Role> selectRelation(Long id);

    void delrelation(Long id);

    void loginSession(String username, String password, Employee employee);

    void importXls(MultipartFile file) throws IOException;

    HSSFWorkbook exportXls();

    List<Employee> listEmployeesByRoleSns(String... sn);
}
