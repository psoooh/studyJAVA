package chapter04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) { //가위바위보 게임
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String value1 = scanner.next();
		System.out.print("영희: ");
		String value2 = scanner.next();
		
		
		if ((value1.equals("가위")&&value2.equals("보")) || (value1.equals("바위")&&(value2.equals("가위")) || (value1.equals("보") && (value2.equals("바위"))))) {
			System.out.println("철수 승리!");
		} else if ((value1.equals("보") && value2.equals("가위")) || (value1.equals("가위")) && (value2.equals("바위")) || (value1.equals("바위")) && ((value2.equals("보")))) {
			System.out.println("영희 승리!");
		} else 
		    System.out.println("무승부");{

		} 
	}
		
		
}