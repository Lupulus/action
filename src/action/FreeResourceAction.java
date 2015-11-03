/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import exception.ActionFinishedException;
import resource.Resource;
import resource.ResourcePool;
import resource.ResourcefulUser;

/**
 *
 * @author barbe
 */
public class FreeResourceAction<R extends Resource> extends ResourceAction<R>
{
	/**
	 * The constructor of a new resource action
	 * @param pool The pool to add the resource
	 * @param resourceful the resource take by the swimmer earlier
	 */
	public FreeResourceAction(ResourcePool<R> pool, ResourcefulUser<R> resourceful) {
		super(pool, resourceful);
	}
	
	/**
	 * @see Action#isFinished()
	 */
	@Override
	public boolean isFinished() {
		return this.resourceful.getResource() == null;
	}
	
	/**
	 * @see Action#doStep()
	 */
	@Override
	public void doStep() throws ActionFinishedException {
		super.doStep();
		R res = this.resourceful.getResource();
		this.pool.freeResource(res);
		this.resourceful.resetResource();
		System.out.println(this.resourceful.getSwimmer().getName() + " freeing resource from pool " + this.pool);
	}
}

