package algorithm.baekjoon.math;

import java.util.Scanner;

public class Goldbach {
	/*
	 * ���� 9020 : �������� ����
	 * 
	 * ���� : 2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ������ n�� ������ ��Ƽ����
	 * ���� ������ ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.
	 * 
	 * �Է� : ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ� ¦�� n�� �־�����.
	 *  4 �� n �� 10,000
	 * 
	 * ���: �� �׽�Ʈ ���̽��� ���ؼ� �־��� n�� ������ ��Ƽ���� ����Ѵ�. ����ϴ� �Ҽ��� ���� �ͺ��� ���� ����ϸ�, �������� �����Ѵ�.
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
