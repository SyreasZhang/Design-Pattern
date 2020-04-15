package designpattern.Creating_Pattern.factory;

/*
 * 工厂模式:将创建对象的细节给封装，使得用户没有必要知道具体的类。
 * 适用于那些创建很麻烦的类，或者需要隐藏对象创建细节的情况
 * 缺点:麻烦需要写很多的类
 * 
 * 可以通过配置文件，来实现多态性。
 * */

public class Client {
	public static void main(String[] args) {
		Factory afactory = new AFactory();
		Fruit fruit = afactory.CreateFruit();
		fruit.eat();
		Factory bfactory = new BFactory();
		fruit =bfactory.CreateFruit();
		fruit.eat();
	}
}
