/**
 * 
 */
package com.joyloruth.ProductManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Joy LoRuth
 *
 */

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	
	public List<Product> listAll(){
		return repo.findAll();
		
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
