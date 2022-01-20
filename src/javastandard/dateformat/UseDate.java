package javastandard.dateformat;

import java.util.Date;

/**
 * Date 클래스를 사용.
 * 
 * @author user
 */
public class UseDate {

	public static void main(String[] args) {
		// CMOS의 날짜를 얻기
		long ctm = System.currentTimeMillis(); //1970-01-01 00:00:00에서부터 현재까지의 시간을 mills로 계산한다.
		System.out.println(ctm); // system클래스만이 유일하게 jvm과 os가 정보교류를한다.

		// 1. 객체화
		Date date = new Date();
		Date date2 = new Date(ctm);

		System.out.println(date); // java.lang.Object클래스의 toString() 을 Override 하였기 때문에
		System.out.println(date2); // java.lang.Object클래스의 toString() 을 Override 하였기 때문에
		// Cmos라는 Rom에 날짜 정보가 저장되어있으며 Os가 Cmos에서 날짜정보를 가져온다.
	} // main

} // class
