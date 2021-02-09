package com.xworkz;

import com.xworkz.charger.Charger;
import com.xworkz.charger.SwitchBoard;

public class TesterSunidhi {

	public static void main(String[] args) {
		
		Integer pins=2;
		Charger charger = new Charger();
		charger.setNoOfPins(pins);
		
		String b = "Chroma" ;
		
		SwitchBoard switchBoard = new SwitchBoard(charger);
		switchBoard.setBrand(b);
		switchBoard.supplyPower();
		System.out.println(switchBoard);
	}
}
