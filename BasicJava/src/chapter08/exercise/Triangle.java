package chapter08.exercise;
public class Triangle extends Shape {
	
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	@Override
	public double area() { // 삼각형 넓이
		return (side * (side*Math.sqrt(3)/2)) /2;
	}
	@Override
	public double perimeter() { //삼각형 둘레
		return side + side + side;
	}
	
	public String toString() {
		return "도형의 종류: 삼각형, 둘레: " + perimeter() + "cm, 넓이: " + area()+"cm^2"; 
	}
}
