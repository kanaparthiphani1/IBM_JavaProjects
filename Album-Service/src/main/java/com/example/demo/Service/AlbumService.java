package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class AlbumService {

	@Autowired
	public AlbumService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	RestTemplate restTemplate;
	
	
	public List showAll()
	{
		return restTemplate.getForObject("http://SERVICE-IMAGE/images", List.class);
	}
	
}
