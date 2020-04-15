package designpattern.Creating_Pattern.prototype;

import java.util.Hashtable;

public class MyFruitStore {
	private static Hashtable<Integer,MyFruit> myStore= new Hashtable<Integer, MyFruit>();
	
	public static void add(Integer key,MyFruit f) {		// 给展示柜中添加样品
		myStore.put(key, f);
	}
	
	public static MyFruit get(Integer key) {				// 照着你选的样子，给你再拿一个一样的
		try {
			return (MyFruit) myStore.get(key).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
