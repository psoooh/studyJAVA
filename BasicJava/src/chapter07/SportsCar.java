package chapter07;

public class SportsCar extends Car{
	@override
	public void speedUp() {
		speed += 10;
	}
	
	@override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
