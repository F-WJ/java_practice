package cn.onedull.pmis.query;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductQueryObject extends QueryObject{
	private String productName;
	private BigDecimal minSalePrice;
	private BigDecimal maxSalePrice;
}
