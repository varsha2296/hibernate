package com.xworkz.speaker.service;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dto.SpeakerDTO;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerDAO speakerDAO;

	public SpeakerServiceImpl(SpeakerDAO dao) {
		this.speakerDAO = dao;
	}

	@Override
	public boolean validateAndSave(SpeakerDTO dto) {
		boolean validData = false;

		// id validation
		if (dto != null) {
			System.out.println("DTO is not null,validate the field");
			int speakerid = dto.getSpeakerID();
			if (speakerid > 0) {
				System.out.println("speaker id is valid");
				validData = true;
			} else {
				System.out.println("speaker id is not valid");
				validData = false;
			}

			// brand validation
			if (validData) {
				String brand = dto.getBrand();
				if (brand != null && !brand.isEmpty() && !brand.contains(" ")) {
					System.out.println("brand is valid");
					validData = true;
				} else {
					System.out.println("brand is invalid");
					validData = false;
				}
			}

			// cost validation
			if (validData) {
				double cost = dto.getCost();
				if (cost > 0) {
					System.out.println("cost is valid");
					validData = true;

				} else {
					System.out.println("cost is invalid");
					validData = false;
				}
			}

			if (validData) {
				String size = dto.getSize();
				if (size != null && !size.isEmpty() && !size.contains(" ")) {
					System.out.println("Size are valid");
					validData = true;
				} else {
					System.out.println("size are invalid");
					validData = false;
				}
			}

			if (validData) {
				boolean warranty = dto.isWarranty();
				if (warranty) {
					System.out.println("warranty are valid");
					validData = true;
				} else {
					System.out.println("warranty are invalid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("can invoke save method from dao");
				speakerDAO.saveSpeaker(dto);
			}
		} else {
			System.out.println("dto is null , invalid data");
		}
		return false;
	}

}
