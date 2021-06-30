/**
 * 
 */
package com.joyloruth.ProductManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Joy LoRuth
 *
 */
@Entity
public class Product {
	
	private Long id;
	private String name;
	private String brand;
	private String madeIn;
	private float price;
	
	protected Product(){
		
	}

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
	public String getMadeIn() {
		return madeIn;
	}

	/**
	 * @param madeIn the madeIn to set
	 */
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
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
