package stdinandstdout;

import java.util.Calendar;

public class CalendarExample1 {
	public static String main(String[] args) {
		Calendar cal = Calendar.getInstance();

		int month = 0;
		cal.set(Calendar.MONTH, month - 1);
System.out.println("Calendar");
		int day = 0;
		cal.set(Calendar.DAY_OF_MONTH, day);

		int year = 0;
		cal.set(Calendar.YEAR, year);

		String[] day_of_week = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

		return day_of_week[cal.get(Calendar.DAY_OF_WEEK) - 1];
		/*
		 * System.out.println("The current date is : " + calendar.getTime());
		 * calendar.add(Calendar.DATE, -15); System.out.println("15 days ago: " +
		 * calendar.getTime()); calendar.add(Calendar.MONTH, 4);
		 * System.out.println("4 months later: " + calendar.getTime());
		 * calendar.add(Calendar.YEAR, 2); System.out.println("2 years later: " +
		 * calendar.getTime());
		 */
	}
}
