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
public abstract class ResourcePool {
    
    private ArrayList pools;

    public ResourcePool(int poolNumber) {
        pools = new ArrayList();
        for(int i=0; i < poolNumber; i++)
            pools.add(factoryMethod());
    }

    
    public Resource factoryMethod(){
        return new Resource();
    }
    
    public ArrayList getPools() {
        return pools;
    }

    public void setPools(ArrayList pools) {
        this.pools = pools;
    }
    
    
}
