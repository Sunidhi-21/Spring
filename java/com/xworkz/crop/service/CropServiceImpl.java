package com.xworkz.crop.service;

import com.xworkz.crop.dao.CropDAO;
import com.xworkz.crop.entity.CropEntity;

public class CropServiceImpl implements CropService {

	private CropDAO cropDAO;
	
	public CropServiceImpl(CropDAO cropDAO) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.cropDAO=cropDAO;
	}

	@Override
	public boolean validateAndSave(CropEntity cropEntity) {
		System.out.println("invoked validateAndSave");
		System.out.println("cropEntity "+cropEntity);
		boolean valid = false;
		if(cropEntity !=null) {
			String name = cropEntity.getName();
		
			if(name!=null && !name.isEmpty() && name.length()<15) {
				System.out.println("name is valid");
				valid=true;
			} else {
				System.out.println("name is invalid");
				valid=false;
			}
			if(valid) {
			double price = cropEntity.getPrice();
			if(price>10 && price<1000) {
				System.out.println("price is valid");
				valid=true;
			}else {
				System.out.println("price is invalid,price should be greater than 10");
				valid=false;
			}
		  }
		if(valid) {
			System.out.println("crop is valid, can save");
			cropDAO.create(cropEntity);
		} else {
			System.out.println("crop is invalid cant save");
		}

	}
		return valid;
}

}