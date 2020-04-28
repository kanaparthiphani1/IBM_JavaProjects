package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.AlbumService;

@RestController
public class AlbumController {

	
	private AlbumService albumService;

	public AlbumController(AlbumService albumService) {
		super();
		this.albumService = albumService;
	}
	
	@RequestMapping("/images")
	public List showAll()
	{
		return albumService.showAll();
	}
}
