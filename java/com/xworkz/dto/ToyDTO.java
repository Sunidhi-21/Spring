package com.xworkz.dto;

public class ToyDTO {

	private String name;
	private String type;
	private int price;

	public ToyDTO(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ToyDTO [name=" + name + ", type=" + type + ", price=" + price + "]";
	}

}
