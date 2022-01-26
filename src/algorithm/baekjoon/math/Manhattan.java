package algorithm.baekjoon.math;

import java.util.Scanner;

public class Manhattan {
	/*
	 * 백준 3053 : 택시 기하학(맨해튼 거리)
	 * 
	 * 문제 : 반지름 R이 주어졌을 때, 유클리드 기하학에서 원의 넓이와, 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하시오.
	 * 
	 * 입력 : 첫째 줄에 반지름 R이 주어진다. R은 10,000보다 작거나 같은 자연수이다.
	 * 
	 * 출력 : 첫째 줄에는 유클리드 기하학에서 반지름이 R인 원의 넓이를, 둘째 줄에는 택시 기하학에서 반지름이 R인 원의 넓이를 출력한다.
	 *       정답과의 오차는 0.0001까지 허용한다.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		sc.close();

		System.out.println(r * r * Math.PI);
		System.out.println(2 * r * r);

	} // main

} // class
