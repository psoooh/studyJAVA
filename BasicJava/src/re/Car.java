package re;

public class Car {

	static int speed; //필드 선언
	
	Car() {
		speed = 10;//생성자에서 인스턴스 필드 초기화
	}
	
	void run() { //반환타입없는 run이라는 메소드 선언, 호출시 실행할 것을 기술
		System.out.println(speed +"로 달립니다");
	}
	
	public static void main(String[] args) {
	    Car myCar = new Car();
//	    myCar.speed = 60;
	    myCar.run();
	}
}
