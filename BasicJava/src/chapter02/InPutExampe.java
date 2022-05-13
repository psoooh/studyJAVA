package chapter02;

import java.util.Scanner;

public class InPutExampe {
	public static void main(String[] args) {
		// Quick Fix(ctrl + 1)
		Scanner scanner = new Scanner(System.in);
		/*
		scanner.nextLine(); //문자를 입력받기(엔터가 입력된 부분까지)
		scanner.next(); //문자를 입력받기(공백 또는 엔터가 입력된 부분까지)
		scanner.nextInt(); //정수를 입력받기
		scanner.nextDouble(); //실수를 입력받기
		*/
		
		/*System.out.print("이름을 입력하세요: "); //줄바꿈없이 옆으로 출력됨
		String name = scanner.next();
	
		System.out.print("나이를 입력하세요: "); //엔터할때까지 대기했다가 엔터입력하면 변수출력
		int age = scanner.nextInt(); 
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "입니다.");
		System.out.printf("당신의 이름은 %s이고, 나이는 %d입니다.", name, age); // printF p.90
		*/
		
		System.out.printf("잔액: %,20d\n", 1000000); 
		System.out.printf("잔액: %.2f\n", 10.12902);
		System.out.printf("%s-$s-$s", "010", "1234", "5678");
		
		scanner.close();
	}
}
