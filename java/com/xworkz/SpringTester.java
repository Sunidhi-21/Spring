package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.charger.Charger;
import com.xworkz.charger.SwitchBoard;

public class SpringTester {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(container.getBeanDefinitionCount());
		SwitchBoard switchBoard = container.getBean(SwitchBoard.class);
		System.out.println(switchBoard);
		switchBoard.supplyPower();
		Charger charger = container.getBean(Charger.class);
		System.out.println(charger);
		charger.charge();

	}

}

//Output
//Created Charger
//3
//SwitchBoard [noOfSwitches=0, brand=Chroma, charger=Charger [noOfPins=3]]
//Supply power
//Charging
//Charger [noOfPins=3]
//Charging
