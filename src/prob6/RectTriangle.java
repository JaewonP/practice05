package prob6;

public class RectTriangle extends Shape{

	//직각삼각형
	private double width; //밑변
	private double height;//높이
	
	RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public double getArea() {
		//넓이 = 밑변 * 높이 * 0.5
		return  width * height *0.5;
	}

	@Override
	public double getPerimeter() {
		//a^2 + b^2 = c^2 빗변 구하기
		//둘레 = a+b+c
		/*
		double c, tc;
		c = (width*width) + (height*height);
		tc = c/c;
		return width + height + tc;
		*/
		//Math 클래스 사용
		return width + height + Math.sqrt(width*width + height*height);
	}

	
}
