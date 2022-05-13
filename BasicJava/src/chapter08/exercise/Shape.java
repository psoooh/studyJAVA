package chapter08.exercise;

public abstract class Shape implements Comparable<Shape> {
	// area()와 perimeter()는 0을 반환하던 것을 추상 메소드로 변경한다.
	public abstract double area();

	public abstract double perimeter();

	// Comparable 인터페이스를 구현하면
	// Shape 객체들이 배열에 저장되어 있을때 Arrays.sort()를 이용해 배열을 저장할수있다.

	// Shape 클래스에서 compareTo()메소드를 구현할때 비교 기준은 도형의 넓이로 한다.
	@Override
	public int compareTo(Shape s) {
		if (area() > s.area()) {
			return 1;
		} else if (area() < s.area()) {
			return -1;
		} else {
			return 0;
		}

	}
}
