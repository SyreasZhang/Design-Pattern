package designpattern.BehavioralPattern.State;

import java.lang.Thread.State;

public class RunningState extends ThreadState{
	public RunningState() {
		state = StateSet.RUNNING;
		System.out.println("运行线程");
	}
	
	public void block(ThreadContext tc) {
		System.out.println("调用block方法");
		if(state == StateSet.RUNNING)
			tc.setThreadState(new BlockedState());
		else
			System.out.println("当前线程不是运行状态");
	}

	public void stop(ThreadContext tc) {
		System.out.println("调用stop方法");
		if(state == StateSet.RUNNING)
			tc.setThreadState(new DeadState());
		else
			System.out.println("当前线程不是运行状态");
	}
}
