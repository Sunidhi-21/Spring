package com.xworkz.charger;

public class SwitchBoard {
	
	private int noOfSwitches;
	private String brand;
	private Charger charger;
	
	public SwitchBoard(Charger charger) {
		
		this.charger = charger;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void supplyPower() {
		System.out.println("Supply power");
		charger.charge();
	}

	@Override
	public String toString() {
		return "SwitchBoard [noOfSwitches=" + noOfSwitches + ", brand=" + brand + ", charger=" + charger + "]";
	}

}
