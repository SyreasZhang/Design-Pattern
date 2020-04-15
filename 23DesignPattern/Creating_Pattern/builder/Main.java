package designpattern.Creating_Pattern.builder;

/*
 * 建造者模式:将零件组装成一个整体
 * 
 * 和抽象工厂结合起来理解，一个生产零件，一个组装零件(当然抽象工厂生产的不一定是零件，就是觉得不是生产的零件的话，感觉工厂模式更美观些)
 * 
 * 适用于:一个对象的创建需要多个对象组装
 * */

public class Main {
	public static void main(String[] args) {
		Waiter w = new Waiter();
		w.setMealBuilder(new AmericanMealBuilder());
		System.out.println(w.construct());
		
		w.setMealBuilder(new ChineseMealBuilder());
		System.out.println(w.construct());
		// 封装得很完美，只要点餐就可以了
		// 但是写起来很麻烦，容易出现对象忘记初始化的问题
	}
}
