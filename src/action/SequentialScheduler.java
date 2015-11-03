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
public class SequentialScheduler extends Scheduler {
    
	public SequentialScheduler(){
		super();
	}

	/**
	 * Do all step for each action, one action after another
     * @throws exception.ActionFinishedException
	 */
        @Override
	public void doStep() throws ActionFinishedException {
		super.doStep();
		Action toDo = this.actions.get(0);
		toDo.doStep();
		if(toDo.isFinished()){
			this.actions.remove(0);
		}
	}
}
