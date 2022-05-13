package chapter08.exercise;

import java.util.Objects;

public abstract class Book {

	private int number; // 관리번호
	private String title; // 책의 제목
	private String author; // 책의 저자
	private static int countOfBooks; // 만들어진 Book객체 개수, 선언과 동시에 0으로 초기화

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = ++countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public abstract int getLateFee(int lateDays); // 연체료를 계산하는 추상메소드

	@Override
	public boolean equals(Object b) {
		if (this == b) //같은 주소를 갖은지 묻는
			return true;
		if (b == null)
			return false;
		if (getClass() != b.getClass())
			return false;
		Book other = (Book) b;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	/*@Override
	public boolean equals(Object obj) { //object에서 바로 book의 필드메소드를 사용할 수 없어서 북으로 강제 캐스팅해서 북의 필드를 참조하여 사용!
		if (!(obj instanceof Book)) {
			return false;
		}
		if (title.equals(((Book) obj).title) && author.equals(((Book) obj).author)) {
			return true;
		} else { 
			return false;
		}*/

	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	public String toString() {
		return "관리번호: " + number + "번, 제목: " + title + ", 작가: " + author + "(일주일 연체료: " + getLateFee(7) + "원)";
		// return String.format("관리번호 %d번, 제목: %s, 작가: %s (일주일 연체료: %,d원)", number,
		// title, author, getLateFee(7));
	}
}
