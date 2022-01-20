package javastandard.dateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Formatter class => 형식을 설정하는 일을 하는 클래스들 java.text에 존재한다.
 * 
 * @author user
 */
public class UseSimpleDateFormat {

	public UseSimpleDateFormat() {
		Date date = new Date();
		// 1. Formatter class 생성(형식 설정)
		// 구분기호는 마음대로 표현가능
//		SimpleDateFormat sdf = new SimpleDateFormat("yy");// 22
//		SimpleDateFormat sdf = new SimpleDateFormat("y"); // 2022
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"); // 2022
//		SimpleDateFormat sdf = new SimpleDateFormat("M"); // 2022-1
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM"); // 2022-01
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d"); // 2022-01-20 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh) : mm : ss EEEE"); // 2022-01-20 오후
																									// 12(12,00,12) : 37
																									// : 26 목요일

		// 2. 설정된 형식의 날짜 정보를 얻어(Date와 has a 관계)
		String formatDate = sdf.format(date);
		// 3. 출력
		System.out.println(formatDate);

		System.out.println("------------------------------------------");
		// Locale 을 사용한 다른 국가의 날짜 형식.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH: mm ", Locale.KOREA);
		System.out.println(sdf2.format(date));

	} // UseSimpleDateFormat

	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar();
		
		new UseSimpleDateFormat();
	} // main

} // class
