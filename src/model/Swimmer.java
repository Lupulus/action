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
   
    private final String name;
    private final BasketPool basketPool;
    private final CubiclePool cubiclePool;
    private final int undressingTime;
    private final int swimmingTime;
    private final int dressingTime;

    public Swimmer(String name, BasketPool basketPool, CubiclePool cubiclePool, int undressingTime, int swimmingTime, int dressingTime) {
        this.name = name;
        this.basketPool = basketPool;
        this.cubiclePool = cubiclePool;
        this.undressingTime = undressingTime;
        this.swimmingTime = swimmingTime;
        this.dressingTime = dressingTime;
    }
    
    
    
}
