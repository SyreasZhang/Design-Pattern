package hk4_builderandabstractfactory.builder;

import hk4_builderandabstractfactory.factory.ChineseFoodFactory;

public class ChineseFoodBuilder extends Builder{

	public ChineseFoodBuilder() {
		factory = new ChineseFoodFactory();
		this.setMeal();
	}

}
