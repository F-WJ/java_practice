package cn.onedull.pmis.domain;

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
	//id
	private Long id;
	//商品名
	private String productName;
	//商品类型
	private Long dir_id;
	//商品零售价
	private BigDecimal salePrice;
	//商品供应商
	private String supplier;
	//商品品牌
	private String brand;
	//商品折扣
	private Double cutoff;
	//商品成本价
	private BigDecimal costPrice;
}
