package cn.wolfcode.ssm.qo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EmployeeQueryObject extends QueryObject {
    //关键字
    private String keyword;
    //部门id
    private Long deptId = -1L;

}
