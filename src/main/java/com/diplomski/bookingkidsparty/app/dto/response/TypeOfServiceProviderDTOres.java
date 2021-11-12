package com.diplomski.bookingkidsparty.app.dto.response;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TypeOfServiceProviderDTOres {

	private UUID id;
	private String name;
	
}
