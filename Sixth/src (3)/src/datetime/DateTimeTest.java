package datetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		System.out.println(dt);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.printf("%d/%d/%d%n", date.getYear(), date.getMonthValue(), date.getDayOfMonth());
		
		LocalDate rd = LocalDate.of(2022, 05, 11);
		System.out.println(rd);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);
		System.out.println(nextWeek);
		
		/*
		Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		*/
		
		ZoneId usa = ZoneId.of("America/New_York");
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.of(ldt, usa);
		System.out.println(zdt);
		
		if(date.isLeapYear()) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}
	}

}





