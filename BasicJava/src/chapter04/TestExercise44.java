package chapter04;

import java.util.Scanner;

public class TestExercise44 {
	public static void main(String[] args) { //가위바위보 게임
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String value1 = scanner.next();
		System.out.print("영희: ");
		String value2 = scanner.next();
		String result = "";
		//처리...글자비교...경우의 수를 따져서 비교하면 된다. 철수가 뭘 냈을때 영희가 뭘 내야 이길지 //결과는 세가지 이기고, 지고, 비기고
		
		if (value1.equals(value2)) {
			result = "무승부";
		} else if (value1.equals("가위") && value2.equals("보") 
			   || value1.equals("바위") && value2.equals("가위") 
			   || value1.equals("보") && value2.equals("바위")) {	
			result = "철수 승리";
		} else {
			result = "영희 승리";
		}
		//출력
		 System.out.println("결과: " + result);
		scanner.close();
	}
}
