/**
 * 
 */
package com.joyloruth.ProductManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Joy LoRuth
 *
 */
//@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

}
