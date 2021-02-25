package com.xworkz.shop.service;

import com.xworkz.shop.dao.ShopDAO;
import com.xworkz.shop.entity.ShopEntity;

public class ShopServiceImpl implements ShopService {

	private ShopDAO shopDAO;

	public ShopServiceImpl(ShopDAO shopDAO) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.shopDAO = shopDAO;
	}

	@Override
	public boolean validateAndSave(ShopEntity shop) {

		System.out.println("invoked validateAndSave");
		System.out.println("cropEntity " + shop);
		boolean valid = false;
		if (shop != null) {
			String name = shop.getShopName();

			if (name.length()>=3 && name.length()<=12) {
				System.out.println("name is valid");
				valid = true;
			} else {
				System.out.println("name is invalid");
				valid = false;
			}
			
			String location=shop.getLocation();
			if(location.length()>=3 && location.length()<=30) {
				System.out.println("location is valid");
				valid = true;
			}else {
				System.out.println("location is invalid");
				valid=false;
			}
			
			String oname = shop.getOwnerName();
				if(valid) {
					if(oname!=null && oname.length()<=12 && oname.length()>=4) {
						System.out.println("ownername is valid");
						valid=true;
					} else {
						System.out.println("ownername is invalid");
						valid=false;
					}
				
				int open=shop.getOpen();	
				if(open==1 || open==0) {
					if(open==1) {
						System.out.println("shop is open");
					    valid=true;
					}
					if(open==0)
					{
						System.out.println("shop is closed");
						valid=true;
					}
				}else {
					System.out.println("open invalid");
					valid=false;
				}
				

			if (valid) {
				System.out.println("shop is valid, can save");
				shopDAO.create(shop);
			} else {
				System.out.println("shop is invalid cant save");
			}

		}

		
	}
		return valid;
	}
}
