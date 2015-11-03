package test;

import action.Action;
import action.Foreseable;
import action.Scheduler;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SchedulerTest {
	
	private Scheduler sc;

	@Before
	public void setUp() throws Exception {
		this.sc = new Scheduler() {};
	}
	
	@Test
	public void schedulerEmptyAtStart() {
		assertEquals(0, sc.actions.size());
	}

	@Test
	public void addActionTest() {
		Action a = new Foreseable(1);
		sc.addAction(a);
		assertEquals(1, sc.actions.size());
	}
}
