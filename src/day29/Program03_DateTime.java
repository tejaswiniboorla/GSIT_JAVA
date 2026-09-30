package day29;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program03_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime givenDay=LocalDateTime.parse("2026-08-10 16-30-10");
		System.out.println(givenDay);
		System.out.println(givenDay.getDayOfWeek());
		System.out.println(givenDay.getHour());
		LocalDateTime current=LocalDateTime.now();
		System.out.println(current);
	}

}
