package chapter08.exercise;

public class Novel extends Book {
	
	public Novel(String title, String author) {
		super(title, author);//매개값의 타입과 일치하는 부모생성자를 호출
	}

	@Override
	public int getLateFee(int lateDays) { //하루 연체될때마다 300원
		return lateDays * 300;
		
	}
}
