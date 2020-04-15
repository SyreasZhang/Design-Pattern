package designpattern.Creating_Pattern.builder;

public class Meal {
	private Food food;
	private Drink drink;
	
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	@Override
	public String toString() {
		return "你吃的是"+food.toString()+"，喝的是"+drink.toString();
	}
	
	
	
}
