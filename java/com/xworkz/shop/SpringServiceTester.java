package com.xworkz.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.shop.entity.ShopEntity;
import com.xworkz.shop.service.ShopService;

public class SpringServiceTester {

	public static void main(String[] args) {
		
		String xmlFilePath = "spring/application.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFilePath);
		
		ShopService shopService = container.getBean(ShopService.class);
		shopService.validateAndSave(new ShopEntity("Sapna","Bangalore","Partha",1));

	}

}
