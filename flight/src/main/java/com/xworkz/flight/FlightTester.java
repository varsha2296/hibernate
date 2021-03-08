package com.xworkz.flight;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class FlightTester {

	public static void main(String[] args) {
		FlightDAO flightDAO = new FlightDAOImpl();

		@SuppressWarnings("unused")
		FlightDTO flightDTO = new FlightDTO(1, "IndiGo", "Delhi", "Bangalore", 3, 9000);

		//flightDAO.saveFlight(flightDTO);

		//flightDAO.readFlight(1);

		//flightDAO.updateFlight(1);

		flightDAO.deleteFlight(1);
	}

}
