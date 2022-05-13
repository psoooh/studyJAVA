package chapter03;

import java.util.Scanner;

public class Exercise32 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	//입력
	System.out.print("수도입니까?(수도:1, 수도아님:0) ");
	int num1 = scanner.nextInt();
	
	System.out.print("총 인구는?(단위: 만) ");
	int num2 = scanner.nextInt();
	
	System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
	int num3 = scanner.nextInt();
	
	
	//처리
	String metropol = (((num1==1) && (num2>=100)) || (num3>=50)) ? "이 도시는 메트로폴리스입니다." : "이 도시는 메트로폴리스가 아닙니다.";
	
	//출력
	System.out.println(metropol);
	
	scanner.close();
	
}
}
