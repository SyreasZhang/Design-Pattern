package designpattern.BehavioralPattern.State;

public class ThreadContext {
	private ThreadState state;
	
	public ThreadContext() {
		state = new NewState();
	}

	public ThreadState getState() {
		return state;
	}

	public void setThreadState(ThreadState state) {
		this.state = state;
	}
	
	public void start() {
		((NewState)state).start(this);
	}
	
	public void getCPU() {
		((RunnableState)state).run(this);
	}
	
	public void suspend() {
		((RunningState)state).block(this);
	}
	
	public void resume() {
		((BlockedState)state).resume(this);
	}
	
	public void stop(){
		((RunningState)state).stop(this);
	}
}
