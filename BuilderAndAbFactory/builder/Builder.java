package hk4_builderandabstractfactory.builder;

import hk4_builderandabstractfactory.Meal;
import hk4_builderandabstractfactory.factory.Factory;

public abstract class Builder {
		protected Meal meal = new Meal();
		protected Factory factory;
		
		
		public void setMeal() {
			meal.setDessert(factory.createDessert());
			meal.setDrink(factory.createDrink());
			meal.setMainFood(factory.createMainFood());
		}
		
		public Meal getMeal() {
			return meal;
		}

}
