package com.slksoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slksoft.entity.Product;
import com.slksoft.dao.ProductDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service // qualified for component scan
public class ProductService {

	// automatically injects an instance of ProductDao interface
	// created by mybatis
	@Autowired
	ProductDao dao;

	public ProductService() {
		log.info("ProductService instantiated!");
	}

	public List<Product> getAllProducts() {
		log.info("Returning list of all products");
		return dao.findAll();
	}

	public Product getProductById(Integer id) {
		log.info("returning a product for id {}", id);
		return dao.findById(id);
	}
	
	public void deleteProduct(Integer id){
		log.info("deleting the product with id {}", id);
		dao.deleteById(id);
	}

	public List<Product> getProductsByPriceRange(Double min, Double max) {
		
		return dao.findByPriceRange(min, max);
	}

	public void addNewProduct(Product p) {
		dao.addProduct(p);
	}

	public void updateProduct(Product p) {
		dao.updateProduct(p);
	}
}
