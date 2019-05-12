package onedull_2.tmis.domain;

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
	private String productName;
	private Object salePrice;
	private Object cutoff;
	
}
