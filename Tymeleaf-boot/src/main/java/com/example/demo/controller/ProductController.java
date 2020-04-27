package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@RequestMapping("/product/{id}")
	public String showAll(@PathVariable String id,Model model)
	{
		model.addAttribute("product", productService.showByid(id));
		return "Product";
	}
	
	@RequestMapping("/product/new")
	public String add(Model model)
	{
		model.addAttribute("product", new Product());
		return "Productform";
	}
	@PostMapping("/product")
	public String addProduct(Product pro)
	{
		productService.add(pro);
		return "redirect:/products";
	}
}

