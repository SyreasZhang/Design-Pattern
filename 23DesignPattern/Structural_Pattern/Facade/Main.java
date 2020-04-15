package designpattern.Structural_Pattern.Facade;

/*外观模式:外部与子系统的通信必须通过一个统一的外观对象
 * 
 * 门面只提供对子系统的访问方式，而不有任何方法
 * 
 * 降低了本系统和外部系统的耦合度。
 * 
 * 
 * 
 * */

public class Main {
	public static void main(String[] args) {
		GeneralSwitchFacade gsf = new GeneralSwitchFacade();
		gsf.on();
		gsf.off();
	}
}
