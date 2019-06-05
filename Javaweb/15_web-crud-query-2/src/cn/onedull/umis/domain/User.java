package cn.onedull.umis.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
	private Long id;
	private String name;
	//工资
	private BigDecimal salary;
	//入职时间
	private Date hiredate;
}
