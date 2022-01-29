package algorithm.baekjoon.math;

import java.util.Scanner;

public class Prime {

	public static boolean[] prime;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		isPrime(n);

		for (int i = 0; i < prime.length; i++) {
			if(prime[i] == false) {
				System.out.println(i);
			}
		}

	}

	public static void isPrime(int n) {

		prime = new boolean[n + 1];

		if (n < 2) {
			return;
		}

		prime[0] = prime[1] = true;

		for (int i = 2; i < n; i++) {

			if (prime[i] == true) {
				continue;
			}

			for (int j = i * i; j < prime.length; j = j + i) {
				prime[j] = true;
			}

		}

	}

}
