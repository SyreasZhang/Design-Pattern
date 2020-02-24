package hk4_builderandabstractfactory.builder;

import hk4_builderandabstractfactory.factory.FastFoodFactory;

public class FastFoodBuilder extends Builder{
	public FastFoodBuilder() {
		 factory = new FastFoodFactory();
		 this.setMeal();
	}
}
