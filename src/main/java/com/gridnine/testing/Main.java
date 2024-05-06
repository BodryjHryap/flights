package com.gridnine.testing;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Flight> flights = FlightBuilder.createFlights();

		FlightFilter departureFilterUntilNow = new DepartureFilterUntilNow();
		List<Flight> filteredFlightsByDepartureBeforeNow= departureFilterUntilNow.filterFlights(flights);
		System.out.println("Включен фильтр по вылету до текущего момента времени: "
				+ filteredFlightsByDepartureBeforeNow);

		FlightFilter arrivalFilterBeforeDeparture = new ArrivalFilterBeforeDeparture();
		List<Flight> filteredFlightsByArrivalBeforeDeparture = arrivalFilterBeforeDeparture.filterFlights(flights);
		System.out.println("Включен фильтр по дате прилета раньше даты вылета: "
				+ filteredFlightsByArrivalBeforeDeparture);

		FlightFilter filterOnTheGroundMoreThanTwoHours = new FilterOnTheGroundMoreThanTwoHours();
		List<Flight> filteredFlightsByGroundTimeMoreThanTwoHours = filterOnTheGroundMoreThanTwoHours.filterFlights(flights);
		System.out.println("Включен фильтр по общему времени на земле более двух часов: "
				+ filteredFlightsByGroundTimeMoreThanTwoHours);

		System.out.println("Исходные тестовые данные без фильтров:" + flights);
	}

}
