package com.example.service;

import java.util.List;

import com.example.bean.Image;
import com.example.repo.DataNotFoundException;

public interface ImageService {
	
	public Image createImageService(Image img);
	
	public void updateImageService(String imageUrl,String imageNewUrl) throws DataNotFoundException;
	
	public void delete(String imageUrl) throws DataNotFoundException;
	
	public List<Image> displayImageService();
	
	public Image displayByUrlService(String imageUrl) throws DataNotFoundException;

}
