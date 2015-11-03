/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

/**
 *
 * @author barbe
 */
public class BasketPool extends ResourcePool<Basket> {

   	/**
	 * The constructor of a new BasketPool
	 * @param length the size of this pool
	 */
	public BasketPool(int length){
		super(length);
	}

	/**
	 * @see pool.ResourcePool#newInstance()
	 */
	protected Basket newInstance() {
		return new Basket();	
	}
	
	public String toString() {
		return "basket";
	}
    
}
