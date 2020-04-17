package com.example.repo;

import java.util.List;

import com.example.bean.Image;

public interface ImageInterface {
	
	public Image createImage(Image img);
	

	public void updateImage(String url,String newUrl) throws DataNotFoundException;
	
	public void deleteImage(String imageUrl) throws DataNotFoundException;
	
	public List<Image> displayAll();
	
	public Image displayByUrl(String imageUrl) throws DataNotFoundException;
}
