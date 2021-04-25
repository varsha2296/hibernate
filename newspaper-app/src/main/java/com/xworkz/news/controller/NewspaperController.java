package com.xworkz.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.news.dto.NewspaperDTO;
import com.xworkz.news.service.NewspaperService;

@Component
@RequestMapping("/")
public class NewspaperController {

	@Autowired
	private NewspaperService newspaperService;

	public NewspaperController() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping("/newspaper.do")
	public String onClick(@ModelAttribute NewspaperDTO newspaperDTO, Model model) {
		System.out.println(newspaperDTO);
		if (this.newspaperService.validateNewspaperInfo(newspaperDTO)) {
			model.addAttribute("message", "thankyou for registering");
			return "/index.jsp";
		}
		model.addAttribute("message", "enter valid details");
		return "/index.jsp";
	}
}
