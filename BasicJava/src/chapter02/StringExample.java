package chapter02;

public class StringExample {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println("나의 이름은 \"" + name + "\"이고"  + "\r나의 직업은 \"" + job +"\"이다");
		
		// 1번 "나의 이름은" + name + "이고" +"나의 직업은" + job +"이다"
       // 2번 "나의 이름은\""+ name + "\"이고" +"나의 직업은\"" + job +"\"이다"
	}
		}

