package com.gridnine.testing;

import java.util.List;

/**
 * Интерфейс для модуля фильтрации перелетов
 */

public interface FlightFilter {
    List<Flight> filterFlights(List<Flight> flights);
}