package cn.onedull.umis.query;

import java.math.BigDecimal;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserQueryObject extends QueryObject{
	//名字
	private String userName;
	//最少值
	private BigDecimal minSalary;
	//最大值
	private BigDecimal maxSalary;
	
	
}
