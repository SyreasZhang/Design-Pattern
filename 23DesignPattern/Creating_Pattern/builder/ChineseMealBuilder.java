package designpattern.Creating_Pattern.builder;

public class ChineseMealBuilder extends MealBuilder{

	@Override
	public void builderFood() {
		meal.setFood(new Rice());
		
	}

	@Override
	public void builderDrink() {
		meal.setDrink(new Water());
		
	}

}
