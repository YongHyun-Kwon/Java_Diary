package javastandard.dateformat;

import java.util.Date;

/**
 * Date Ŭ������ ���.
 * 
 * @author user
 */
public class UseDate {

	public static void main(String[] args) {
		// CMOS�� ��¥�� ���
		long ctm = System.currentTimeMillis(); //1970-01-01 00:00:00�������� ��������� �ð��� mills�� ����Ѵ�.
		System.out.println(ctm); // systemŬ�������� �����ϰ� jvm�� os�� �����������Ѵ�.

		// 1. ��üȭ
		Date date = new Date();
		Date date2 = new Date(ctm);

		System.out.println(date); // java.lang.ObjectŬ������ toString() �� Override �Ͽ��� ������
		System.out.println(date2); // java.lang.ObjectŬ������ toString() �� Override �Ͽ��� ������
		// Cmos��� Rom�� ��¥ ������ ����Ǿ������� Os�� Cmos���� ��¥������ �����´�.
	} // main

} // class
