package com.nisha.product.bo;

import com.nisha.product.dao.ProductDAO;
import com.nisha.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	ProductDAO dao;

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	public void create(Product product) {
		
		dao.create(product);
	}

	public Product findProduct(int id) {
		
		return dao.read(id);
	}

}
