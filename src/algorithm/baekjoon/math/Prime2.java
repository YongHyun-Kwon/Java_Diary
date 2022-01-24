package algorithm.baekjoon.math;

import java.util.Scanner;

public class Prime2 {

	public static boolean prime[]; // 초기값 false

	public static void getPrime() {

		/*
		 * 백준 2581
		 * 
		 * 문제 : 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을
		 * 작성하시오.
		 * 
		 * 입력 : 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다. M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
		 * 
		 * 출력 : M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
		 * 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
		 * 
		 */

		// 2 미만은 소수가 아니다.
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			} // end for j
		} // end for i

	} // getPrime

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		sc.close();

		prime = new boolean[n + 1];
		getPrime();

		int sum = 0, min = 0;
		for (int i = m; i < n; i++) {
			if (prime[i] == false) { // false는 소수
				sum += i;
				if (min == 0) {
					min = i;
				} // end if
			} // end if
		} // end for
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		} // end else

	} // main

} // class
