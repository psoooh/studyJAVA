package exercise;

public class Car {
	

	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/*속력을 높이거나 내리는 메소드로 
	목표속도가 0보다 작거나 최대속력을 넘으면 현재속도를 그대로 유지하고 false값을 반환
	그렇지 않으면 전달 인자(speed)의 값만큼 속도를 변경하고 true를 반환*/
	public boolean speedUp(double speed) { 
		if (speed<0 || speed>=200) {
			this.speed = 0.0;
			return false;
		}
			else {
			this.speed += speed;
			return true;
			}
	}
}
