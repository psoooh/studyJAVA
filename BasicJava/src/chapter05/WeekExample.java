package chapter05;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar calender = Calendar.getInstance();
		int week = calender.get(calender.DAY_OF_WEEK); //일(1) ~토(7)
		
		switch (week) {
		case 1:
			today = Week.일;
			break;
		case 2:
			today = Week.월;
			break;
		case 3:
			today = Week.화;
			break;
		case 4:
			today = Week.수;
			break;
		case 5:
			today = Week.목;
			break;
		case 6:
			today = Week.금;
			break;
		case 7:
			today = Week.토;
			break;
		
		default:
			
			break;
		}
		
	}
}
