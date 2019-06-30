import cn.wolfcode.ssm.domain.Department;
import cn.wolfcode.ssm.mapper.DepartmentMapper;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;
import cn.wolfcode.ssm.serivce.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DepartmentSerivceText {

    @Autowired
    private IDepartmentService departmentService;

    @Autowired
    private DepartmentMapper departmentMapper;


    @Test
    public void testDepartmentSerice(){
        System.out.println(departmentMapper);
        Department department = departmentService.get(1L);
        List<Department> all = departmentService.getAll();
        System.out.println(all);
        System.out.println(department);


    }

    @Test
    public void testPage(){
        System.out.println(departmentMapper);
        Department department = departmentService.get(1L);
        List<Department> all = departmentService.getAll();
        System.out.println(all);
        System.out.println(department);


    }

    //测试pageresult结果
    @Test
    public void test2(){
        //
        QueryObject qo = new QueryObject();
        PageResult pageResult = departmentService.query(qo);
        System.out.println(pageResult);

    }



}
