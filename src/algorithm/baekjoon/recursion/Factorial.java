package algorithm.baekjoon.recursion;

import java.util.Scanner;

public class Factorial {
	
	/*
	 * ���� 10872 : ���丮��
	 * 
	 * ���� : 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� : ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
	 * 
	 * ��� : ù° �ٿ� N!�� ����Ѵ�.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(getFactorial(n));

		sc.close();

	} // main

	static int getFactorial(int n) {
		int result = 0;

		if (n == 1) {
			return 1;
		} else {
			result = n * getFactorial(n - 1);
			return result;
		} // end else
	} // getFactorial

} // class
