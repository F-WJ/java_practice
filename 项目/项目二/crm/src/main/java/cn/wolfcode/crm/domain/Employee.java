package cn.wolfcode.crm.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Employee {
    private Long id;

    private String name;
    private String password;

    private String email;

    private Integer age;

    private boolean admin;

    private Long deptId;

    //保存部门
    private Department dept;

    //保存角色
    private List<Role> roles = new ArrayList<Role>();

}