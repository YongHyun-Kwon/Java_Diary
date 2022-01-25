package javastandard.dateformat;

import java.util.Random;

/**
 * ������ ���.
 * 
 * @author user
 */
public class UseRandom {

	public UseRandom() {
		// 1. ����
		Random ran = new Random();
		// 2. method ���.
		int r1 = ran.nextInt();
		System.out.println("�߻��� ������ ���� : " + r1);
		System.out.println("�߻��� ���� ������ ���� : " + r1 % 10); // ū�� % ������
		System.out.println("�߻��� ���� ��� ������ ���� : " + Math.abs(r1 % 10)); // ū�� %���� ��
		System.out.println("�߻��� ���� ��� ������ ���� : " + Math.abs(r1 % 10)); // ū�� %���� ��

		// �Ҹ��� ����
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());

		// �Ǽ��� ����
		float rf = ran.nextFloat();
		double rd = ran.nextDouble();
		System.out.println(rf);
		System.out.println(rd);

	} // UseRandom

	public static void main(String[] args) {
		new UseRandom();
	} // main

} // class