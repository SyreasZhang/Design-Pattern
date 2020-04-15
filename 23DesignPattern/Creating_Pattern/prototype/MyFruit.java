package designpattern.Creating_Pattern.prototype;

public class MyFruit implements Cloneable{
	protected String kind;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void display() {
		System.out.println(kind+" "+hashCode());
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}
