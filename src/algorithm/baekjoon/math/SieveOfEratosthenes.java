package algorithm.baekjoon.math;

import java.util.Scanner;

/**
 * 에라토스테네스의 체 <br>
 * 정의 : k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다.
 * 
 * @author 82109
 *
 */
public class SieveOfEratosthenes {

	/*
	 * 백준 1929
	 * 
	 * 문제 : M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
	 * 
	 * 입력 : 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가
	 * 하나 이상 있는 입력만 주어진다.
	 * 
	 * 출력 : 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다
	 */
	public static boolean prime[]; // 소수 체크 배열 초기값 false

	public static void sivev() {

		prime[0] = true; // 0과 1은 소수가 아님
		prime[1] = true;

		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			} // end for j
		} // end for i

	} // sivev

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		prime = new boolean[n + 1]; // 소수 판별을 위한 배열 생성
		sivev();

		for (int i = m; i <= n; i++) {
			if (!prime[i])
				System.out.println(i);
		} // end for

	} // main

} // class
