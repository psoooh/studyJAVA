package chapter07;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override //추상메소드의 재정읜
	public void sound() {
		System.out.println("멍멍");
	}
}
