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
	
	@RequestMapping("/home")
	public String home(Model model) {
		//Product addProduct =  new Product();
		//model.addAttribute("addProduct", addProduct);
		return "home";
	}
	
	@RequestMapping("/viewInventory")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		return "viewInventory";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(Model model) {
		Product addProduct =  new Product();
		model.addAttribute("addProduct", addProduct);
		return "addProduct";
	}
	
	@RequestMapping("/editProduct")
	public String editProduct(Model model) {
		Product editProduct =  new Product();
		model.addAttribute("editProduct", editProduct);
		return "editProduct";
	}
	
	@RequestMapping("/saveProduct")
	public String saveProduct(Model model) {
		Product saveProduct =  new Product();
		model.addAttribute("saveProduct", saveProduct);
		return "saveProduct";
	}

	
	

}
