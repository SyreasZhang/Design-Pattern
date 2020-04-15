package designpattern.Creating_Pattern.AbstractFactroy;

import designpattern.Creating_Pattern.factory.Banana;
import designpattern.Creating_Pattern.factory.Fruit;

public class BConF implements BFruitAndVegetables{

	@Override
	public Fruit CreateF() {
		// TODO Auto-generated method stub
		return new Banana();
	}

	@Override
	public Vegetables CreateV() {
		// TODO Auto-generated method stub
		return null;
	}

}
