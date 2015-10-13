package action;


public class Foreseable extends ActionComponent {

	public Foreseable(int timeToEnd){
		super(timeToEnd);
	}
	
        @Override
	public boolean isReady(){
		return remainingTime == totalTime;
	}
	
        @Override
	public boolean isInProgress(){
		return !isReady() && !isFinished();
	}
	
	public boolean IsFinished(){
		return remainingTime <= 0;
	}
	
        @Override
	public void doStep(){
		remainingTime--;
	}
}
