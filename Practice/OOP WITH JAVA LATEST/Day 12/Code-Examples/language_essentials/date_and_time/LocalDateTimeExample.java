package language_essentials.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate sysDate = LocalDate.now();
		System.out.println("Today's date : " + sysDate);
		
		LocalTime sysTime = LocalTime.now();
		System.out.println("Current Time: " + sysTime);
		
		LocalDateTime sysTimeStamp = LocalDateTime.now();
		System.out.println("Current Time Stamp: " + sysTimeStamp);

	}

}
