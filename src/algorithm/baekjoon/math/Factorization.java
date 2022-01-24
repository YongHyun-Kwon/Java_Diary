package algorithm.baekjoon.math;

import java.util.Scanner;

public class Factorization {

	public static void main(String[] args) {

		/*
		 * ���� 11653 ���� : ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� : ù° �ٿ� ���� N (1 �� N �� 10,000,000)�� �־�����.
		 * 
		 * ��� : N�� ���μ����� ����� �� �ٿ� �ϳ��� ������������ ����Ѵ�. N�� 1�� ��� �ƹ��͵� ������� �ʴ´�.
		 */

		Scanner sc = new Scanner(System.in);
		sc.close();

		int n = sc.nextInt();

		int op = 2;
		while (n != 1) {
			if (n % op == 0) {
				System.out.print(op + " ");
				n /= op;
			} else {
				op++;
			} // end else
		} // end while

	} // main

} // class
