package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.country.custom.Country;
import com.xworkz.projector.custom.Projector;

public class SpringTester {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		Projector projector = container.getBean(Projector.class);
		System.out.println(projector);
		Object ball = container.getBean("ball");
		System.out.println(ball);
		Object ball1 = container.getBean("ball1");
		System.out.println(ball1);
		Object ball2 = container.getBean("ball2");
		System.out.println(ball2);
		
		Country country = container.getBean(Country.class);
		System.out.println(country);
		
		
	}

}

//output
//Projector [life=5, hd=true, maxDistance=10.0, cost=2000.0]
//Ball [type=leather, weight=0.0, usedFor=cricket]
//Ball [type=leather, weight=5.0, usedFor=null]
//Ball [type=null, weight=5.0, usedFor=cricket]
//Country [primeMinister=Narendra Modi, president=Ramnath Kovind , capital=New Delhi, population=1.36E7, noOfStates=28]
//
