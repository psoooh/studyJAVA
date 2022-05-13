package chapter08.exercise;
public class Rectangle extends Shape{
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;	
	}
	@Override
	public double area() { // 직사각형 넓이
		return width * height;
	}
	@Override
	public double perimeter() { //직사각형 둘레
		return (width + height)*2;
	}
	
	public String toString() {
		return String.format("도형의 종류: 사각형, 둘레: %.2fcm, 넓이: %.2com^2",perimeter(), area()); 
	}
}
