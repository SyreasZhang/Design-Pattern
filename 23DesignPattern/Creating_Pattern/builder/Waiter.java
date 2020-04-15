package designpattern.Creating_Pattern.builder;

public class Waiter {
	MealBuilder mb;
	
	public void setMealBuilder(MealBuilder mb) {
		this.mb = mb;
	}
	
	public Meal construct() {
		if(mb == null) return null;
		mb.builderDrink();
		mb.builderFood();
		return mb.getMeal();
	}
}
