package hk4_builderandabstractfactory;

import hk4_builderandabstractfactory.Food.dessert.Dessert;
import hk4_builderandabstractfactory.Food.drink.Drink;
import hk4_builderandabstractfactory.Food.mainfood.MainFood;

public class Meal {
	private MainFood mainFood;
	private Drink drink;
	private Dessert dessert;
	
	public MainFood getMainFood() {
		return mainFood;
	}
	public void setMainFood(MainFood mainFood) {
		this.mainFood = mainFood;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	@Override
	public String toString() {
		return String.format("您吃的是%s,%s和%s",mainFood.toString(),drink.toString(),
				dessert.toString());
	}
	
	
}
