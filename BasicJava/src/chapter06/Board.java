package chapter06;

public class Board {
	String title = null;
	String content = null;
	String writer = null;
	String date = null;
	int hitcount = 0;
	
	Board(String title, String content){
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0); //맨밑에 해당 생성자를 호출 참조
	}
	Board(String title, String content, String writer){
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	Board(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
	}
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount; //위에 있는 Board들은 마지막 Board를 참조한다고 보면 될거같은데...
	}
	
}
