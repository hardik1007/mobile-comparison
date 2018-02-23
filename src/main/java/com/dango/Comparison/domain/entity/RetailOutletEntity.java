package com.dango.Comparison.domain.entity;

import lombok.*;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "INFYRETAIL_RETAILOUTLET")
public class RetailOutletEntity {
	@Id
	@Column(name = "retailoutlet_id")
	private Integer retailOutletId;
	@Column(name = "retailoutlet_name")
	private String retailOutletName;
	@Column(name = "city")
	private String city;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "INFYRETAIL_RETAILOUTLET_OFFER", joinColumns = @JoinColumn(name = "retailOutlet_Id", referencedColumnName = "retailoutlet_Id"), inverseJoinColumns = @JoinColumn(name = "offer_Id", referencedColumnName = "offer_id"))
	private List<OfferEntity> offers;



}
