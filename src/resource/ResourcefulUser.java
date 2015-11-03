/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import model.Swimmer;

/**
 *
 * @author barbe
 * @param <R>
 */
public class ResourcefulUser<R extends Resource> {
    
    	protected R resource;
	protected Swimmer swimmer;
	
	/**
	 * Constructor of a new resource helper
	 * @param swimmer the swimmer using this the resource
	 */
	public ResourcefulUser(Swimmer swimmer){
		this.swimmer = swimmer;
	}

	/**
	 * Get the resource of this helper
	 * @return the resource of this helper
	 */
	public R getResource() {
		return this.resource;	
	}
	
	/**
	 * Set the resource of this helper
	 * @param resource the resource who change the resource of this helper
	 */
	public void setResource(R resource) {
		this.resource = resource;	
	}
	
	/**
	 * The resource of this helper become null
	 */
	public void resetResource() {
		this.resource = null;	
	}
	
	/**
	 * Get the swimmer of this helper
	 * @return the swimmer of this helper
	 */
	public Swimmer getSwimmer() {
		return this.swimmer;
	}
}
