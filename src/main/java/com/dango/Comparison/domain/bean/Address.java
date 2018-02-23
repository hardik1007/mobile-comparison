package com.dango.Comparison.domain.bean;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private Integer addressId;
	private String doorNumber;
	private String street;
	private String city;
	private String state;
	private Integer pinCode;


	@Override
	public String toString() {
		return doorNumber + ", " + street + ", " + city + ", " + state + " - "
				+ pinCode;
	}
}
