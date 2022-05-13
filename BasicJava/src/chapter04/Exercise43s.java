package chapter04;

import java.util.Scanner;

public class Exercise43s {
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
		
		int sum = (num1+num2+num3+num4+num5);
		System.out.println("총점: " + sum);
		
		int score = sum / 5;
		System.out.println("평균: " + score);
		
		String grade = ""; //학점
	
		switch (score / 10 * 10) { //if문을 switch문으로 바꾼경우 ...뭔지 모르겠음
		case 100: case 90:
			grade ="A";
			break;
		
		case 80:
		grade ="B";
		break;
		
		case 70:
		grade ="C";
		break;
		case 60:
		grade ="D";
		break;
		
		default:
			break;
		}
		
		{

		}{

		}
         System.out.println("학점: " + grade);
	}
}

