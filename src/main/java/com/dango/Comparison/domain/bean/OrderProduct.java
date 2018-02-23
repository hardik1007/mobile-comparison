package com.dango.Comparison.domain.bean;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderProduct {
	private Integer productId;
	private Integer quantity;

}
