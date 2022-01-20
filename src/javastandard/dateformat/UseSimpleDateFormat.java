package javastandard.dateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Formatter class => ������ �����ϴ� ���� �ϴ� Ŭ������ java.text�� �����Ѵ�.
 * 
 * @author user
 */
public class UseSimpleDateFormat {

	public UseSimpleDateFormat() {
		Date date = new Date();
		// 1. Formatter class ����(���� ����)
		// ���б�ȣ�� ������� ǥ������
//		SimpleDateFormat sdf = new SimpleDateFormat("yy");// 22
//		SimpleDateFormat sdf = new SimpleDateFormat("y"); // 2022
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"); // 2022
//		SimpleDateFormat sdf = new SimpleDateFormat("M"); // 2022-1
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM"); // 2022-01
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d"); // 2022-01-20 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh) : mm : ss EEEE"); // 2022-01-20 ����
																									// 12(12,00,12) : 37
																									// : 26 �����

		// 2. ������ ������ ��¥ ������ ���(Date�� has a ����)
		String formatDate = sdf.format(date);
		// 3. ���
		System.out.println(formatDate);

		System.out.println("------------------------------------------");
		// Locale �� ����� �ٸ� ������ ��¥ ����.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH: mm ", Locale.KOREA);
		System.out.println(sdf2.format(date));

	} // UseSimpleDateFormat

	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar();
		
		new UseSimpleDateFormat();
	} // main

} // class
