package com.example.service;

import com.example.model.Image;

public interface ImageService {

	public void addImageService(Image objImage);
	public void displayImageService(int imageId);
	public void updateImageUrlService(int imageId,String imageUrl);
	public void deleteImageService(int imageId);

}
