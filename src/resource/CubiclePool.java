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

    /**
	 * Constructor of a new CubiclePool
	 * @param length the size of this pool
	 */
	public CubiclePool(int length){
		super(length);
	}

	/**
	 * @see pool.ResourcePool#newInstance()
	 */
	protected Cubicle newInstance() {
		return new Cubicle();	
	}
	
	public String toString() {
		return "cubicle";
	}
    
    
}
