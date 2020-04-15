package designpattern.Creating_Pattern.Singleton;

import designpattern.Creating_Pattern.prototype.Apple;

/*单例模式:一个系统中只允许有一个实例（一时间想不出什么好案例了）
 * 
 * 在prototype模式的水果店中:MyFruitStory是利用静态类方式来实现只有一个水果店的
 * 但是如果需要用对象来实现只有一个水果店，就可以用单例模式了。
 * 
 * 实现过程，私有化构造方法，然后在类的内部来创建唯一一个对象，然后需要的时候利用静态方法返回出去
 * 
 * 懒汉式:需要的时候创建对象
 * 饿汉式:第一次使用类的时候就创建对象
 * */

public class Main {
		public static void main(String[] args) {
			// 找到商店
			MyFruitStore_s fruitStrore = MyFruitStore_s.getFruitStore();
			System.out.println("fruitStore:"+fruitStrore.hashCode());
			// 添加商品
			fruitStrore.add(1, new Apple());			
			fruitStrore.get(1).display();
			
			// 回购
			fruitStrore = MyFruitStore_s.getFruitStore();
			System.out.println("fruitStore:"+fruitStrore.hashCode());		
			fruitStrore.get(1).display();
			
			// 运行结果:店还是原来那个店，苹果却不是当时的那一个苹果了
		}
}
