package com.xworkz.flight.service;

import com.xworkz.flight.dto.FlightDTO;

public interface FlightService {

	public boolean validateAndSaveFlight(FlightDTO dto);
}
