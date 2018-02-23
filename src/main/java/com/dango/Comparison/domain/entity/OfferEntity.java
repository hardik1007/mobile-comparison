package com.dango.Comparison.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "INFYRETAIL_OFFERS")
public class OfferEntity {

	@Id
	@Column(name = "offer_id")
	private Integer offerId;
	@Column(name = "offer_name")
	private String offerName;
	@Column(name = "offer_month")
	private String offerMonth;


}
