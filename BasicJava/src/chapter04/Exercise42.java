package chapter04;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12): ");
		int month = scanner.nextInt();
		String result ="";
		switch (month) { //해당 분기를 나누는 것 ..가독성을 따져보면 if보다는 switch가 깔끔
		//case 3: case 4: case 5: ...이렇게 써도 된다!
		case 3:	
		case 4:
		case 5:
			result = "봄";
			//System.out.println(month + "월은 봄입니다.");
			break;
		case 6:	
		case 7:
		case 8:
			result = "여름";
			//System.out.println(month+"월은 여름입니다.");
			break;
			
		case 9:	
		case 10:
		case 11:
			result = "가을";
			//System.out.println(month+"월은 가을입니다.");
			break;
			
		case 12:	
		case 1:
		case 2:
			result = "겨울";
			System.out.println(month+"월은 겨울입니다.");
			break;
			
		default:
			result = "잘못된 입력";
			//System.out.println(month + "월은 잘못된 입력입니다.");
			break;
		}
		//System.out.println(month + "월은" +  result + "입니다."); or
		System.out.printf("%d월은 %s입니다.",month,result);
		scanner.close();
	} 
}
