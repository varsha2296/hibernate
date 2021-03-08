package com.xworkz.flight.dao;

import com.xworkz.flight.dto.FlightDTO;

public interface FlightDAO {

	public void saveFlight(FlightDTO flightDTO);

	public void readFlight(int flightId);

	public void updateFlight(int flightId);

	public void deleteFlight(int flightId);
}
