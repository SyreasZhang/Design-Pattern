package hk4_builderandabstractfactory.builder;

import hk4_builderandabstractfactory.factory.WesternFoodFactory;

public class WesternFoodBuilder extends Builder{
	public WesternFoodBuilder() {
		factory = new WesternFoodFactory();
		this.setMeal();
	}
}
