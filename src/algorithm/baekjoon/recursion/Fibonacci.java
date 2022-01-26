package algorithm.baekjoon.recursion;

import java.util.Scanner;

public class Fibonacci {
	
	/*
	 * 백준 10870 : 피보나치 수 5
	 * 
	 * 문제 : n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
	 * 
	 * 입력 : 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
	 * 
	 * 출력 : 첫째 줄에 n번째 피보나치 수를 출력한다.
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
