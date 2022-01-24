package algorithm.baekjoon.math;

import java.util.Scanner;

public class Prime2 {

	public static boolean prime[]; // �ʱⰪ false

	public static void getPrime() {

		/*
		 * ���� 2581
		 * 
		 * ���� : �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷���
		 * �ۼ��Ͻÿ�.
		 * 
		 * �Է� : �Է��� ù° �ٿ� M��, ��° �ٿ� N�� �־�����. M�� N�� 10,000������ �ڿ����̸�, M�� N���� �۰ų� ����.
		 * 
		 * ��� : M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ��� ����Ѵ�.
		 * ��, M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.
		 * 
		 */

		// 2 �̸��� �Ҽ��� �ƴϴ�.
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
			if (prime[i] == false) { // false�� �Ҽ�
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
