package designpattern.Structural_Pattern.adapter;

import designpattern.Creating_Pattern.prototype.Apple;
import designpattern.Creating_Pattern.prototype.MyFruit;

/*
 * 适配器模式:将一个旧的接口，转换成一个客户需要的另一个接口。
 * 
 * 就是利用旧接口的功能来实现新接口的功能。
 * 
 * 有一个类模式和对象模式:(感觉并没有太大的区别)
 * 	类模式:新接口的实现类通过继承的方式获得老接口的功能
 * 	对象模式:新接口的实现类 通过老接口的对象来获得老接口的功能(需要旧接口有实现类)
 * 
 * 感觉对象模式耦合性更低一点，而且新接口的实现类还要实现老接口的功能感觉怪怪的。
 * 
 * 优点:增加了类的复用性(旧系统的功能直接使用),透明度（有透明度，但感觉不像是这个模式特有的优点）...
 * */
public class Main {
	
	public static void main(String[] args) {
		
		// 买水果过程省略。。。直接榨汁
		MyFruit f = new Apple();
		NewJucier jucier = new MyJucier();
		jucier.twoPort(f, f);
	}
}
