package com.diplomski.bookingkidsparty.app.util;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.diplomski.bookingkidsparty.app.model.ServiceOffer;

@Component
public class OfferValidate {
	
	public void dateValidate(ServiceOffer serviceOffer) throws Exception{
		if(serviceOffer.getStartDate().isBefore(LocalDate.now())) {
			throw new Exception("Invalid start date");
		}
		if(serviceOffer.getEndDate().isBefore(serviceOffer.getEndDate())) {
			throw new Exception("End date must be after start date");
		}
	}
	
}
