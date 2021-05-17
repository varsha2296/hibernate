package com.xworkz.press.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.press.dto.PressOrderDTO;
import com.xworkz.press.service.PressOrderService;

@Component
@RequestMapping("/")
public class PressOrderComponent {

	@Autowired
	private PressOrderService pressOrderService;

	public PressOrderComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping("/order.do")
	public String onOrder(PressOrderDTO dto, Model model) {
		System.out.println("invoked onOrder " + dto);
		boolean saved = this.pressOrderService.validateAndSave(dto);
		if (saved) {
			System.out.println("Data saved successfully");
			model.addAttribute("data", dto);
			model.addAttribute("message", "Order successful with below details of " + dto.getOrderFrom());
			return "OrderSuccess";
		} else {
			System.out.println("Data saving failed");
			model.addAttribute("message", "Order failed!!!");
		}
		return "PressOrder";
	}

	@PostMapping("/search.do")
	public String onSearch(PressOrderDTO pressOrderDTO, String orderFrom, Model model) {
		System.out.println("Ordered by " + orderFrom);
		System.out.println("invoked onSearch " + pressOrderDTO);
		PressOrderDTO dto = pressOrderService.searchByOrderFrom(orderFrom);
		if (dto != null) {
			System.out.println("dto " + dto);
			model.addAttribute("data", dto);
			model.addAttribute("msg", "Details found!");
		} else {
			System.out.println("Details not found");
			model.addAttribute("message", "Details not Found!!!");
		}
		return "SearchOrder";
	}

	@PostMapping("/displayAll.do")
	public String onDisplayAll(PressOrderDTO pressOrderDTO, Model model) {
		System.out.println("invoked onDisplayAll " + pressOrderDTO);
		List<PressOrderDTO> dto = pressOrderService.displayAll();
		if (dto != null) {
			System.out.println("dto " + dto);
			model.addAttribute("data", dto);
			model.addAttribute("msg", "All details displayed");
		} else {
			System.out.println("No details to display");
			model.addAttribute("message", "No details to display!!!");
		}
		return "DisplayAll";
	}
}
