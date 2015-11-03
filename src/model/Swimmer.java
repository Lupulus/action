/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import action.FreeResourceAction;
import action.SequentialScheduler;
import action.SwimmerForeseableAction;
import action.TakeResourceAction;
import exception.ActionFinishedException;
import resource.Basket;
import resource.BasketPool;
import resource.Cubicle;
import resource.CubiclePool;
import resource.ResourcefulUser;

/**
 *
 * @author barbe
 */
public class Swimmer extends SequentialScheduler {
   
    private String name;
    private BasketPool basketPool;
    private CubiclePool cubiclePool;
    private int undressingTime;
    private int swimmingTime;
    private int dressingTime;  
    private ResourcefulUser<Basket> basket;
    private ResourcefulUser<Cubicle> cubicle;

    public Swimmer(String name, BasketPool basketPool, CubiclePool cubiclePool, int undressingTime, int swimmingTime, int dressingTime) {
        this.name = name;
        this.basketPool = basketPool;
        this.cubiclePool = cubiclePool;
        this.undressingTime = undressingTime;
        this.swimmingTime = swimmingTime;
        this.dressingTime = dressingTime;
        this.basket = new ResourcefulUser<Basket>(this);
	this.cubicle = new ResourcefulUser<Cubicle>(this);
		
	this.addAction(new TakeResourceAction<Basket>(this.basketPool, this.basket));
	this.addAction(new TakeResourceAction<Cubicle>(this.cubiclePool, this.cubicle));
	this.addAction(new SwimmerForeseableAction(this.undressingTime, name+" undressing"));
	this.addAction(new FreeResourceAction<Cubicle>(this.cubiclePool, this.cubicle));
	this.addAction(new SwimmerForeseableAction(this.swimmingTime, name+" swimming"));
	this.addAction(new TakeResourceAction<Cubicle>(this.cubiclePool, this.cubicle));
	this.addAction(new SwimmerForeseableAction(this.dressingTime, name+" dressing"));
	this.addAction(new FreeResourceAction<Cubicle>(this.cubiclePool, this.cubicle));
	this.addAction(new FreeResourceAction<Basket>(this.basketPool, this.basket));
    }
    
    /**
    * @see SequentialScheduler#doStep()
    */
    @Override
    public void doStep() throws ActionFinishedException {
	System.out.println(this.name + "'s turn");
            super.doStep();
    }
	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BasketPool getBasketPool() {
        return basketPool;
    }

    public void setBasketPool(BasketPool basketPool) {
        this.basketPool = basketPool;
    }

    public CubiclePool getCubiclePool() {
        return cubiclePool;
    }

    public void setCubiclePool(CubiclePool cubiclePool) {
        this.cubiclePool = cubiclePool;
    }

    public int getUndressingTime() {
        return undressingTime;
    }

    public void setUndressingTime(int undressingTime) {
        this.undressingTime = undressingTime;
    }

    public int getSwimmingTime() {
        return swimmingTime;
    }

    public void setSwimmingTime(int swimmingTime) {
        this.swimmingTime = swimmingTime;
    }

    public int getDressingTime() {
        return dressingTime;
    }

    public void setDressingTime(int dressingTime) {
        this.dressingTime = dressingTime;
    }
    
    
    
    
}
