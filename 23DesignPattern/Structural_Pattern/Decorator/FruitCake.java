package designpattern.Structural_Pattern.Decorator;

import designpattern.Creating_Pattern.prototype.MyFruit;

public class FruitCake extends CakeDecorator{
	private MyFruit f = new MyFruit();
	
	public FruitCake(IBirthdayCake cake,MyFruit f) {
		super(cake);
		this.f = f;
	}

	

	@Override
	public void show() {
		getCake().show();
		System.out.println("给上面加上"+f.getKind());
	}

	public MyFruit getF() {
		return f;
	}

	public void setF(MyFruit f) {
		this.f = f;
	}
}
