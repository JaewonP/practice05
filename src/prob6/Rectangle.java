package prob6;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		//넓이 = 밑변 * 높이
		return width * height;
	}

	@Override
	public double getPerimeter() {
		//(밑변 + 높이) * 2
		return (width + height) * 2;
	}

	@Override
	public void resize(double rate) {
		this.width = width * rate;
		
	}
	
	
	
}
