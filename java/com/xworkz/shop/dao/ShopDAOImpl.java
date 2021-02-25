package com.xworkz.shop.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.shop.entity.ShopEntity;

public class ShopDAOImpl implements ShopDAO {

	public ShopDAOImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	SessionFactory sessionF;

	public void setSessionF(SessionFactory sessionF) {
		this.sessionF = sessionF;
	}

	@Override
	public Long create(ShopEntity shopEntity) {

		System.out.println("invoked saveShop");

		Transaction transaction = null;
		SessionFactory factory = sessionF;
		try (Session session = factory.openSession()) {
			transaction = session.getTransaction();
			session.beginTransaction();
			Serializable id = session.save(shopEntity);
			session.getTransaction().commit();
			return (Long)id;
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			factory.close();
		}
		return null;
	}

}
