package cn.onedull.domain;

import java.math.BigDecimal;
import java.util.Date;

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
public class User {
	private Long id;
	//员工名
	private String name;
	//工资
	private BigDecimal salary;
	//入职时间
	private Date hiredate;
	
}
