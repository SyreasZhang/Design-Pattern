package hk5;

import hk5.builder.MyComputBuilder;

public class Main {
	public static void main(String[] args) {
		// 利用构造者来生产计算机
		OldComputer oldComputer = new MyComputBuilder().buildComputer();
		oldComputer.show();
		// 套用另一个接口，升级
		NewComputer newComputer = (MyComputer)oldComputer;
		newComputer.update();
	}
}
