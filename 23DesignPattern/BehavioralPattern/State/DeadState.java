package designpattern.BehavioralPattern.State;

import java.lang.Thread.State;

public class DeadState extends ThreadState{
	public DeadState() {
		state = StateSet.DEAD;
		System.out.println("死亡线程");
	}
	
}
