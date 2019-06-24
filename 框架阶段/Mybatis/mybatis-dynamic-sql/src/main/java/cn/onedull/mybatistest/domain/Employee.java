package cn.onedull.mybatistest.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	private Long id;
	private String name;
	private String sn;
	private BigDecimal salary;
	private Long deptId;
}
