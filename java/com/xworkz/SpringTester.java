package com.xworkz;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.country.custom.Country;
import com.xworkz.projector.custom.Projector;
import com.xworkz.studental.Student;
import com.xworkz.studental.StudentAL;

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
		
		StudentAL studentAL = container.getBean(StudentAL.class);
		
		System.out.println(studentAL);
		
		Country country = container.getBean(Country.class);
		System.out.println(country);

	}

}

//output
//StudentAL [stuAL=[Student [age=10, name=Hari, address=Bangalore], Student [age=12, name=Swathi, address=Mangalore], Student [age=9, name=Kavitha, address=Mumbai]]]
