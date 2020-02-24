package hk4_builderandabstractfactory;

import hk4_builderandabstractfactory.builder.Builder;
import hk4_builderandabstractfactory.builder.ChineseFoodBuilder;
import hk4_builderandabstractfactory.builder.FastFoodBuilder;
import hk4_builderandabstractfactory.builder.WesternFoodBuilder;

public class MainApp {
	public static void main(String[] args) {
		Builder b;
		b = new ChineseFoodBuilder();
		System.out.println(b.getMeal());
		
		b = new FastFoodBuilder();
		System.out.println(b.getMeal());
		
		b = new WesternFoodBuilder();
		System.out.println(b.getMeal());
	}
}
