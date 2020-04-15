package designpattern.Structural_Pattern.bridge;

public class Pen{
	Brush brush;
	Color color;
	
	
	public void setBrush(Brush brush) {
		this.brush = brush;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	public void draw(String name) {
		System.out.println("用"+brush+"画了一个"+color+"的"+name);
	}

}
