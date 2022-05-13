package chapter02;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 입력부분
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		Double num1 = scanner.nextDouble() ;
		
		System.out.print("원기둥의 높이를 입력하시오.(단위: m): ");
		Double num2 = scanner.nextDouble() ;
		
		//처리부분
		double r = ((num1*num1)*Math.PI);
		double volum = (Math.PI*(num1*num1)*num2);
		
		//출력부분
		System.out.println("원기둥 밑변의 넓이는" + r + "cm^2이고, 원기둥의 부피는 " + volum + "cm^2이다.");
	
		scanner.close();
		
	}
}
