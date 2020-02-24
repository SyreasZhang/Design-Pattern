package hk4_builderandabstractfactory.factory;

import hk4_builderandabstractfactory.Food.dessert.Cake;
import hk4_builderandabstractfactory.Food.dessert.Dessert;
import hk4_builderandabstractfactory.Food.drink.Drink;
import hk4_builderandabstractfactory.Food.drink.Wine;
import hk4_builderandabstractfactory.Food.mainfood.Chicken;
import hk4_builderandabstractfactory.Food.mainfood.MainFood;

public class WesternFoodFactory implements Factory{

	@Override
	public MainFood createMainFood() {
		return new Chicken();
	}

	@Override
	public Dessert createDessert() {
		return new Cake();
	}

	@Override
	public Drink createDrink() {
		return new Wine();
	}

}
