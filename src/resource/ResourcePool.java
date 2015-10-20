/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author barbe
 * @param <R>
 */
public abstract class ResourcePool <R extends Resource> {
    
    private ArrayList <R> poolsFree;
    private ArrayList <R> poolsUsed;
    
    public ResourcePool (int poolNumber) {
        poolsFree = new ArrayList<R>(poolNumber);
        poolsUsed = new ArrayList<R>(poolNumber);
        for(int i=0; i < poolNumber; i++)
            poolsFree.add(createResource());
    }

    

    protected abstract R createResource();
    
    public R provideRessource(){
    	if(hasAvailableResource()){
    		R resource = poolsFree.get(0);
    		poolsFree.remove(0);
    		poolsUsed.add(resource);
    		return resource;
    	}else
    		throw new NoSuchElementException();
    }
    
    public boolean hasAvailableResource(){
    	return this.poolsFree.get(0) == null;
    }
    public void freeRessource(R resource ){
    	int indexResourceUsed = this.poolsUsed.indexOf(resource);
    	if(indexResourceUsed != -1){
    		this.poolsUsed.remove(indexResourceUsed);
    		this.poolsFree.add(resource);
    	}//else
    		//throw new NoGetArgumentExceptof();
    }
    
        
    public ArrayList<R> getPoolsFree() {
        return poolsFree;
    }

    public void setPoolsFree(ArrayList<R> poolsFree) {
        this.poolsFree = poolsFree;
    }

    public ArrayList<R> getPoolsUsed() {
        return poolsUsed;
    }

    public void setPoolsUsed(ArrayList<R> poolsUsed) {
        this.poolsUsed = poolsUsed;
    }
}
