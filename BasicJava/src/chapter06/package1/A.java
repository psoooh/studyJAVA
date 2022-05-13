package chapter06.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열"); //필드에는 생성자를 호출할 수 없음
	
	public A(boolean b) {
		
	}
	A(int b){
		
	}
	private A(String s) {}
}
