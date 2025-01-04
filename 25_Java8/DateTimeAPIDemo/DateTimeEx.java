package DateTimeAPIDemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

public class DateTimeEx {

	public static void main(String[] args) {
		
		LocalDate of = LocalDate.of(2024, 12, 07);	//prints given date
		System.out.println(of);
		
		LocalDate date = LocalDate.now();		//prints current date
		System.out.println(date);
		
		date = date.plusDays(3);				//prints adding 3 days to current date
		System.out.println(date);
		
		date = date.plusMonths(1);				//prints adding 1 month to current date
		System.out.println(date);
		
		date = date.plusYears(2);				//prints adding 2 years to current date
		System.out.println(date);
		
		boolean leapYear =  LocalDate.parse("2024-12-06").isLeapYear();		//to check whether the year is leap year
		System.out.println("leapYear:: "+ leapYear);
		
		boolean before = LocalDate.parse("2023-12-06").isBefore(LocalDate.parse("2024-12-06"));	//to check whether the date is before current date
		System.out.println("Before Date:: "+ before);
		
		LocalTime time = LocalTime.now();		//prints current time
		System.out.println(time);
		
		time = time.plusHours(2);				//prints adding 2 hours to current date
		System.out.println(time);

		LocalDateTime datetime = LocalDateTime.now();		//prints current date & time
		System.out.println(datetime);
		
		Period p = Period.ofDays(5);			//prints provided period of days
		System.out.println(p.getDays());
		
		Period between = Period.between(LocalDate.parse("2002-05-19"), LocalDate.now());
		System.out.println(between);			//prints period between given data to till now 
		
		Duration duration = Duration.between(LocalTime.parse("08:57"), LocalTime.now());
		System.out.println(duration);			//prints duration between given time to till now
	}

}
