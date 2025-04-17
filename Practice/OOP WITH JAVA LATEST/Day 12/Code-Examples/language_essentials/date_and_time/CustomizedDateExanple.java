package language_essentials.date_and_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CustomizedDateExanple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate independenceDay = LocalDate.of(1947, 8, 15);
		System.out.println("Independence Day: " + independenceDay);
		
		LocalDate dateAfter2WeeksOfIndependence = independenceDay.plus(2, ChronoUnit.WEEKS);
		System.out.println(dateAfter2WeeksOfIndependence);

	}

}
