package chapter02;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		int coin1 = scanner.nextInt() ; //변수는 무조건 소문자로!!!
		
		System.out.print("100원짜리 동전의 갯수: ");
		int coin2 = scanner.nextInt() ;
		
		System.out.print("50원짜리 동전의 갯수: ");
		int coin3 = scanner.nextInt() ;
		
		System.out.print("10원짜리 동전의 갯수: ");
		int coin4 = scanner.nextInt() ;
		
		int sum = (coin1*500) + (coin2*100) + (coin3*50) + (coin4*10);
		
		System.out.println("저금통 안의 동전의 총 액수:" + sum);
		
		scanner.close();
	}
}
