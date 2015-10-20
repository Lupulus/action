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
public class CubiclePool extends ResourcePool<Cubicle> {

    public CubiclePool(int poolNumber) {
        super(poolNumber);
    }

    @Override
    protected Cubicle createResource() {
        return new Cubicle(); 
    }

    
    
}
