package Action;


public class Foreseable extends ActionComponent {

	public Foreseable(int timeToEnd){
		super(timeToEnd);
	}
	
	public boolean isReady(){
		return remainingTime == totalTime;
	}
	
	public boolean isInProgress(){
		return !isReady() && !isFinished();
	}
	
	public boolean IsFinished(){
		return remainingTime <= 0;
	}
	
	public void doStep(){
		remainingTime--;
	}
}
