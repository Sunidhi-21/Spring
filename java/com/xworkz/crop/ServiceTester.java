package com.xworkz.crop;

import com.xworkz.crop.dao.CropDAO;
import com.xworkz.crop.dao.CropDAOImpl;
import com.xworkz.crop.entity.CropEntity;
import com.xworkz.crop.service.CropService;
import com.xworkz.crop.service.CropServiceImpl;

import crop.CropSeason;
import crop.CropType;

public class ServiceTester {

	public static void main(String[] args) {
		CropDAO cropDAO = new CropDAOImpl();
		CropService cropService = new CropServiceImpl(cropDAO);
		
		CropEntity cropEntity = new CropEntity();
		cropEntity.setName("Ragi");
		cropEntity.setPrice(100);
		cropEntity.setLife(4);
		cropEntity.setOrganic(true);
		cropEntity.setSeason(CropSeason.SUMMER);
		cropEntity.setType(CropType.RABI);
		
		boolean saved = cropService.validateAndSave(cropEntity);
		System.out.println(saved);

	}

}
