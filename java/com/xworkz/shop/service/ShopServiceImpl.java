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

			if (name != null && !name.isEmpty() && name.length() < 15) {
				System.out.println("name is valid");
				valid = true;
			} else {
				System.out.println("name is invalid");
				valid = false;
			}

			if (valid) {
				System.out.println("shop is valid, can save");
				shopDAO.create(shop);
			} else {
				System.out.println("shop is invalid cant save");
			}

		}

		return false;
	}

}
