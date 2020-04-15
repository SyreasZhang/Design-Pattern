package designpattern.BehavioralPattern.State;

/*
 * 状态模式:把复杂的判读逻辑提取到不同的状态对象中，允许状态对象在其内部状态发生改变是改变其行为。
 * 
 * 将需要if-else语句判读状态来取得下一步行动时，动态的调用状态中的相对应的方法来避免判断（多态）。
 * 不仅需要包装状态，还需要包装状态对应的方法。if(true) 后的语句(多创建了很多类)
 * 
 *不是很推荐这个例子中的方法（非正常调用顺序ClassCastExceotion,用try包起来就好了）..但是可以少敲好多代码
 * */

public class Main {
	public static void main(String[] args) {
		ThreadContext tc = new ThreadContext();
		tc.start();
		tc.getCPU();
		tc.suspend();
		tc.resume();
		tc.stop();
	}
}
