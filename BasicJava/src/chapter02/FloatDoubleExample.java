package chapter02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		float var1 = 3.14f;
		double var2 = 3.14;
		
		float var4 = 0.12345567890123456789f; // 소수점 7자리까지 0.1234567까지
		double var5 = 0.1234567890123456789; 
		// 정수는 int 타입으로 간주
		int a = 100000000;
		long l = 100000000000L; //대소문자 구분 안해도 되지만 대문자로 쓰는게 좋다
		
		System.out.println(a);
		System.out.println(l);
		
		System.out.println(var4);
		System.out.println(var5);
		
		//수학 지수(exponential)
		double var6 = 3e6; // 3000000
		double var8 = 2e-3;
		
		System.out.println(var6);
		System.out.println(var8);
	}
}
