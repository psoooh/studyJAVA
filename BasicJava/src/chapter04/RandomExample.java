package chapter04;

import java.util.Random;

public class RandomExample {
 public static void main(String[] args) {
	//옛날방식                    마지막숫자 - 처음숫자 + 1
	// (int)((Math.random() * (추출할 숫자들의 갯수)) + 처음 숫자;
	 
	 //앞으로는 이걸로 쓰세요.
	 Random random = new Random(80); //괄호안에 숫자(씨드)에 대한 랜덤이 나온다 균일한 분포로 나오는 가짜 랜덤, 값을 안쓰면 명령이 실행되는 시간에 해당하는 씨드값이 들어감(단위가 나노세컨드로 들어간다)그래서 보안에 좋음
	 
	 //random.nextInt(6); // 0부터 5까지 .... 숫자가 추출만 되고 출력은 안되는 상태
	 
	 for (int i = 0; i < args.length; i++) {
		 System.out.println(random.nextInt(6));
	}
	 
	 
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	 System.out.println(random.nextInt(6));
	
}
}
