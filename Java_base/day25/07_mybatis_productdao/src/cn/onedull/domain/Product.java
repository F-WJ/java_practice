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
public class Product {
	private Long id;
	//商品名字
	private String productName;
	//价格
	private BigDecimal salePrice;
	//折扣
	private BigDecimal cutoff;
}
