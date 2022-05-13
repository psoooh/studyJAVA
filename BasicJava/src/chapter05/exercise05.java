package chapter05;

public class exercise05 {
	public static void main(String[] args) {
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		//중첩for문을 사용
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				count++;
			} 
		}
		avg = (double)sum/ count;
		
		System.out.println("sum: " + sum);
		
		System.out.println("avg: " + avg);
	}
}
// 언니 오늘 뭐 먹을까요 벌써 저는 배가 고파요 한시가 되었으면 좋겟어우..............