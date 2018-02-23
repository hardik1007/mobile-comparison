package com.dango.Comparison.domain.entity;

import lombok.*;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
@Embeddable
public class PrimaryKey implements Serializable {
	@Column(name = "order_id")
	private Integer orderId;
	@Column(name = "product_id")
	private Integer productId;


}
