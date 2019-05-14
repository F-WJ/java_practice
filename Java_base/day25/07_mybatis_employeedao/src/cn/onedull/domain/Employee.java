package cn.onedull.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	private Long id;
	//名字
	private String name;
	//工资
	private BigDecimal salary;
}
