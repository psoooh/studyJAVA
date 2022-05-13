package exercise;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
		if (hour>24) {          //if(hour >0 && hour <24){ this.hour = hour; } 이렇게 생각하자
			 
			this.hour = 0;
		}
		if (minute>60) {
			this.minute = 0;
		}
		if (second>60) {
			this.second = 0;
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}


