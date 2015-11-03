package test;

import action.Action;
import action.FairScheduler;
import action.Foreseable;
import action.Scheduler;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.ActionFinishedException;

public class FairSchedulerTest {

	private Scheduler sc;

	@Before
	public void setUp() throws Exception {
		this.sc = new FairScheduler();
	}

	@Test
	public void scheduler() {
		Action a1 = new Foreseable(2);
		Action a2 = new Foreseable(1);
		
		sc.addAction(a1);
		sc.addAction(a2);
		
		assertTrue(a1.isReady());
		assertTrue(a2.isReady());
		
		try {
			sc.doStep();
		} catch (ActionFinishedException e) {
			fail("Exception Catched");
		}
		
		assertTrue(a1.isInProgress());
		assertTrue(a2.isReady());
		
		try {
			sc.doStep();
		} catch (ActionFinishedException e) {
			fail("Exception Catched");
		}
		
		assertTrue(a1.isInProgress());
		assertTrue(a2.isFinished());
		
		try {
			sc.doStep();
		} catch (ActionFinishedException e) {
			fail("Exception Catched");
		}
		
		assertTrue(a1.isFinished());
		assertTrue(a2.isFinished());
	}
	
	@Test
	public void schedulerWithScheduler() {
		Scheduler subSc = new FairScheduler();
		Action a1 = new Foreseable(2);
		Action a2 = new Foreseable(1);
		
		subSc.addAction(a1);
		subSc.addAction(a2);
		sc.addAction(subSc);
		
		assertTrue(a1.isReady());
		assertTrue(a2.isReady());
		assertTrue(subSc.isReady());
		
		try {
			sc.doStep();
		} catch (ActionFinishedException e) {
			fail("Exception Catched");
		}
		
		assertTrue(subSc.isInProgress());
		assertTrue(a1.isInProgress());
		assertTrue(a2.isReady());
		
		try {
			sc.doStep();
		} catch (ActionFinishedException e) {
			fail("Exception Catched");
		}
		
		assertTrue(subSc.isInProgress());
		assertTrue(a1.isInProgress());
		assertTrue(a2.isFinished());
		
		try {
			sc.doStep();
		} catch (ActionFinishedException e) {
			fail("Exception Catched");
		}
		
		assertTrue(subSc.isFinished());
		assertTrue(a1.isFinished());
		assertTrue(a2.isFinished());
	}

}
