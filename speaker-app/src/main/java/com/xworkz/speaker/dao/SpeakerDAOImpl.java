package com.xworkz.speaker.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.speaker.dto.SpeakerDTO;

public class SpeakerDAOImpl implements SpeakerDAO {
	
	@Override
	public void saveSpeaker(SpeakerDTO dto) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
