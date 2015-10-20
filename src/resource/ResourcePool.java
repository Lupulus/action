/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.util.ArrayList;

/**
 *
 * @author barbe
 */
public abstract class ResourcePool <R extends Resource> {
    
    private ArrayList <R> poolsFree;
    private ArrayList <R>
    
    public ResourcePool<R> (int poolNumber) {
        pools = new ArrayList();
        for(int i=0; i < poolNumber; i++)
            pools.add(factoryMethod());
    }

    
    protected abstract R createResource();
    
    public ArrayList getPools() {
        return pools;
    }

    public void setPools(ArrayList pools) {
        this.pools = pools;
    }
    
    public R provideRessource(){
    	
    }
    
    public void freeRessource(){
    	
    }
}
