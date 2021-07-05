/**
 * 
 */
package com.joyloruth.ProductManager;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Joy LoRuth
 *
 */

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	
	//returns list of all products
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	//save product to database
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
