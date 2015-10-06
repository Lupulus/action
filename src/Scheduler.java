
public class Scheduler extends ActionComponent {
	/**
	 * Instantiate a Scheduler
	 */
	
	public Scheduler(){
		super.totalTime = 0;
	}
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean isReady(){
		return super.isInitialized && isReady();
	}
	
	public boolean isInProgress(){
		return super.isInitialized && !isReady() && !isFinished();
	}
	
	public boolean isFinished(){
		return super.isInitialized && !isReady() && actions.isEmpty();
	}
	
	public void doStep(){
		super.isReady = false;
		Action nextAction = super.actions.get(0);
		nextAction.doStep();
		if(nextAction.isFinished()){
			super.actions.remove(0);
		}
	}
	
	
	
	
	
	
}
