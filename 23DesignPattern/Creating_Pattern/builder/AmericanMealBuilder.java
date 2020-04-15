package designpattern.Creating_Pattern.builder;

public class AmericanMealBuilder extends MealBuilder{

	@Override
	public void builderFood() {
		meal.setFood(new Chicken());
		
	}

	@Override
	public void builderDrink() {
		meal.setDrink(new Cola());	
	}

}
