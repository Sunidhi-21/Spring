package com.xworkz.crop.dao;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.xworkz.crop.entity.CropEntity;

public class CropDAOImpl implements CropDAO {
	
	public CropDAOImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	SessionFactory sessionF;
	
	public void setSessionF(SessionFactory sessionF) {
		this.sessionF = sessionF;
	}

	@Override
	public Long create(CropEntity cropEntity) {
		System.out.println("invoked saveCrop");
		
		Transaction transaction= null;
		SessionFactory factory = sessionF;
		try(Session session =  factory.openSession()){
			transaction = session.getTransaction();
			session.beginTransaction();
			Serializable id=session.save(cropEntity);
			//Serializable id=session.save(entity);			
//			session.getTransaction().commit();
//			return (Long)id;
			session.getTransaction().commit();
			return (Long)id;
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			factory.close();
		}
		
		return null;
		
	}

}


		
//		Session session = null;
//		
//		try {
//			SessionFactory singleFactory = SingleSessionFactory.getSingleFactory();
//			session = singleFactory.openSession();
//			session.beginTransaction();  
//			session.save(cropEntity);
//			session.getTransaction().commit();
//			System.out.println("saved cropEntity");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (Objects.nonNull(session)) {
//				session.close();
//				System.out.println("session is closed");
//			} else {
//				System.out.println("session is not closed");
//			}
//		}
//
//	}


