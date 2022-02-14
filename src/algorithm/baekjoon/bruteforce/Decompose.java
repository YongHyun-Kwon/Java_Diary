package algorithm.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decompose {

	/*
	 * ���� 2231
	 * 
	 * ���� : � �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�. � �ڿ��� M�� ��������
	 * N�� ���, M�� N�� �����ڶ� �Ѵ�. �ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� : ù° �ٿ� �ڿ��� N(1 �� N �� 1,000,000)�� �־�����.
	 * 
	 * ��� : ù° �ٿ� ���� ����Ѵ�. �����ڰ� ���� ��쿡�� 0�� ����Ѵ�.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int result = 0;

		int num = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			num = i;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			} // end while

			if (sum + i == n) {
				result = i;
				break;
			} // end if
		} // end for

		System.out.println(result);

	} // main

} // class
