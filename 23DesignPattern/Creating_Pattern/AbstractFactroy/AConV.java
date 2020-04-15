package designpattern.Creating_Pattern.AbstractFactroy;

import designpattern.Creating_Pattern.factory.Fruit;

public class AConV implements AFruitAndVegetables{

	@Override
	public Fruit CreateF() {

		return null;
	}

	@Override
	public Vegetables CreateV() {
		return new Tomato();
	}
	
}
