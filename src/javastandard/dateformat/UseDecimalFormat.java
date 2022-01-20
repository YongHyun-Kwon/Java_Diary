package javastandard.dateformat;

import java.text.DecimalFormat;

/**
 * ��������. #: �����Ͱ� ������ ���� ���. 0: ���� ���� �κп� 0�� �־� ���
 * 
 * @author user
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {

		int i = 1_500_000; // JDK 1.7�������ʹ� ���ڿ� �����ڷ� _�� �־� �������� ��� ��ų �� �ִ�.
		// _�� ��µ��� �ʴ´�.
		System.out.println(i); //1500000

		DecimalFormat df = new DecimalFormat("#,###,###");
		System.out.println(df.format(i)); // 1,500,000

		DecimalFormat df2 = new DecimalFormat("00,000,000");
		System.out.println(df2.format(i)); // 01,500,000

		double d = 2022.0120;

		DecimalFormat df3 = new DecimalFormat("##,###,###.##");
		System.out.println(df3.format(d)); // 2,022.01
		
		DecimalFormat df4 = new DecimalFormat("00,000,000.00");
		System.out.println(df4.format(d)); // 00,002,022.01
		
		i = 11111111;
		DecimalFormat df5 = new DecimalFormat("#,###");
		System.out.println(df5.format(i)); // 1,111

	} // UseDecimalFormat

	public static void main(String[] args) {
		new UseDecimalFormat();
	} // main

} // class
