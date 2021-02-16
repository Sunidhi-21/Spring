package com.xworkz.crop.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.crop.entity.CropEntity;
import com.xworkz.singleconnection.SingleSessionFactory;

public class CropDAOImpl implements CropDAO {

	@Override
	public void saveCrop(CropEntity cropEntity) {
		System.out.println("invoked saveCrop");
		Session session = null;
		
		try {
			SessionFactory singleFactory = SingleSessionFactory.getSingleFactory();
			session = singleFactory.openSession();
			session.beginTransaction();  
			session.save(cropEntity);
			session.getTransaction().commit();
			System.out.println("saved cropEntity");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}

	}

}
