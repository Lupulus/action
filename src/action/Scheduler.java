package action;

import exception.ActionFinishedException;
import java.util.ArrayList;
import java.util.List;


public abstract class Scheduler extends Action {
	protected List<Action> actions;
	
	public Scheduler() {
		super();
		this.actions = new ArrayList<Action>();
	}
	
	/**
	 * @see action.Action#doStep()
	 */
	public void doStep() throws ActionFinishedException{
		super.doStep();
		if(this.actions.isEmpty()){
			throw new ActionFinishedException();
		}
	}
	
	public boolean isReady() {
		return super.isReady();	
	}
	
	public boolean isInProgress() {
		return super.isInProgress();
	}
	
	public boolean isFinished() {
		return this.actions.isEmpty();
	}
	
	/**
	 * Add an action in the scheduler
	 * @param a Action added
	 */
	public void addAction(Action a) {
		this.actions.add(a);
	}
	
	
}
