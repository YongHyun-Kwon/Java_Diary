package algorithm.baekjoon.math;

import java.util.Scanner;

/**
 * �����佺�׳׽��� ü <br>
 * ���� : k=2 ���� ��N ���ϱ��� �ݺ��Ͽ� �ڿ����� �� k�� ������ k�� ������� ���ܽ�Ų��.
 * 
 * @author 82109
 *
 */
public class SieveOfEratosthenes {

	/*
	 * ���� 1929
	 * 
	 * ���� : M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� : ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000) M�̻� N������ �Ҽ���
	 * �ϳ� �̻� �ִ� �Է¸� �־�����.
	 * 
	 * ��� : �� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�
	 */
	public static boolean prime[]; // �Ҽ� üũ �迭 �ʱⰪ false

	public static void sivev() {

		prime[0] = true; // 0�� 1�� �Ҽ��� �ƴ�
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

		prime = new boolean[n + 1]; // �Ҽ� �Ǻ��� ���� �迭 ����
		sivev();

		for (int i = m; i <= n; i++) {
			if (!prime[i])
				System.out.println(i);
		} // end for

	} // main

} // class
