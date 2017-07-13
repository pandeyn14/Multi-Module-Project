package com.nisha.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nisha.product.dto.Product;

public class ProductDAOImpltest {
	
	int price = 400;
	int id = 1234;
	String productType="Shoulder Bags";
	String brandName = "Coach";
	String productName="scout hobo in pebble leather";
	String productDesc = "A softly structured hobo with a tailored look, Scout is crafted in richly pebbled leather with beautifully polished hardware. A secure exterior pocket concealed on each side of its refined silhouette offers easy access for a phone and other valuables";


	@Test
	public void CreateTest() {

		ProductDAO dao = new ProductDAOImpl();
		Product prod = new Product();
		prod.setId(id);
		prod.setProductName(productDesc);
		prod.setProductDescription(productName);
		prod.setPrice(price);
		prod.setBrandName(brandName);
		prod.setProductType(productType);
		
		dao.create(prod);
		
		Product result = dao.read(0001);
		
		assertNotNull(result);
		assertEquals(id,result.getId());
		assertEquals(productName,result.getProductName());
		assertEquals(productDesc,result.getProductDescription());
		assertEquals(price,result.getPrice());
	
	}

}
