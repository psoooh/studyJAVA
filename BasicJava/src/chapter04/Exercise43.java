package chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		System.out.print("프로그래밍 기초: ");
		int num1 = scanner.nextInt();
		
		System.out.print("데이터베이스: ");
		int num2 = scanner.nextInt();
		
		System.out.print("화면 구현: ");
		int num3 = scanner.nextInt();
		
		System.out.print("애플리케이션 구현: ");
		int num4 = scanner.nextInt();
		
		System.out.print("머신러닝: ");
		int num5 = scanner.nextInt();
		
		System.out.println("총점: " + (num1+num2+num3+num4+num5));
		
		double score = (num1 + num2 + num3 + num4 + num5) / 5;
		System.out.println("평균: " + score);
		
		String grade = ""; //학점
		
		/*if (score>=90) {
			grade = "A";
		} else if (score>=80 && score<90) { //score<90 ...이게 나오려면 위에서 걸리기 때문에 밑에서 굳이 이 조건은 안써도 된다! 불필요한 조건은 쓰지말자
			grade = "B";
		} else if (score>=70 && score<80) {
			grade = "C";
		} else 
		 	grade = "D"; {

		} */
		
		{

		}{

		}
         System.out.println("학점: " + grade);
	}
}

