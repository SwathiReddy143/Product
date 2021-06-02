package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return  repository.save(product);
		
	}
	public List<Product> saveProducts(List<Product> products) {
		return  repository.saveAll(products);
		
	}
	public List<Product> getProducts() {
		return  repository.findAll();
		
	}
	public Product getProductbyid(int id) {
		return repository.findById(id).orElse(null);
	}
	public Product getProductbyname(String name) {
		return repository.findByName(name);
	}
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product removed"+id;
	}
    public Product updateProduct(Product product) {
    	Product exsistingProduct=repository.findById(product.getId()).orElse(null);
    	exsistingProduct.setName(product.getName());
    	exsistingProduct.setQuantity(product.getQuantity());
    	exsistingProduct.setPrice(product.getPrice());
    	return repository.save(exsistingProduct);
    }
	
	

}
