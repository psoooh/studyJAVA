package chapter02;

public class VariableExample {
  public static void main(String[] args) {
	  // byte: -128 ~127까지 저장가능! 그래서 int변수를 많이 사용한다!
	int a; // 변수의 선언
	a = 10; // 변수의 초기화
	System.out.println(a);
	
	int b = 100; //변수의 선언과 초기화를 동시에
	System.out.println(b);
	
	a = 10000; //값을 변경할 수 있다
	System.out.println(a);
}
}
