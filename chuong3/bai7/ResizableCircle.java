package bai7;

public class ResizableCircle extends Circle implements Resizable {
	

	public ResizableCircle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResizableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	public void resize (int percent) {
		radius *= (1+percent/100.0);
	}
}
