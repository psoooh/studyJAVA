package chapter03;

import java.util.Scanner;

import chapter02.scannerExample;

public class test12909 {
 public static void main(String[] args) {
	 
	Scanner scanner = new Scanner(System.in);
	
	//입력
	System.out.print("첫 번째 수:" );
	//double num1 = scanner.nextDouble(); 
	String firstNum = scanner.next();
	
	System.out.print("두 번째 수:" );
	//double num2 = scanner.nextDouble(); 
	String secongNum = scanner.next();
	System.out.println("--------------------------");
	
	
	//처리
	double first = Double.parseDouble(firstNum);
	double second = Double.parseDouble(firstNum);
	double result = first / second;
	String resultString = (second == 0 || second ==0.0) ? "무한대" : String.valueOf(second);
	//double result1 = num1 / num2 ;
	//String result2 = (num2 == 0.0) ? "무한대" : String.valueOf(result1) ; 
	
	
	//출력
	System.out.println("결과: " + result);
	//System.out.println("결과:" + result2);
	
	scanner.close();
	
}
}
