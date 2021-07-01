/**
 * 
 */
package com.joyloruth.ProductManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joy LoRuth
 *
 */

@Controller
public class AppController {
	
	@Autowired
	private ProductService service; 
	
	
	@RequestMapping("/")
	public String viewHomePage() {
		List<Product> listProducts = service.listAll();
		return "index";
	}
	
	

}
