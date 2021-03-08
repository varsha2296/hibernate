package com.xworkz.speaker.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity()
@Table(name="speaker_table")
public class SpeakerDTO implements Serializable {

	@Column(name = "SPEAKER_ID")
	@Id
	private int speakerID;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "COST")
	private double cost;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "SIZE")
	private String size;

	@Column(name = "WARRANTY")
	private boolean warranty;

	public SpeakerDTO() {
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	public SpeakerDTO(int speakerID, String brand, double cost, String color, String size, boolean warranty) {
		this.speakerID = speakerID;
		this.brand = brand;
		this.cost = cost;
		this.color = color;
		this.size = size;
		this.warranty = warranty;
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	public int getSpeakerID() {
		return speakerID;
	}

	public void setSpeakerID(int speakerID) {
		this.speakerID = speakerID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "SpeakerDTO [speakerID=" + speakerID + ", brand=" + brand + ", cost=" + cost + ", color=" + color
				+ ", size=" + size + ", warranty=" + warranty + "]";
	}
}
