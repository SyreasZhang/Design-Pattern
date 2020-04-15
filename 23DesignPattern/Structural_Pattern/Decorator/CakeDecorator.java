package designpattern.Structural_Pattern.Decorator;

public abstract class CakeDecorator implements IBirthdayCake{		// 装饰器我觉得抽象的可能好一点
	private IBirthdayCake cake;

	public IBirthdayCake getCake() {
		return cake;
	}

	public CakeDecorator(IBirthdayCake cake) {
		super();
		this.cake = cake;
	}
	
	
	
}
