/**
 * 
 */
package com.joyloruth.ProductManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joy LoRuth
 *
 */

@Controller

public class AppController {
	
	@Autowired
	private ProductService service; 
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		return "index";
	}
	
	@RequestMapping("/new")
	public String addProduct(Model model) {
		Product addProduct =  new Product();
		model.addAttribute("addProduct", addProduct);
		return "new_page";
	}
	
	
	
	
	

}
