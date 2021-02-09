package com.xworkz.charger;

public class Charger {

	private int noOfPins;
	
	public Charger() {
		Class class1 = this.getClass();
		System.out.println("Created " + class1.getSimpleName());
	}
	
	public void setNoOfPins(int noOfPins) {
		this.noOfPins = noOfPins;
	}

	@Override
	public String toString() {
		return "Charger [noOfPins=" + noOfPins + "]";
	}

	public void charge() {
		System.out.println("Charging");
	}
	
}
