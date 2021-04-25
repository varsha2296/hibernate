package com.xworkz.news.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.news.dao.NewspaperDAO;
import com.xworkz.news.dto.NewspaperDTO;
import com.xworkz.news.entity.NewspaperEntity;

@Component
public class NewspaperServiceImpl implements NewspaperService {

	@Autowired
	private NewspaperDAO newspaperDAO;

	public NewspaperServiceImpl() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@Override
	public boolean validateNewspaperInfo(NewspaperDTO dto) {
		boolean validData = false;
		if (dto != null) {
			System.out.println("invoked validate method to save data");

			String name = dto.getName();
			if (name != null && name.length() > 3 && !name.isEmpty()) {
				System.out.println("name is valid");
				validData = true;
			} else {
				System.out.println("name is invalid");
				validData = false;
			}
			if (validData) {
				double cost = dto.getCost();
				if (cost != 0 && cost > 0) {
					System.out.println("cost is valid");
					validData = true;
				} else {
					System.out.println("cost is invalid");
					validData = false;
				}
			}
			if (validData) {
				short noOfPages = dto.getNoOfPages();
				if (noOfPages != 0 && noOfPages > 0) {
					System.out.println("noOfPages is valid");
					validData = true;
				} else {
					System.out.println("noOfPages is invalid");
					validData = false;
				}
			}
			if (validData) {
				String language = dto.getLanguage();
				if (language != null && language.length() > 3 && !language.isEmpty() && !language.contains(" ")) {
					System.out.println("language is valid");
					validData = true;
				} else {
					System.out.println("language is invalid");
					validData = false;
				}
			}
			if (validData) {
				boolean magazine = dto.isMagazine();
				if (Objects.nonNull(magazine)) {
					System.out.println("magazine is valid");
					validData = true;
				} else {
					System.out.println("magazine is invalid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("can invoke dao");
				if (Objects.nonNull(dto)) {
					NewspaperEntity entity = new NewspaperEntity();
					BeanUtils.copyProperties(dto, entity);
					return this.newspaperDAO.saveNewspaperInfo(entity);
				} else {
					return false;
				}
			} else {
				System.out.println("cannot invoke dao");
			}
		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}
