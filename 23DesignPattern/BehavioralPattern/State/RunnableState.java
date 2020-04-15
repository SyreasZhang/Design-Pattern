package designpattern.BehavioralPattern.State;

import java.lang.Thread.State;

public class RunnableState extends ThreadState{
	public RunnableState() {
		state = StateSet.RANNABLE;
		System.out.println("就绪线程");
	}


	public void run(ThreadContext tc) {
		System.out.println("调用run方法");
		if(state == StateSet.RANNABLE)
			tc.setThreadState(new RunningState());
		else
			System.out.println("当前线程不是就绪状态");
	}


}
