package com.xworkz.crop.service;

import com.xworkz.crop.entity.CropEntity;

public interface CropService {
	
	public boolean validateAndSave(CropEntity crop);
}
