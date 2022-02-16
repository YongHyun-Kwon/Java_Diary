package algorithm.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chessboard {

	private static boolean[][] arrCheck;
	private static int min = 64;

	public static void find(int x, int y) {

		int lastX = x + 8;
		int lastY = y + 8;
		int cnt = 0;

		boolean check = arrCheck[x][y];

		for (int i = x; i < lastX; i++) {
			for (int j = y; j < lastY; j++) {

				if (arrCheck[i][j] != check) {
					cnt++;
				} // end if

				check = (!check);
			} // end for j

			check = !check;
		} // end for i

		cnt = Math.min(cnt, 64 - cnt);

		min = Math.min(min, cnt);

	}// find

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arrCheck = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arrCheck[i][j] = true; // W일 때는 true
				} else {
					arrCheck[i][j] = false; // B일 때는 false
				} // end if

			} // end for j
		} // end for i

		int nRow = n - 7;
		int mCol = m - 7;

		for (int i = 0; i < nRow; i++) {
			for (int j = 0; j < mCol; j++) {
				find(i, j);
			} // end for j
		} // end for i
		System.out.println(min);
	} // main

} // class