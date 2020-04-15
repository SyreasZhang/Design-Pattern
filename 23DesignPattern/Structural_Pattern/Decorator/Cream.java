package designpattern.Structural_Pattern.Decorator;

public class Cream extends CakeDecorator{
	
	public Cream(IBirthdayCake cake) {
		super(cake);
	}

	@Override
	public void show() {
		getCake().show();
		System.out.println("铺上一层甜甜的奶油");
	}

}
