package com.xworkz.speaker;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dao.SpeakerDAOImpl;
import com.xworkz.speaker.dto.SpeakerDTO;

public class Tester {

	public static void main(String[] args) {
		SpeakerDAO speakerDAO = new SpeakerDAOImpl();
		SpeakerDTO speakerDTO = new SpeakerDTO(01, "Sony", 5000, "white", "large", true);
		speakerDAO.saveSpeaker(speakerDTO);
	}

}
