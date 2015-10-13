package Test;

import Action.Scheduler;
import static org.junit.Assert.*;

import org.junit.Test;


public class SchedulerTest {

	@Test
	public void createTest() {
		Scheduler scheduler1 = new Scheduler(0);
		assertNotNull(scheduler1);
	}
	
	@Test
	public void isReadyTest(){
		Scheduler scheduler2 = new Scheduler(0);
	}
	

}
