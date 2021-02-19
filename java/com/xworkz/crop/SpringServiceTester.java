package com.xworkz.crop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.crop.entity.CropEntity;
import com.xworkz.crop.service.CropService;

import crop.CropSeason;
import crop.CropType;

public class SpringServiceTester {

	public static void main(String[] args) {
		
		String xmlFilePath = "spring/application.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFilePath);
		
		CropService cropService = container.getBean(CropService.class);
		cropService.validateAndSave(new CropEntity("rice", CropType.KHARIF, 30, CropSeason.MONSOON, true, 3));

	}

}

//Output
//created CropServiceImpl
//invoked validateAndSave
//cropEntity CropEntity(cid=0, name=rice, type=KHARIF, price=30.0, season=MONSOON, organic=true, life=3)
//name is valid
//price is valid
//crop is valid, can save
//invoked saveCrop
//Fri Feb 19 10:25:16 IST 2021 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
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
//Feb 19, 2021 10:25:16 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
//INFO: HHH10001008: Cleaning up connection pool [jdbc:mysql://localhost:3306/20trans.v.09]
