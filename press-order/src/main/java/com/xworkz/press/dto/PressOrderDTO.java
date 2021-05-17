package com.xworkz.press.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "press_order")
@NamedQueries({
		@NamedQuery(query = "select order from PressOrderDTO order where order.orderFrom=:orderFrom", name = "searchByOrderFrom") })
@Entity
public class PressOrderDTO {

	public PressOrderDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "ORDER_FROM")
	private String orderFrom;

	@Column(name = "PHONE_NUMBER")
	private long phoneNo;

	@Column(name = "CARD_TYPE")
	private String cardType;

	@Column(name = "NO_OF_COPIES")
	private int noOfCopies;

	@Column(name = "CONTENT")
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderFrom() {
		return orderFrom;
	}

	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PressOrderDTO [id=" + id + ", orderFrom=" + orderFrom + ", phoneNo=" + phoneNo + ", cardType="
				+ cardType + ", noOfCopies=" + noOfCopies + ", content=" + content + "]";
	}

}
