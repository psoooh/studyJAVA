package chapter04;

public class test16002 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0) {
				sum += i;
			}
			
		}System.out.println(sum); //for문을 나와서 출력해야한다 안에 들어있으면 출력이 반복됨
	}
}
