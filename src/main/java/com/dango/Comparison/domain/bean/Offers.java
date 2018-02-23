package com.dango.Comparison.domain.bean;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Offers {

	private Integer offerId;
	private String offerName;
	private String month;



}
