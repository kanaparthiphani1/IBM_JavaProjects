package com.example.service;

import com.example.dao.ImageDaoImplement;
import com.example.model.Image;

public class ImageServiceImplement  implements ImageService{

	private ImageDaoImplement objDaoImplement = new ImageDaoImplement();
	public void addImageService(Image objImage) {
		objDaoImplement.addImage(objImage);
	}

	public void displayImageService(int imageId) {
	objDaoImplement.displayImage(imageId);	
	}

	public void updateImageUrlService(int imageId, String imageUrl) {
		objDaoImplement.updateImageUrl(imageId, imageUrl);
	}

	public void deleteImageService(int imageId) {
		objDaoImplement.deleteImage(imageId);
	}

}
