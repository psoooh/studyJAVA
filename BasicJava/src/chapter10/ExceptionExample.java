package chapter10;
public class ExceptionExample {
	public static void main(String[] args) {
		// 1. 일반 예외(Compiletime Exception)
		try {
			Class.forName("java.lang.String");
			// 2. 실행 예외(Runtime Exception)
			
			int[] numbers = new int[5];
			numbers[10] = 100;
		//여러개 쓸 수 있음	
		} catch (ClassNotFoundException e) { //ClassNotFoundException에 대한 에러를 잡는다
//			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 갯수가 잘못되었습니다.");
		} catch (Exception e) {
			
		} finally {
			System.out.println("프로그램 종료");
		}
		
	}
}