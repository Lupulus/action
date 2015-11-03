package action;

import exception.ActionFinishedException;


public class Foreseable extends Action {

        private int remainingTime;
	private int totalTime;
	
	public Foreseable(int timeToEnd){
		super();
		this.totalTime = timeToEnd;
		this.remainingTime = timeToEnd;
	}
	
	public int getRemainingTime() {
		return remainingTime;
	}

	public int getTotalTime() {
		return totalTime;
	}

	/**
	 * Do a step for the action
	 */
        @Override
	public void doStep() throws ActionFinishedException{
		super.doStep();
		if(this.remainingTime == 0)
			throw new ActionFinishedException();
		this.remainingTime--;
	}
	
	public boolean isFinished(){
		return this.remainingTime == 0;
	}
}
	
