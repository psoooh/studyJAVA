package chapter08.exercise;

public class ScienceFiction extends Book {

	public ScienceFiction(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) { // 하루 연체될때마다 600원
		int lateFee = lateDays * 600;
		return lateFee;
	}
}
