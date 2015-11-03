/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import action.FairScheduler;
import exception.ActionFinishedException;
import resource.BasketPool;
import resource.CubiclePool;

/**
 *
 * @author barbe
 */
public class Pool {
    
    public static void main(String[] args) {
        BasketPool baskets = new BasketPool(6);
	CubiclePool cubicles = new CubiclePool(3);
	FairScheduler s = new FairScheduler();
        
	s.addAction(new Swimmer("Camille", baskets, cubicles, 6, 4, 8));
	s.addAction(new Swimmer("Lois", baskets, cubicles, 2, 10, 4));
	s.addAction(new Swimmer("Mae", baskets, cubicles, 10, 18, 10));
	s.addAction(new Swimmer("Ange", baskets, cubicles, 3, 7, 5));
	s.addAction(new Swimmer("Louison", baskets, cubicles, 18, 3, 3));
	s.addAction(new Swimmer("Charlie", baskets, cubicles, 3, 6, 10));
	s.addAction(new Swimmer("Alexis", baskets, cubicles, 6, 5, 7));
	
        int nbSteps = 0;
	while (!s.isFinished()) {
            nbSteps++;
            try {
		s.doStep();
            } catch (ActionFinishedException e) {
		e.printStackTrace();
            }
	}
	System.out.println("Finished in " + nbSteps + " steps");
    }
}
