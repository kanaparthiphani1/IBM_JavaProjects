package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {

	public List<Product> showAll();
	public void add(Product p);
	public Product showByid(String id);

}
