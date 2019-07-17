package cn.wolfcode.crm.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Permission {
    private Long id;

    private String name;

    private String expression;


}