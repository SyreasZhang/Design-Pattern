package designpattern.BehavioralPattern.State;

import java.lang.Thread.State;

public class BlockedState extends ThreadState{
	public BlockedState() {
		state = StateSet.BLOCKED;
		System.out.println("新建线程");
	}
	
	

	public void resume(ThreadContext tc) {
		System.out.println("调用resume方法");
		if(state == StateSet.BLOCKED)
			tc.setThreadState(new RunningState());
		else
			System.out.println("当前线程不是堵塞状态");
	}

}
