package hk4_builderandabstractfactory.factory;

import hk4_builderandabstractfactory.Food.dessert.Dessert;
import hk4_builderandabstractfactory.Food.dessert.Fruit;
import hk4_builderandabstractfactory.Food.drink.Drink;
import hk4_builderandabstractfactory.Food.drink.Water;
import hk4_builderandabstractfactory.Food.mainfood.MainFood;
import hk4_builderandabstractfactory.Food.mainfood.Rice;

public class ChineseFoodFactory implements Factory{

	@Override
	public MainFood createMainFood() {
		return new Rice();
	}

	@Override
	public Dessert createDessert() {
		return new Fruit();
	}

	@Override
	public Drink createDrink() {
		return new Water();
	}

}
