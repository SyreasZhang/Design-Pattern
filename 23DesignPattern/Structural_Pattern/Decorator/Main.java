package designpattern.Structural_Pattern.Decorator;

import designpattern.Creating_Pattern.prototype.Apple;

/*
 * 装饰模式:动态的给一个对象增加一些额外的职责(Responsibility)
 * 
 * 和适配器模式的区别:
 * 			1、我觉得最主要的一点是没有新的接口生成,而是在旧父类基础上，进行装饰。
 * 				(感觉这么说也不严谨...就是包装了以后本质没有变，只是功能上动态的增加了)
 * 				一个是把旧车升级了（装饰模式），一个是开着旧车买了一台新车(适配器模式)
 * 			2、。。。。。
 * 
 * 类的结构和组合模式很像，但是感觉使用情况差距很大
 * 
 * 实现细节:包装类和具体类都继承自一个类
 * 			包装类中有一个抽象类的对象（原模样）
 * 			同时包装类会有很多子类，不同的子类是不同的包装。
 * */

public class Main {
	public static void main(String[] args) {
		// 准备做蛋糕
		IBirthdayCake cake = new Cake();	// 拿出一个毛坯出来,可能是16寸，可能是8寸的(没有设计)
		// 想做一个奶油蛋糕
		IBirthdayCake creamCake = new Cream(cake);	
		creamCake.show();
		// 再做一个水果蛋糕
		IBirthdayCake fruitCake = new FruitCake(cake,new Apple());
		fruitCake.show();
	}
}
