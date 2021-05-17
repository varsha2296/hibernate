package com.xworkz.press.dao;

import java.util.List;

import com.xworkz.press.dto.PressOrderDTO;

public interface PressOrderDAO {

	public boolean save(PressOrderDTO dto);

	public PressOrderDTO searchByOrderFrom(String orderFrom);

	public List<PressOrderDTO> displayAll();
}
