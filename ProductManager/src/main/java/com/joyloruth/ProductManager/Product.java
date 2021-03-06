/**
 * 
 */
package com.joyloruth.ProductManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Joy LoRuth
 *
 */

@Entity
//@Table(name="product")
public class Product {
	
	
	private long id;
	
	//@Column(name ="name")
	private String name;
	//@Column(name ="brand")
	private String brand;
	//@Column(name ="made")
	private String made;
	//@Column(name ="price")
	private float price;

	protected Product() {
		
	}
	
	/*public Product(String name, String brand, String made, float price) {
		super();
		this.name = name;
		this.brand = brand;
		this.made = made;
		this.price = price;
	}*/
	
	

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the madeIn
	 */
	public String getMade() {
		return made;
	}

	/**
	 * @param madeIn the madeIn to set
	 */
	public void setMade(String madeIn) {
		this.made = madeIn;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	

	
}
