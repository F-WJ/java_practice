package cn.wolfcode.crm.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class Role {
    private Long id;

    private String name;

    private String sn;

    //保存权限
    private List<Permission> permissions = new ArrayList<Permission>();


}