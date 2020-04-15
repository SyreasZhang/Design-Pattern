package designpattern.Creating_Pattern.prototype;

/*
 * 原型模式:使用一个对象深拷贝一个一模一样的对象出来
 * 适用于:对象的创建比较复杂，而且有时候需要频繁创建
 * 
 * 实现办法:java中实现Cloneable接口，然后重载Clone方法
 * 
 * 通常会有一个原型管理器，就像定做生日蛋糕的时候，给你一个展示柜或者菜单给你选择，
 * 然后师傅照着模子给你做一个出来。
 * */
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 理论实验
		MyFruit f1 = new Apple();
		MyFruit f2 = f1;			// 直接指向f1
		MyFruit f3 = (MyFruit) f1.clone();	// 调用clone方法
		f1.display();			
		f2.display();		
		f3.display();				
		// 运行结果:都是苹果，但是f1和f2 hashcode相同，f3 hashcode不相同
		
		// 原型管理器
		MyFruitStore.add(1, f1);
		MyFruitStore.get(1).display();		// 拿三个
		MyFruitStore.get(1).display();
		MyFruitStore.get(1).display();
		// 运行结果hashcode各不相同
	}
}
