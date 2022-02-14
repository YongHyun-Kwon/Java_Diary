package algorithm.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decompose {

	/*
	 * 백준 2231
	 * 
	 * 문제 : 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이
	 * N인 경우, M을 N의 생성자라 한다. 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
	 * 
	 * 입력 : 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
	 * 
	 * 출력 : 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
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
