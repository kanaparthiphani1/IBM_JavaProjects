package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.ProductService;
import com.example.demo.model.Product;

@SpringBootApplication
public class TymeleafBootApplication implements CommandLineRunner {

	private ProductService productService;
	
	public TymeleafBootApplication(ProductService productService) {
		super();
		this.productService = productService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TymeleafBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product obj1=new Product("Mac", 120000);
		productService.add(obj1);
		Product obj2=new Product("Hp", 100000);
		productService.add(obj2);
		Product obj3=new Product("Dell", 80000);
		productService.add(obj3);
	}

}
