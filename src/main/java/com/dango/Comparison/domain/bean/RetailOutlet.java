package com.dango.Comparison.domain.bean;

import lombok.*;

import java.util.List;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RetailOutlet {

	private Integer retailOutletId;
	private String retailOutletName;
	private String city;
	private List<Offers> offers;

}
