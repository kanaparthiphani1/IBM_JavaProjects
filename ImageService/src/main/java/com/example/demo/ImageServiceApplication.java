package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.ImageDao;
import com.example.demo.model.Image;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@SpringBootApplication
@EnableDiscoveryClient
public class ImageServiceApplication implements CommandLineRunner{

	private ImageDao imageDao;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ImageServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		String port="${server.port}";
		Image ob1=new Image("phani.img","phani pic",port);
		imageDao.save(ob1);
		Image ob2=new Image("sai.img","sai pic",port);
		imageDao.save(ob2);
		Image ob3=new Image("ravi.img","ravi pic",port);
		imageDao.save(ob3);
	}

}
