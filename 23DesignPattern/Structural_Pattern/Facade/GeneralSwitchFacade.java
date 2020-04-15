package designpattern.Structural_Pattern.Facade;

public class GeneralSwitchFacade {
	Light [] lights = new Light[4];
	Fan fan = new Fan();
	AirConditioner ac = new AirConditioner();
	Television tv = new Television();
	
	public GeneralSwitchFacade() {
		for(int i = 0;i<lights.length;i++) {
			lights[i] = new Light();
		}
	}
	
	public void on() {
		for (Light light : lights) {
			light.on();
		}
		fan.on();
		ac.on();
		tv.on();
	}
	
	public void off() {
		for (Light light : lights) {
			light.off();
		}
		fan.on();
		ac.on();
		tv.on();
	}
}
