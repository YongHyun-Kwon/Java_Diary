package algorithm.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStar {

	public static void main(String[] args) throws IOException {

		// 백준 2446 별 찍기 - 9
		// 첫째 줄부터 2*N-1 번째 줄까지 차례대로 별 출력
		// 기존에는 Scanner을 사용했으나 BufferedReader와 성능차이로 인해
		// BufferedReader을 사용(Scanner 280ms, BufferedReader 72ms)
		// StringBuilder을 사용해 모든 문자여을 하나의 객체에 연결해준 후
		// 마지막에 출력은 단 한번만 해 시간을 아낄 수 있다.
		
		System.out.print("별 입력>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int star = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i; j++) {
				sb.append(' ');
			}

			for (int k = 0; k < (2 * star - 1) - (2 * i); k++) {
				sb.append('*');
			}
			sb.append('\n');
		}

		for (int i = 0; i < star - 1; i++) {
			for (int j = 1; j < (star - 1) - i; j++) {
				sb.append(' ');
			}

			for (int k = 0; k < 3 + 2 * i; k++) {
				sb.append('*');
			}
			sb.append('\n');
		}

		System.out.println(sb);

	}

}
