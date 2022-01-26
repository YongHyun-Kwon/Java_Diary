package algorithm.baekjoon.math;

import java.util.Scanner;

public class Manhattan {
	/*
	 * ���� 3053 : �ý� ������(����ư �Ÿ�)
	 * 
	 * ���� : ������ R�� �־����� ��, ��Ŭ���� �����п��� ���� ���̿�, �ý� �����п��� ���� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� : ù° �ٿ� ������ R�� �־�����. R�� 10,000���� �۰ų� ���� �ڿ����̴�.
	 * 
	 * ��� : ù° �ٿ��� ��Ŭ���� �����п��� �������� R�� ���� ���̸�, ��° �ٿ��� �ý� �����п��� �������� R�� ���� ���̸� ����Ѵ�.
	 *       ������� ������ 0.0001���� ����Ѵ�.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		sc.close();

		System.out.println(r * r * Math.PI);
		System.out.println(2 * r * r);

	} // main

} // class
