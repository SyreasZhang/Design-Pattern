package designpattern.Creating_Pattern.AbstractFactroy;

import designpattern.Creating_Pattern.factory.Fruit;

public interface BFruitAndVegetables {
	Fruit CreateF();
	Vegetables CreateV();
}
