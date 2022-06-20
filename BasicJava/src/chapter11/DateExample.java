package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		// 2022-05-16 11:13:43
		System.out.println(date); // Mon May 16 11:13:43 KST 2022
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		String string = format.format(date);
		System.out.println(string);
		
		//jdk1.8 이후(2014년 이후)
		LocalDateTime now = LocalDateTime.now(); //현재시간
		System.out.println(now);
		
		String now2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH:mm:ss"));//체인타입으로 .으로 이어져 있음/ localdatetime은 시간까지나옴
		System.out.println(now2);
		
		String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일"));
		System.out.println(today);
		
	}
}
