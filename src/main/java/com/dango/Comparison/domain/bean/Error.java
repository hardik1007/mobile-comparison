package com.dango.Comparison.domain.bean;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Error {
	private Integer statusCode;
	private String message;


}
