package algorithm.baekjoon.recursion;

import java.util.Scanner;

/**
 * n = 27 일때 9개의 블럭으로 구분 공백인 구간을 만족하면 그 구간은 공백 공백구간이 아닌 블럭은 재귀 호출
 * 
 * 그러면 n = 9일때로 넘어간다. 또 9개의 블럭으로 나눈뒤 공백구간은 문자로 채우고 아닌 구간을 다시 재귀 호출
 * 
 * 위 과정을 반복하면 n=1일때 더못쪼개기 때문에 배열을 공백이나 * 로 채운다.
 * 
 * @author 82109
 *
 */
public class RecursionStar {

	/*
	 * 백준 2447 : 별 찍기 - 10
	 * 
	 * 문제 : 재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형
	 * 모양이다. N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼
	 * 형태이다.
	 * 
	 * 입력 : 첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.
	 * 
	 * 출력 : 첫째 줄부터 N번째 줄까지 별을 출력한다.
	 */

	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		arr = new char[n][n];

		star(0, 0, n, false);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			} // end for j
			sb.append('\n');
		} // end for i
		System.out.println(sb);

	} // main

	static void star(int x, int y, int n, boolean blank) {
		if (blank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				} // end for j
			} // end for i
			return;
		} // end if

		if (n == 1) {
			arr[x][y] = '*';
			return;
		} // end if

		int square = n / 3;
		int cnt = 0;
		for (int i = x; i < x + n; i += square) {
			for (int j = y; j < y + n; j += square) {
				cnt++;
				if (cnt == 5) {
					star(i, j, square, true);
				} else {
					star(i, j, square, false);
				} // end else
			} // end for j
		} // end for i
	} // star
} // class
