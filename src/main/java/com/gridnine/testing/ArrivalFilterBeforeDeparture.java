package com.gridnine.testing;

        import java.util.List;
        import java.util.stream.Collectors;

/**
 * Реализация фильтрации по дате прилета раньше даты вылета
 */

public class ArrivalFilterBeforeDeparture implements FlightFilter{
    @Override
    public List<Flight> filterFlights(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate())))
                .collect(Collectors.toList());
    }
}