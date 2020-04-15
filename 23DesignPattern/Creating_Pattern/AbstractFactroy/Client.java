package designpattern.Creating_Pattern.AbstractFactroy;

import designpattern.Creating_Pattern.factory.Fruit;

/*抽象工厂模式
 *开闭原则的倾斜性:增加产品族时，需要修改工厂代码CreatXXX() 
 * 	但是在产品族类添加新的产品就很困难
 * 	比如生成汽车和汽车配件的工厂，突然要生成空调，就需要对工厂进行改造
 * 	但是添加一辆新型汽车却很简单。
 * 
 * 和普通工厂模式不同的是，抽象工厂模式可以一个工厂生产多个不同产品族的东西（有点像大企业和小企业的区别）
 * 
 *
 * */
public class Client {
	public static void main(String[] args) {
		// A工厂
		// A工厂要生产水果
		AFruitAndVegetables a = new AConF();
		Fruit f = a.CreateF();
		f.eat();
		// A工厂要生产素菜
		a = new AConV();
		Vegetables v = a.CreateV();
		v.eat();
	}
}
