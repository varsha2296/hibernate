package com.xworkz.flight.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.flight.dto.FlightDTO;

public class FlightDAOImpl implements FlightDAO {

	@Override
	public void saveFlight(FlightDTO flightDTO) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(flightDTO);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			if (sessionFactory != null) {
				sessionFactory.close();
			}
		}

	}

	@Override
	public void readFlight(int flightId) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			FlightDTO flightDTO = session.get(FlightDTO.class, flightId);
			System.out.println(flightDTO);
		} catch (HibernateException e1) {
			e1.printStackTrace();
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}

	}

	@Override
	public void updateFlight(int flightId) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			FlightDTO flightDTO = session.get(FlightDTO.class, flightId);

			flightDTO.setFlightName("GO AIR");
			Transaction transaction = session.beginTransaction();
			session.update(flightDTO);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}

	}

	@Override
	public void deleteFlight(int flightId) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			FlightDTO flightDTO = session.get(FlightDTO.class, flightId);
			Transaction transaction = session.beginTransaction();
			session.delete(flightDTO);
			transaction.commit();
		} catch (HibernateException hibernateException) {
			hibernateException.printStackTrace();
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}

	}

}
