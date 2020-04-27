package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.DAO.ProductDao;
import com.example.demo.model.Product;
@Service
public class ProductServiceimpl implements ProductService {

	private ProductDao productDao;
	
	
	
	public ProductServiceimpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> showAll() {
		// TODO Auto-generated method stub
		Iterator<Product> it= productDao.findAll().iterator();
		List<Product> ls= new ArrayList<Product>();
		while(it.hasNext())
		{
			Product obj = it.next();
			ls.add(obj);
		}
		return ls;
	}

	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub

		productDao.save(p);
		
	}

}
