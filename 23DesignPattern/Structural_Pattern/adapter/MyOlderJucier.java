package designpattern.Structural_Pattern.adapter;

import designpattern.Creating_Pattern.prototype.MyFruit;

public class MyOlderJucier implements OlderJucier{

	@Override
	public void onePort(MyFruit f) {
		System.out.println("把"+f.getKind()+"榨成了汁");
	}

}
