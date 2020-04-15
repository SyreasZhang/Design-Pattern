package designpattern.Creating_Pattern.AbstractFactroy;

import designpattern.Creating_Pattern.factory.Apple;
import designpattern.Creating_Pattern.factory.Fruit;

public class AConF implements AFruitAndVegetables{

	@Override
	public Fruit CreateF() {
		return new Apple();
	}

	@Override
	public Vegetables CreateV() {
		return null;
	}
	
}
