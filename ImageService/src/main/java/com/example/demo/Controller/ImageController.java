package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ImageDao;
import com.example.demo.model.Image;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ImageController {

	
	private ImageDao imageDao;
	
	
	@RequestMapping("/images")
	public List<Image> showAll()
	{
		Iterator<Image> it = imageDao.findAll().iterator();
		List<Image> li = new ArrayList<Image>();
		while(it.hasNext())
		{
			Image i = it.next();
			li.add(i);
			
		}
		return li;
	}
}
