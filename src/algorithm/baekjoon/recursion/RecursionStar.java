package algorithm.baekjoon.recursion;

import java.util.Scanner;

/**
 * n = 27 �϶� 9���� ������ ���� ������ ������ �����ϸ� �� ������ ���� ���鱸���� �ƴ� ���� ��� ȣ��
 * 
 * �׷��� n = 9�϶��� �Ѿ��. �� 9���� ������ ������ ���鱸���� ���ڷ� ä��� �ƴ� ������ �ٽ� ��� ȣ��
 * 
 * �� ������ �ݺ��ϸ� n=1�϶� �����ɰ��� ������ �迭�� �����̳� * �� ä���.
 * 
 * @author 82109
 *
 */
public class RecursionStar {

	/*
	 * ���� 2447 : �� ��� - 10
	 * 
	 * ���� : ������� �������� ���� ��� ����. N�� 3�� �ŵ�����(3, 9, 27, ...)�̶�� �� ��, ũ�� N�� ������ N��N ���簢��
	 * ����̴�. N�� 3���� Ŭ ���, ũ�� N�� ������ �������� ä���� ����� (N/3)��(N/3) ���簢���� ũ�� N/3�� �������� �ѷ���
	 * �����̴�.
	 * 
	 * �Է� : ù° �ٿ� N�� �־�����. N�� 3�� �ŵ������̴�. �� � ���� k�� ���� N=3k�̸�, �̶� 1 �� k < 8�̴�.
	 * 
	 * ��� : ù° �ٺ��� N��° �ٱ��� ���� ����Ѵ�.
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
