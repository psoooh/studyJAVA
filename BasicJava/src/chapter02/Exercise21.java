package chapter02;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//입력부분(input)
		System.out.print("가로의 길이는?(단위: m): ");
		Double width = scanner.nextDouble() ;
		
		System.out.print("세로의 길이는?(단위: m): ");
		Double height = scanner.nextDouble() ;
		
		//데이터 처리부분(processing data)
		Double area = width * height;
		Double perimeter = 2*(width + height);
		
		
		//데이터 출력부분 (output)
		System.out.print("직사각형의 넓이: " + area);	
		
		System.out.print("직사각형의 둘레: " + perimeter);
				
		scanner.close();
		
	}
}
