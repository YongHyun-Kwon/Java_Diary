package javastandard.dateformat;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {

	public static void main(String[] args) {

		Calendar cal = new GregorianCalendar();

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		int dayMax = cal.getActualMaximum(Calendar.DATE);

		for (int i = 1; i <= 24; i++) {
			System.out.print("  ");
		} // end for

		for (int i = 1; i <= dayMax; i++) {
			if (i == 1 || ((i) - 1) % 7 == 0) {
				System.out.println(i);
			} else if (i < 10) {
				System.out.print(i + "\t");
			} else {
				System.out.print(i + "\t");
			} // end else
		} // end for

	} // main

} // class
