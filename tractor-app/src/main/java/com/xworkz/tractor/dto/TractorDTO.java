package com.xworkz.tractor.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tractor_table")
public class TractorDTO implements java.io.Serializable {

	@Column(name = "TRACTOR_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tractorID;

	@Column(name = "MODEL")
	private String model;

	@Column(name = "COST")
	private double cost;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "FUELCAPACITY")
	private double fuelCapacity;

	@Column(name = "LOADCAPACITY")
	private int loadCapacity;

	@Column(name = "MILAGE")
	private int milage;

	public TractorDTO() {
		super();
	}

	public TractorDTO(String model, double cost, String color, double fuelCapacity, int loadCapacity, int milage) {
		super();
		this.model = model;
		this.cost = cost;
		this.color = color;
		this.fuelCapacity = fuelCapacity;
		this.loadCapacity = loadCapacity;
		this.milage = milage;
	}

	public int getTractorID() {
		return tractorID;
	}

	public void setTractorID(int tractorID) {
		this.tractorID = tractorID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "TractorDTO [model=" + model + ", color=" + color + ", cost=" + cost + ", fuelCapacity=" + fuelCapacity
				+ ", loadCapacity=" + loadCapacity + ", milage=" + milage + "]";
	}

}
