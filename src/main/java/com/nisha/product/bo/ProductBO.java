package com.nisha.product.bo;

import com.nisha.product.dto.Product;

public interface ProductBO {
	
	public void create(Product product);
	
	public Product findProduct(int id);
	
	
	

}
