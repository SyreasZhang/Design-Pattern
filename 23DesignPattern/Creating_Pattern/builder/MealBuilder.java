package designpattern.Creating_Pattern.builder;

public abstract class MealBuilder {
	protected Meal meal = new Meal();
	
	abstract public void builderFood();
	abstract public void builderDrink();
	
	public Meal getMeal() {
		return meal;
	}
}
