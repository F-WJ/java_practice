package cn.onedull.test;

import java.math.BigDecimal;
import java.util.Date;

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
public class User {
	private Long id;
	private String name;
	private BigDecimal salary;
	private Date hiredate;
}
