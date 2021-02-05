package com.xworkz.country.custom;

public class Country {
	
	private String primeMinister;
	private String president;
	private String capital;
	private double population;
	private int noOfStates;
	
	public Country(String primeMinister) {
		super();
		this.primeMinister = primeMinister;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	@Override
	public String toString() {
		return "Country [primeMinister=" + primeMinister + ", president=" + president + ", capital=" + capital
				+ ", population=" + population + ", noOfStates=" + noOfStates + "]";
	}
	
	
}
