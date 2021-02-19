package com.xworkz.crop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import crop.CropSeason;
import crop.CropType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="crop_entity")
public class CropEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CID")
	private long cid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="TYPE")
	private CropType type;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="SEASON")
	private CropSeason season;
	
	@Column(name="ORGANIC")
	private boolean organic;
	
	@Column(name="LIFE")
	private int life;

	public CropEntity(String name, CropType type, double price, CropSeason season, boolean organic, int life) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.season = season;
		this.organic = organic;
		this.life = life;
	}

}
