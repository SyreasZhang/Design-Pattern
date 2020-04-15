package designpattern.Creating_Pattern.AbstractFactroy;

import designpattern.Creating_Pattern.factory.Fruit;

public class BConV implements BFruitAndVegetables{

	@Override
	public Fruit CreateF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vegetables CreateV() {
		// TODO Auto-generated method stub
		return new Carrot();
	}

}
