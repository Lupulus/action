package Action;


import java.util.ArrayList;

public class ActionComponent {

    protected final int totalTime;
    protected int remainingTime;

    protected boolean isReady = true;
    protected boolean isInitialized;

    protected boolean isScheduler;

    //this variable is only used for schedulers
    protected final ArrayList<ActionComponent> actions = new ArrayList<ActionComponent>();

    public ActionComponent(int timeToEnd) {
        this.totalTime= timeToEnd;
    }

    public boolean isReady() {
        return false;
    }

    public boolean isInProgress() {
        return false;
    }

    public boolean isFinished() {
        return false;
    }

    public void doStep() {

    }

    public void addAction(ActionComponent action) {
        isInitialized = true;
        if (action.isFinished()) {
            throw new IllegalArgumentException("Can't add an already finished action");
        }
        if (isFinished()) {
            throw new IllegalStateException("You can't add an action to finish a scheduler");
        } else {
            actions.add(action);
        }
    }
}
