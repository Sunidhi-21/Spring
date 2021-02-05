package com.xworkz.projector.custom;

public class Projector {

	private int life;
	private boolean hd;
	private double maxDistance;
	private double cost;
	
	public Projector(int life, boolean hd, double maxDistance) {
		super();
		this.life = life;
		this.hd = hd;
		this.maxDistance = maxDistance;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Projector [life=" + life + ", hd=" + hd + ", maxDistance=" + maxDistance + ", cost=" + cost + "]";
	}
	
	

}
