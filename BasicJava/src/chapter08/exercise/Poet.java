package chapter08.exercise;

public class Poet extends Book {
	
	public Poet(String title, String author) {
		super(title, author);
	}
	
	@Override
	public int getLateFee(int lateDays) { //하루 연체될때마다 200원
		int lateFee = lateDays *200;
		return lateFee;
	}
}
