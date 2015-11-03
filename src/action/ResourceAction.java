/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import resource.Resource;
import resource.ResourcePool;
import resource.ResourcefulUser;

/**
 *
 * @author barbe
 */
public abstract class ResourceAction<R extends Resource> extends Action {
    
    protected ResourcePool<R> pool;
	protected ResourcefulUser<R> resourceful;
	
	/**
	 * Constructor of a new Resource action
	 * @param pool the pool to manage the resource
	 * @param resourceful the user resource helper
	 */
	public ResourceAction(ResourcePool<R> pool, ResourcefulUser<R> resourceful) {
		super();
		this.resourceful = resourceful;
		this.pool = pool;
	}
}
