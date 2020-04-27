package com.example.dao;

import com.example.model.Image;

public interface ImageDao {
	
	public void addImage(Image objImage);
	public void displayImage(int imageId);
	public void updateImageUrl(int imageId,String imageUrl);
	public void deleteImage(int imageId);

}
