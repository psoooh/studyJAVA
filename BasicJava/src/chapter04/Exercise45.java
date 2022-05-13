package chapter04;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100)+1;
		int count = 0;
		
		while (true) {
			count++;
			System.out.print("1부터 100사이의 정수 중 하나를 선택하세요: ");
			int guessNum = scanner.nextInt();
		
			if (num<guessNum) {
			 System.out.println("정답은 더 작은 수입니다.");	
			} else if (num>guessNum) {
			 System.out.println("정답은 더 큰 수입니다.");	
			} else {
			 System.out.println("정답입니다.");	
			 
			 
			  break;
			}
				 
		} 
		System.out.println(count + "번만에 맞추셨습니다.");
		System.out.println("게임을 종료합니다.");
		
	}
}
