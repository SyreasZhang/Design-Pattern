package designpattern.Structural_Pattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Plate extends MyElement{
	List<MyElement> list = new ArrayList<MyElement>();
	
	@Override
	public void eat() {
		for (MyElement myElement : list) {
			myElement.eat();
		}
	}
	
	public void add(MyElement e) {
		list.add(e);
	}
	
	public void remove(MyElement e) {
		list.remove(e);
	}

}
