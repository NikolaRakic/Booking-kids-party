package com.diplomski.bookingkidsparty.app.util;

import static java.time.temporal.ChronoUnit.MINUTES;

import org.springframework.stereotype.Component;

import com.diplomski.bookingkidsparty.app.model.Reservation;
import com.diplomski.bookingkidsparty.app.model.enums.TypeOfServiceProvider;

@Component
public class Price {

	public Long getPrice(Reservation reservation) {
		long minutes = MINUTES.between(reservation.getStartTime(), reservation.getEndTime());
		double hours = (double) minutes / 60;

		long totalPrice;
		if (reservation.getServiceOffer().getServiceProvider()
				.getTypeOfServiceProvider() == TypeOfServiceProvider.KETERING) {
			totalPrice = Math.round(reservation.getNumberOfKids() * reservation.getServiceOffer().getPricePerKid()
					+ reservation.getNumberOfAdults() * reservation.getServiceOffer().getPricePerAdult());
		} else {
			totalPrice = Math.round(reservation.getServiceOffer().getPricePerHour() * hours);
		}
		return totalPrice;
	}
}
