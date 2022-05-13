package chapter11;
public class StringExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		if (subject.indexOf("프로") < 0) {
			System.out.println("찾는 글자가 없다.");
		} else {
			System.out.println("있다.");
		}
		if (subject.contains("프로")) {
			
		}
		
		subject.startsWith("자바");
	}
}
