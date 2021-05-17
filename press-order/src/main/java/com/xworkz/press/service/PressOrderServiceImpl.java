package com.xworkz.press.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.press.dao.PressOrderDAO;
import com.xworkz.press.dto.PressOrderDTO;

@Component
public class PressOrderServiceImpl implements PressOrderService {

	@Autowired
	private PressOrderDAO pressOrderDAO;

	public PressOrderServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(PressOrderDTO dto) {
		System.out.println("invoked validateAndSave " + dto);
		boolean validData = false;
		if (dto != null) {
			String orderFrom = dto.getOrderFrom();
			if (orderFrom != null && orderFrom.length() > 3 && !orderFrom.isEmpty()) {
				System.out.println("orderFrom is valid");
				validData = true;
			} else {
				System.out.println("orderFrom is invalid");
				validData = false;
			}

			if (validData) {
				long phoneNo = dto.getPhoneNo();
				if (phoneNo != 0 && phoneNo > 0) {
					System.out.println("phoneNo is valid");
					validData = true;
				} else {
					System.out.println("phoneNo is invalid");
					validData = false;
				}
			}

			if (validData) {
				String cardType = dto.getCardType();
				if (cardType != null && cardType.length() > 3 && !cardType.isEmpty()) {
					System.out.println("cardType is valid");
					validData = true;
				} else {
					System.out.println("cardType is invalid");
					validData = false;
				}
			}

			if (validData) {
				int noOfCopies = dto.getNoOfCopies();
				if (noOfCopies != 0 && noOfCopies > 0) {
					System.out.println("noOfCopies is valid");
					validData = true;
				} else {
					System.out.println("noOfCopies is invalid");
					validData = false;
				}
			}

			if (validData) {
				String content = dto.getContent();
				if (content != null & content.length() > 3 && !content.isEmpty()) {
					System.out.println("content is valid");
					validData = true;
				} else {
					System.out.println("content is invalid");
					validData = false;
				}
			}
			if (validData) {
				this.pressOrderDAO.save(dto);
			}
		} else {
			System.out.println("dto is null");
		}
		return validData;
	}

	@Override
	public PressOrderDTO searchByOrderFrom(String orderFrom) {
		return this.pressOrderDAO.searchByOrderFrom(orderFrom);
	}

	@Override
	public List<PressOrderDTO> displayAll() {
		return this.pressOrderDAO.displayAll();
	}
}
