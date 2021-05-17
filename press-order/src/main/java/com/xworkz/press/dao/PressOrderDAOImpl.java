package com.xworkz.press.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.press.dto.PressOrderDTO;

@Component
public class PressOrderDAOImpl implements PressOrderDAO {

	@Autowired
	private SessionFactory factory;

	public PressOrderDAOImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(PressOrderDTO dto) {
		System.out.println("invoked save");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			System.out.println("PressOrderDTO is saved");
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return true;
	}

	@Override
	public PressOrderDTO searchByOrderFrom(String orderFrom) {
		System.out.println("Invoked searchByOrderFrom");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query<PressOrderDTO> query = session.createNamedQuery("searchByOrderFrom");
			query.setParameter("orderFrom", orderFrom);
			PressOrderDTO dto = query.uniqueResult();
			session.getTransaction().commit();
			return dto;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return null;
	}

	@Override
	public List<PressOrderDTO> displayAll() {
		System.out.println("invoked displayAll");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			List<PressOrderDTO> list = new ArrayList<PressOrderDTO>();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return null;
	}
}
