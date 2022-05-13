package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise54 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[]a = new int[6];
		
		for (int i = 0; i < 10000; i++) {
		     int dice = random.nextInt(6) + 1;
	         System.out.println(dice);
	        
	         if (dice==1) {
				a[0]++;
			}
		
		
		}
		
		
	}
}
