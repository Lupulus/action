/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import exception.ActionFinishedException;
import java.util.NoSuchElementException;
import resource.Resource;
import resource.ResourcePool;
import resource.ResourcefulUser;

/**
 *
 * @author barbe
 */
public class TakeResourceAction<R extends Resource> extends ResourceAction<R> {
    
    /**
	 * Constructor of a new take resource action
	 * @param pool the pool to taking this resource
	 * @param resourceful the resource user helper
	 */
	public TakeResourceAction(ResourcePool<R> pool, ResourcefulUser<R> resourceful){
		super(pool, resourceful);
	}
	
	/**
	 * @see Action#isFinished()
	 */
	@Override
	public boolean isFinished() {
		return this.resourceful.getResource() != null;
	}
	
	/**
     * @throws exception.ActionFinishedException
	 * @see Action#doStep()
	 */
	@Override
	public void doStep() throws ActionFinishedException{
		super.doStep();
		String result = "";
		try {
			R r = this.pool.provideResource();
			this.resourceful.setResource(r);
			result = "success";
		} catch(NoSuchElementException e) {
			result = "failed";
		}
		System.out.println(this.resourceful.getSwimmer().getName() + " trying to take resource from pool " + this.pool + "... " + result);
	}
}
