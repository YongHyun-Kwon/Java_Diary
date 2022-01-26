package algorithm.baekjoon.math;

import java.util.Scanner;

public class Goldbach {
	/*
	 * 백준 9020 : 골드바흐의 추측
	 * 
	 * 문제 : 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이
	 * 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
	 * 
	 * 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.
	 *  4 ≤ n ≤ 10,000
	 * 
	 * 출력: 각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
	 */

	private static boolean[] prime = new boolean[10001];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		isPrime();

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int firstPartition = n / 2;
			int secondPartition = n / 2;

			while (true) {

				if (!prime[firstPartition] && !prime[secondPartition]) {
					System.out.println(firstPartition + " " + secondPartition);
					break;
				} // end if
				firstPartition--;
				secondPartition++;
			} // end in while
		} // end out while
		sc.close();
	} // main

	public static void isPrime() {
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			} // end for j
		} // end for i

	} // isPrime

} // class
