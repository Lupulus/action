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
public class SwimmerForeseableAction extends Foreseable {

	private String action;
	
	public SwimmerForeseableAction(int time, String action) {
		super(time);
		this.action = action;
	}
	
	/**
	 * Print the action of swimmer
	 */
        @Override
	public void doStep() throws ActionFinishedException{
		super.doStep();
		System.out.println(action);
	}

}
