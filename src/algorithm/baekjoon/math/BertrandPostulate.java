package algorithm.baekjoon.math;

import java.util.Scanner;

/**
 * ����Ʈ�� ���� : �ڿ��� n�� ���Ͽ� n���� ũ�� 2n���� �۰ų� ���� �Ҵ��� ��� �ϳ� �����Ѵ�.
 * 
 * @author 82109
 */
public class BertrandPostulate {

	/*
	 * ���� 4948
	 * 
	 * ���� : �ڿ��� n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� ���̽��� n�� �����ϴ� �� �ٷ� �̷���� �ִ�.
	 * �Է��� ���������� 0�� �־�����.
	 * 
	 * ��� : �� �׽�Ʈ ���̽��� ���ؼ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ����Ѵ�.
	 */
	public static boolean[] prime = new boolean[246913]; // 123456(�ִ� ��) * 2 = 246913

	public static void getPrime() {

		// 0, 1�� �Ҽ��� �ƴ�
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
