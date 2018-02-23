package com.dango.Comparison.domain.entity;

import lombok.*;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "infyretail_order")
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Integer orderId;
	@Column(name = "order_date")
	private Calendar orderDate;
	@Column(name = "order_amount")
	private Double orderAmount;
	@Column(name = "no_of_items")
	private Integer noOfItems;
	@Column(name = "order_type")
	private String orderType;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ORDER_USER_ID")
	private UserEntity orderUser;



}
