package hk4_builderandabstractfactory.factory;

import hk4_builderandabstractfactory.Food.dessert.Dessert;
import hk4_builderandabstractfactory.Food.drink.Drink;
import hk4_builderandabstractfactory.Food.mainfood.MainFood;

public interface Factory {
	public MainFood createMainFood();
	public Dessert createDessert();
	public Drink createDrink();
}
