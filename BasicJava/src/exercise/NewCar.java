package exercise;

public class NewCar {

	private double speed;
	private String color;
	private static final double MAX_SPEED = killoToMile(200);
	
	public NewCar() {
		
	}
	
	public NewCar(String color) {
		this.color = color;
	}
	
	public double getSpeed() {
		return mileToKillo(speed);
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
		speed = killoToMile(speed);
		if (speed<0 || speed>=MAX_SPEED) {
			
			return false;
		}
			else {
			this.speed += speed;
			return true;
			}
	}
	
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	//거리단위를 km->mile
	private static double killoToMile(double distance) {
		return distance/1.6;
	}
	//거리단위를 mile->km
	private static double mileToKillo(double distance) {
		return distance*1.6;
	}
	
	
}
