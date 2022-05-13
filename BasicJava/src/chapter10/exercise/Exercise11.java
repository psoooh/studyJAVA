package chapter10.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {

			try {
				//입력받는 부분
				System.out.print("어떤 수를 나누시겠습니까?>>");
				int dividend = scanner.nextInt(); //나누어질 수
				System.out.print("어떤 수로 나누시겠습니까?>>");
				int divisor = scanner.nextInt();//나누는 수
				//데이터 처리하는 부분
				int result = dividend / divisor;
				//출력하는 부분
				System.out.printf("%d/%d = %d", dividend, divisor, result);
				break;

			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요. ");
				scanner.next(); // 호출만 하고 끝!
				continue;

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
		}
		scanner.close();
	}
}
