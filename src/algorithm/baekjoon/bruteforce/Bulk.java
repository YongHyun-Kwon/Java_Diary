package algorithm.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bulk {

	/*
	 * 백준 7568
	 * 
	 * 문제 : N명의 집단에서 각 사람의 덩치 등수는 자신보다 더 "큰 덩치"의 사람의 수로 정해진다. 만일 자신보다 더 큰 덩치의 사람이
	 * k명이라면 그 사람의 덩치 등수는 k+1이 된다. 이렇게 등수를 결정하면 같은 덩치 등수를 가진 사람은 여러 명도 가능하다. 학생 N명의
	 * 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력해야 한다.
	 * 
	 * 입력 : 첫 줄에는 전체 사람의 수 N이 주어진다. 그리고 이어지는 N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가
	 * 하나의 공백을 두고 각각 나타난다.
	 * 
	 * 출력 : 여러분은 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다.
	 *  단, 각 덩치 등수는 공백문자로 분리되어야 한다.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arrBulk = new int[n][2];

		String[] arrSplit;

		for (int i = 0; i < n; i++) {
			arrSplit = br.readLine().split(" ");
			arrBulk[i][0] = Integer.parseInt(arrSplit[0]); // 무게
			arrBulk[i][1] = Integer.parseInt(arrSplit[1]); // 키
		} // end for

		int rank = 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (arrBulk[i][0] < arrBulk[j][0] && arrBulk[i][1] < arrBulk[j][1]) {
					rank++;
				} // end if
			} // end for j
		} // end for i
		System.out.println(rank + " ");
	} // main

} // class
