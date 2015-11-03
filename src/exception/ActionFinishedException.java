/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author barbe
 */
public class ActionFinishedException extends Exception {
    	private static final long serialVersionUID = 1L;

	public ActionFinishedException() {
		super("This action is already terminated.");
	}
	
}
