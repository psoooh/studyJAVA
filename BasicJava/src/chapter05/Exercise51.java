package chapter05;

public class Exercise51 {
	public static void main(String[] args) {
		//최대값, 최소값 구하기
		int[] array = {38,94,16,3,76,94,82,47,59,8};
		int max = array[0];
		int min = array[0]; 
		
		
		for (int i = 0; i < array.length; i++) {
			max = (max>array[i]) ? max : array[i]; 
			
			min = (min<array[i]) ? min : array[i];
		}
				
		System.out.println("최대값: " + max);
		System.out.print("최소값: " + min);
	}
}
