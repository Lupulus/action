/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import exception.ActionFinishedException;

/**
 *
 * @author barbe
 */
public class FairScheduler extends Scheduler {
    
    private int index;
	
	public FairScheduler(){
		super();
		this.index = 0;
	}

	/**
	 * Do a step for each action, one after another
	 */
    @Override
	public void doStep() throws ActionFinishedException {
		super.doStep();
		Action toDo = this.actions.get(index);
		toDo.doStep();
		if(toDo.isFinished()){
			this.actions.remove(index);
		}
		
		try {
			if(this.actions.get(index+1) != null){
				index++;
			}
		} catch (IndexOutOfBoundsException e) {
			index = 0;
		}
	}
}
