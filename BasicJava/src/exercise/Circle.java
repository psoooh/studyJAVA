package exercise;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() { // 원 넓이 
		return radius * radius * Math.PI;
	}
	@Override
	public double perimeter() { //원 둘레
		return radius * Math.PI * 2;
	}
	
	public String toString() {
		return "도형의 종류: 원, 둘레: " + perimeter() + "cm, 넓이: " + area()+"cm^2"; 
	}
}
