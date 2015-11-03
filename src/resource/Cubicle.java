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
public class Cubicle implements Resource {
    
    public Cubicle(){
    	
    }
    
    /**
     * @return 
     * @see resource.Resource#description()
     */
    public String description() {
	return "cubicle";	
    }
}
