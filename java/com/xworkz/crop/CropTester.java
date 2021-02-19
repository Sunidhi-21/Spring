package com.xworkz.crop;

import com.xworkz.crop.dao.CropDAO;
import com.xworkz.crop.dao.CropDAOImpl;
import com.xworkz.crop.entity.CropEntity;

import crop.CropSeason;
import crop.CropType;

public class CropTester {

	public static void main(String[] args) {
		
		 CropEntity cropEntity = new CropEntity("Ragi", CropType.KHARIF, 40.0, CropSeason.MONSOON, true, 5);
		 
		 CropDAO cropDAOImpl = new CropDAOImpl();
		 cropDAOImpl.create(cropEntity);

	}

}
