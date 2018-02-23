package com.dango.Comparison.domain.entity;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "infyretail_order_products")
public class OrderProductEntity {
	@EmbeddedId
	PrimaryKey primaryKey;
	private Integer quantity;



}
