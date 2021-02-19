package com.xworkz.crop;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.crop.dao.CropDAO;
import com.xworkz.crop.entity.CropEntity;

import crop.CropSeason;
import crop.CropType;

public class ORMTester {

	public static void main(String[] args) {
		
		String filePath = "spring/application.xml";
		
		ApplicationContext container = new ClassPathXmlApplicationContext(filePath);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		CropDAO cropDAO = container.getBean(CropDAO.class);
		CropEntity cropEntity =  new CropEntity("Rice", CropType.KHARIF, 40.0, CropSeason.MONSOON, true, 5);
		System.out.println(cropDAO.create(cropEntity));
		
	
	}

}
//Output
//CreatedCropDAOImpl
//[localSessionFactoryBean, cropDAOImpl]
//invoked saveCrop
//Thu Feb 18 01:13:30 IST 2021 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Hibernate: 
//    select
//        next_val as id_val 
//    from
//        hibernate_sequence for update
//            
//Hibernate: 
//    update
//        hibernate_sequence 
//    set
//        next_val= ? 
//    where
//        next_val=?
//Hibernate: 
//    insert 
//    into
//        crop_entity
//        (LIFE, NAME, ORGANIC, PRICE, SEASON, TYPE, CID) 
//    values
//        (?, ?, ?, ?, ?, ?, ?)