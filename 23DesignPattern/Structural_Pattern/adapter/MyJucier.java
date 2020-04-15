package designpattern.Structural_Pattern.adapter;

import designpattern.Creating_Pattern.prototype.MyFruit;

public class MyJucier implements NewJucier/*,OlderJucier*/{
	OlderJucier jucier = new MyOlderJucier();
	

//	@Override
//	public void onePort(MyFruit f) {
//		System.out.println("把"+f.getKind()+"榨成了汁");
//		
//	}

	@Override
	public void twoPort(MyFruit f1, MyFruit f2) {
		jucier.onePort(f1);
		jucier.onePort(f2);
	}
		
}
