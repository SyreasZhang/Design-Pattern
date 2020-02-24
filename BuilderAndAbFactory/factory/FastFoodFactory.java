package hk4_builderandabstractfactory.factory;

import hk4_builderandabstractfactory.Food.dessert.Dessert;
import hk4_builderandabstractfactory.Food.dessert.IceCream;
import hk4_builderandabstractfactory.Food.drink.Cola;
import hk4_builderandabstractfactory.Food.drink.Drink;
import hk4_builderandabstractfactory.Food.mainfood.MainFood;
import hk4_builderandabstractfactory.Food.mainfood.hamburger;

public class FastFoodFactory implements Factory{

	@Override
	public MainFood createMainFood() {
		return new hamburger();
	}

	@Override
	public Dessert createDessert() {
		return new IceCream();
	}

	@Override
	public Drink createDrink() {
		return new Cola();
	}

}
