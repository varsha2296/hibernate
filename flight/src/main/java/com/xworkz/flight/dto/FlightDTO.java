package com.xworkz.flight.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@Table(name = "flight_table")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class FlightDTO implements Serializable {

	@Column(name = "FLIGHTID")
	@Id
	private int flightId;

	@Column(name = "FLIGHTNAME")
	private String flightName;

	@Column(name = "FROMLOCATION")
	private String fromLocation;

	@Column(name = "TOLOCATION")
	private String toLocation;

	@Column(name = "TOTALSEATS")
	private int totalSeats;

	@Column(name = "PRICE")
	private double price;
}
