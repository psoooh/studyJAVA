package chapter02;

public class Exercise22 {
	public static void main(String[] args) {
		//
		double dt = 40e12;
		double sd = 300_000.0*365*24*60*60; //숫자사이에 언더바_를 쓰면 아무동작도 없다! 시각적 구분만 가능
		
		//데이터 처리
		double time = dt / sd;
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time + "광년이다.");
	}
}
