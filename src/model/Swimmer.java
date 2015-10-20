/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import resource.BasketPool;
import resource.CubiclePool;

/**
 *
 * @author barbe
 */
public class Swimmer {
   
    private String name;
    private BasketPool basketPool;
    private CubiclePool cubiclePool;
    private int undressingTime;
    private int swimmingTime;
    private int dressingTime;

    public Swimmer(String name, BasketPool basketPool, CubiclePool cubiclePool, int undressingTime, int swimmingTime, int dressingTime) {
        this.name = name;
        this.basketPool = basketPool;
        this.cubiclePool = cubiclePool;
        this.undressingTime = undressingTime;
        this.swimmingTime = swimmingTime;
        this.dressingTime = dressingTime;
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
