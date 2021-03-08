package com.xworkz.flight.service;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dto.FlightDTO;

public class FlightServiceImpl implements FlightService {

	private FlightDAO flightDAO;

	public FlightServiceImpl(FlightDAO flightDAO) {
		this.flightDAO = flightDAO;
	}

	@Override
	public boolean validateAndSaveFlight(FlightDTO dto) {
		boolean validData = false;

		// id validation
		if (dto != null) {
			System.out.println("DTO is not null,validate the field");
			int flightId = dto.getFlightId();
			if (flightId > 0) {
				System.out.println("Flight id is valid");
				validData = true;
			} else {
				System.out.println("Flight id is not valid");
				validData = false;
			}
		}

		// name validation
		if (validData) {
			String name = dto.getFlightName();
			if (name != null && !name.isEmpty() && !name.contains(" ")) {
				System.out.println("name is valid");
				validData = true;
			} else {
				System.out.println("name is invalid");
				validData = false;
			}
		}

		// from location validation
		if (validData) {
			String fromLocation = dto.getFromLocation();
			if (fromLocation != null && !fromLocation.isEmpty() && !fromLocation.contains(" ")) {
				System.out.println("from location is valid");
				validData = true;
			} else {
				System.out.println("from location is invalid");
				validData = false;
			}
		}
		// to location validation
		if (validData) {
			String toLocation = dto.getToLocation();
			if (toLocation != null && !toLocation.isEmpty() && !toLocation.contains(" ")) {
				System.out.println("to location is valid");
				validData = true;
			} else {
				System.out.println("to location is invalid");
				validData = false;
			}
		}
		// total seats validation
		if (validData) {
			int totalSeats = dto.getTotalSeats();
			if (totalSeats > 0 && totalSeats <= 10) {
				System.out.println("total seats is valid");
				validData = true;
			} else {
				System.out.println("total seats is invalid");
				validData = false;
			}
		}
		// price validation
		if (validData) {
			double price = dto.getPrice();
			if (price > 0) {
				System.out.println("price is valid");
				validData = true;
			} else {
				System.out.println("price is invalid");
				validData = false;
			}
		}
		if (validData) {
			System.out.println("Data is valid invoke flight dao");
			flightDAO.saveFlight(dto);
		} else {
			System.out.println("Flight dto is null,invalid data");
		}
		return false;
	}

}
