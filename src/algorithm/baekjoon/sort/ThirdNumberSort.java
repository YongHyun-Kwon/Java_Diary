package algorithm.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdNumberSort {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] cntArr = new int[10001];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			cntArr[Integer.parseInt(br.readLine())]++;
		} // end for

		br.close();

		StringBuilder sb = new StringBuilder();

		// 0은 입력범위에서 제외하므로 1부터 시작한다.
		for (int i = 1; i < 10001; i++) {
			while (cntArr[i] > 0) {
			// i 값이 개수가 0이 될 때 까지 출력
				sb.append(i).append("\n");
				cntArr[i]--;
			} // end while
		} // end for

		System.out.println(sb);

	}

}
