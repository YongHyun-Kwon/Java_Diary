package algorithm.baekjoon.recursion;

import java.util.Scanner;

public class Fibonacci {
	
	/*
	 * ���� 10870 : �Ǻ���ġ �� 5
	 * 
	 * ���� : n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� : ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
	 * 
	 * ��� : ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sc.close();

		System.out.println(getFibonacci(n));

	} // main

	static int getFibonacci(int n) {
		int result = 0;
		if( n < 2) {
			return n;
		} else {
			result = getFibonacci(n-1) + getFibonacci(n-2);
		} // end else

		return result;
	} // getFibonacci

} // class
