package com.dango.Comparison.domain.bean;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private Integer productId;
	private String name;
	private String category;
	private String brand;
	private Double cost;
	private Integer quantity;
	private Float discount;
	private Double sellingPrice;
	private String specification;
	private User supplier;
	// added
	private String range;
	private String message;
	private Boolean isClicked;



}
