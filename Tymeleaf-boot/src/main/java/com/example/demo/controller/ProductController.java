package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.model.Product;

@Controller
public class ProductController {

	private ProductService productService;
	
	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@RequestMapping("/products")
	public String showAll(Model model)
	{
		model.addAttribute("products", productService.showAll());
		return "Products";
	}
}
