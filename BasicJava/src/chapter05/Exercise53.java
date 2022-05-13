package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		//인공지능 컴퓨터와 게이머의 가위 바위 보
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(3); //0부터2까지.. 인덱스값과 유사
		String[] comCase = {"가위", "바위", "보"}; //가위=0, 바위=1, 보=2 
		String result = "";
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String me = scanner.next();
		
		System.out.println("게이머: " + me);
		System.out.println("인공지능컴퓨터: " + comCase[num]);
			
		if (me.equals(comCase[num])) {
			result = "무승부!";
		} else if (me.equals("가위") && comCase[num].equals("보")
				|| me.equals("바위") && comCase[num].equals("가위") 
			    || me.equals("보") && comCase[num].equals("바위")) {
			result = "게이머 승리!";
		} else {
             result = "인공지능 컴퓨터 승리!";
		} 
		
		System.out.println("결과: " + result);
		scanner.close();
		
	} 
}
