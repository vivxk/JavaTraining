import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class datetime {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(1947, 8, 15);
		LocalDate date1 = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		// System.out.println("Curent Date and Time: " + dateTime);
//		System.out.println("Formatted date and time: " + date.format(DateTimeFormatter.ISO_DATE) + " "
//				+ time.format(DateTimeFormatter.ISO_LOCAL_TIME));
//		System.out.println(
//				"Date and Time after two days: " + dateTime.plusDays(2).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//		System.out.println("Current month: " + dateTime.getMonth());
//		System.out
//				.println("After reducing: " + date.minusMonths(1) + " " + date.minusWeeks(1) + " " + date.minusDays(1));
//		System.out.println("Current date: " + date);
//		System.out.println("Current time: " + time);
//		System.out.println("Current day: " + date.getDayOfWeek());
//
//		LocalDate d1 = LocalDate.of(2016, 7, 10); // new date obj d1
//		LocalDate d2 = LocalDate.of(2016, 7, 10); // new date obj d2
//		System.out.println("Are both equal? " + d1.isEqual(d2)); // checking if d1 equals d2
//		System.out.println(dateTime.atZone(ZoneId.of("Asia/Calcutta")));
//		System.out.println(dateTime.atZone(ZoneId.of("America/New_York")));
//		System.out.println(date);
//		Period period = Period.between(date, date1); 
//		System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
		System.out.println(dateTime);
	}
	

}
