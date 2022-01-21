package javastandard.dateformat;

import java.util.Random;

/**
 * 난수의 사용.
 * 
 * @author user
 */
public class UseRandom {

	public UseRandom() {
		// 1. 생성
		Random ran = new Random();
		// 2. method 사용.
		int r1 = ran.nextInt();
		System.out.println("발생한 정수의 난수 : " + r1);
		System.out.println("발생한 범위 정수의 난수 : " + r1 % 10); // 큰수 % 범위수
		System.out.println("발생한 범위 양수 정수의 난수 : " + Math.abs(r1 % 10)); // 큰수 %범위 수
		System.out.println("발생한 범위 양수 정수의 난수 : " + Math.abs(r1 % 10)); // 큰수 %범위 수

		// 불린의 난수
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());

		// 실수의 난수
		float rf = ran.nextFloat();
		double rd = ran.nextDouble();
		System.out.println(rf);
		System.out.println(rd);

	} // UseRandom

	public static void main(String[] args) {
		new UseRandom();
	} // main

} // class
