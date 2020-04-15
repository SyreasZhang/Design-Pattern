package designpattern.Structural_Pattern.bridge;

/*
 * 桥接模式:将抽象与实现分离，使得他们可以独立变化（如果直接实现接口，那么接口改变，实现也要一起改变）
 * 	    本质:利用组合关系代替继承关系。(就是合成复用原则)
 * 
 * 优点:扩展性强(不用考虑接口和继承的关系),透明度....
 * 
 * 缺点:增加了设计和理解的难度
 * */

public class Main {
	public static void main(String[] args) {
		Pen pen = new Pen();
		pen.setBrush(new SmallBrush());
		pen.setColor(new Red());
		pen.draw("多啦a梦");
	}
}
