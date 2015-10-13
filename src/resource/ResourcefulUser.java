/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

/**
 *
 * @author barbe
 * @param <R>
 */
public class ResourcefulUser<R extends Resource> {
    
    protected R resource;

    public R getResource() {
        return resource;
    }

    public void setResource(R resource) {
        this.resource = resource;
    }
    
    public void resetResource(){
        this.resource = null;
    }
}
