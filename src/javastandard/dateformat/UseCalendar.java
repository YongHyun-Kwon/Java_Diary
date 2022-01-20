package javastandard.dateformat;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 개별적인 날짜 정보를 얻을 때 사용하는 클래스.
 * 
 * @author user
 */
public class UseCalendar {

	public UseCalendar() {

//		Calendar cal = new Calendar(); // 추상클래스이므로 객체화가 되지 않는다.
		// is a 관계의 객체화
		Calendar cal = new GregorianCalendar();

		// 자식클래스를 사용한 객체화
//		GregorianCalendar gc = new GregorianCalendar();

		// static method 사용.
		Calendar cal2 = Calendar.getInstance();

//		System.out.println("cal: " + cal);
//		System.out.println("gc: " + gc);
//		System.out.println("cal2: " + cal2);

		System.out.println(cal2.get(Calendar.YEAR) + "/" + Calendar.YEAR);

		System.out.println("--------------------------------------------");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int amPm = cal.get(Calendar.AM_PM); // 0은 오전, 1은 오후
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1-일,2-월 ... 7-토

		// 요일을 숫자가 아닌 문자열로 입력 switch보다는 배열로 설정해서 값을 출력하는 것이 더 효율적이다.

		String[] weekText = "일,월,화,수,목,금,토".split(",");

		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

		int hour = cal.get(Calendar.HOUR); // 12시간제
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24시간제
		
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int maximum = cal.getActualMaximum(Calendar.DATE);

		System.out.println(year + "-" + month + "-" + day + " " + (amPm == Calendar.AM ? "오전" : "오후") + " "
				+ weekText[week - 1] + "요일" + " " + dayOfYear + " " + hour + "(" + hourOfDay + ")" + " " + minute +"분"
				+ " " + second +"초");
		
		System.out.println("----------------------------------------------------");
		Calendar cal4 = Calendar.getInstance();
		
		//년 변경
		cal4.set(Calendar.YEAR, 2021);
		//월 변경. (사람이 생각하는 월보다 1적게)
		cal4.set(Calendar.MONTH, 2); // 3월로 변경
		//일 변경
		cal4.set(Calendar.DAY_OF_MONTH,1); // 현재 월에 없는 날짜로 설정되면 다음달 1일로 변경된다.
//		cal4.set(Calendar.DAY_OF_MONTH,32); // 현재 월에 없는 날짜로 설정되면 다음달 1일로 변경된다.
		
		System.out.println(cal4.get(Calendar.YEAR) + "-" + (cal4.get(Calendar.MONTH)+1) + "-" + cal4.get(Calendar.DAY_OF_MONTH)
		+ " " + weekText[cal4.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("마지막날: " + maximum + "일");
		
	} // UseCalendar

	public static void main(String[] args) {
		new UseCalendar();
	} // main

} // class
