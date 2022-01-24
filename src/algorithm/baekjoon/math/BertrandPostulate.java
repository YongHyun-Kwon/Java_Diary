package algorithm.baekjoon.math;

import java.util.Scanner;

/**
 * 베르트랑 공준 : 자연수 n에 대하여 n보다 크고 2n보다 작거나 같은 소누는 적어도 하나 존재한다.
 * 
 * @author 82109
 */
public class BertrandPostulate {

	/*
	 * 백준 4948
	 * 
	 * 문제 : 자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
	 * 
	 * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
	 * 입력의 마지막에는 0이 주어진다.
	 * 
	 * 출력 : 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
	 */
	public static boolean[] prime = new boolean[246913]; // 123456(최대 값) * 2 = 246913

	public static void getPrime() {

		// 0, 1은 소수가 아님
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
		getPrime();

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			} // end if

			int cnt = 0;

			for (int i = n + 1; i <= n * 2; i++) {
				if (!prime[i]) {
					cnt++;
				} // end if
			} // end for
			System.out.println(cnt);
		} // end while

		sc.close();

	} // main

} // class
