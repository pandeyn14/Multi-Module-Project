package com.nisha.product.dao;

import java.util.HashMap;

import com.nisha.product.dto.Product;
import java.util.Map;
import java.util.HashMap;



public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer, Product> productMap = new HashMap<Integer,Product>();

	public void create(Product product) {
		productMap.put(product.getId(), product);
		
	}

	public Product read(int id) {
		
		return productMap.get(id);
	}

	public void update(Product product) {
		productMap.put(product.getId(), product);
		
	}

	public void delete(int id) {
		productMap.remove(id);
		
	}

}
