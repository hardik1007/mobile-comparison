package com.dango.Comparison.domain.bean;

import lombok.*;

import java.util.Calendar;
import java.util.Set;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private Integer orderId;
	private Calendar orderDate;
	private Double orderAmount;
	private Integer noOfItems;
	private String orderType;
	private User orderUser;
	private Set<OrderProduct> orderProducts;
	// added
	private String message;


}
