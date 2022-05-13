package chapter04;

public class BreakOutterExample {
	public static void main(String[] args) {
		Otter: for (char upper = 'A'; upper <= 'Z'; upper++) {
					for (char lower = 'a'; lower <= 'z'; lower++) {
					System.out.println(upper + "-" + lower);
					if (lower == 'g') {
						break Otter;
					}
					}
		
		
		System.out.println("프로그램 실행 종료");
	}
}
}