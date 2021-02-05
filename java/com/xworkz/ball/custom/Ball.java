package com.xworkz.ball.custom;

public class Ball {
	
	private String type;
	private double weight;
	private String usedFor;
	
	public Ball(String type, String usedFor) {
		super();
		this.type = type;
		this.usedFor = usedFor;
	}

	public Ball(String type, double weight) {
		super();
		this.type = type;
		this.weight = weight;
	}

	public Ball(double weight, String usedFor) {
		super();
		this.weight = weight;
		this.usedFor = usedFor;
	}

	@Override
	public String toString() {
		return "Ball [type=" + type + ", weight=" + weight + ", usedFor=" + usedFor + "]";
	}
}
