package chapter03;

public class CharOperationExample {
	public static void main(String[] args) {
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char) (c2 + 1); //c2+1은 int타입으로 변환됨, char로 강제변환 시켜야 에러안남
		System.out.println("c1: " +c1);
		System.out.println("c2: " +c2);
		System.out.println("c3: " +c3);
	}
}
