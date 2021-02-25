package com.xworkz.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="shop_entity")
public class ShopEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SID")
	private Long shopId;
	
	@Column(name="NAME")
	private String shopName;//min 3 max 12
	
	@Column(name="LOCATION")
	private String location;// min 3 max 30
	
	@Column(name="ONAME")
	private String ownerName;//optional , min 4 max 12 
	
	@Column(name="OPEN") 
	private int open;//0 or 1
	
	public ShopEntity(String shopName, String location, String ownerName, int open) {
		super();
		this.shopName = shopName;
		this.location = location;
		this.ownerName = ownerName;
		this.open = open;
	}
	
}
