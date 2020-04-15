package designpattern.Creating_Pattern.Singleton;

import java.util.Hashtable;

import designpattern.Creating_Pattern.prototype.MyFruit;

// 单例模式的水果店
public class MyFruitStore_s {
	private static MyFruitStore_s fruitStore;		// 关键点1:静态对象来保存一个类的实例(不是static不能保证一个)
	private Hashtable<Integer, MyFruit> fruitTables;
	
	private MyFruitStore_s() {					// 关键点2:私有化构造，这样外面就不能创建对象
		fruitTables = new Hashtable<Integer, MyFruit>();
	}

	public static MyFruitStore_s getFruitStore() {			// 关键点3:能从外部得到这个对象
		if(fruitStore == null) fruitStore = new MyFruitStore_s();	// 关键点4:只能创建一次对象
		// 懒汉式创建
		return fruitStore;								
	}		
	
	public void add(Integer key,MyFruit f) {		// 给展示柜中添加样品
		fruitTables.put(key, f);
	}
	
	public  MyFruit get(Integer key) {				// 照着你选的样子，给你再拿一个一样的
		try {
			return (MyFruit) fruitTables.get(key).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
