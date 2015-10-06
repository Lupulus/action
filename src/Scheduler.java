
public class Scheduler extends ActionComponent {
	/**
	 * Instantiate a Scheduler
	 */

	public Scheduler(int timeToEnd) {
		super(timeToEnd = 0);
	}

	/**
	 * return true is isInitialized and isReady are true, return false if not
	 * @return boolean
	 */
	public boolean isReady(){
		return super.isInitialized && super.isReady;
	}
	/**
	 * return true is isInitialized, isReady() and isFinished are true, false if not
	 * @return boolean
	 */
	public boolean isInProgress(){
		return super.isInitialized && !isReady() && !isFinished();
	}
	
	/**
	 * return true if isInitiliazed, isReady are true and if the ArrayList actions is at the end
	 * return false if not
	 * @return boolean
	 */
	public boolean isFinished(){
		return super.isInitialized && !isReady() && actions.isEmpty();
	}
	
	
	/**
	 * 
	 */
	public void doStep(){
		super.isReady = false;
		ActionComponent nextAction = super.actions.get(0);
		nextAction.doStep();
		if(nextAction.isFinished()){
			super.actions.remove(0);
		}
	}
	
	
	
	
	
	
}
