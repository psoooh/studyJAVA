package chapter05;

public class Exercise04 {
	public static void main(String[] args) {
		
		int[] array = {1,5,3,8,2};
		int max = array[0];
		int min = array[0];
		//for (int i = 0; i < array.length; i++) {
		//  max = (max >array[i] ? max : array[i]);
		//}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			if (min>array[i]) {
				min = array[i];
			
			
			}
		}
		}
			System.out.println("max: " + max);
			System.out.println("min: " + min);
			
		
		
		}
		
		
	}
