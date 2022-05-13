package chapter05;


import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		//로또번호 생성 프로그램
		Random random = new Random();
		
		int[] lottoNum = new int[6];
		
		for (int k = 0; k < lottoNum.length; k++) {
			// 1부터 45까지의 임의의 정수를 첫번째 배열에 넣는다.
			lottoNum[k] = random.nextInt(45) + 1;
			for (int i = 0; i < k; i++) {
			 if(lottoNum[i] == lottoNum[k])	{
				k--;
				break;
			 }
		  }System.out.println("로또번호 생성: " + lottoNum[k]);
		}
		
		
	}
}
