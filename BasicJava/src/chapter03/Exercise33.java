package chapter03;

import java.util.Scanner;

public class Exercise33 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("윤년인지 확인할 연도를 입력하세요: ");
	int num = scanner.nextInt();
	
	 
	String year = ((num % 4) == 0) && (!(num%100 == 0)) || ((num % 400 == 0)) ? "년은 윤년입니다." : "년은 윤년이 아닙니다." ;

	System.out.println(num + year);
	
	scanner.close();
}
}
