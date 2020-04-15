package designpattern.Creating_Pattern.factory;

public class AFactory extends Factory {

	@Override
	public Fruit CreateFruit() {
		// TODO Auto-generated method stub
		return new Apple();
	}
	
	
}
