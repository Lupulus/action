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
public class BasketPool extends ResourcePool {

    public BasketPool(int poolNumber) {
        super(poolNumber);
    }

    @Override
    public Resource factoryMethod() {
        return new Basket();
    }

    
    
}
