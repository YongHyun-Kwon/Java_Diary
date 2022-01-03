package algorithm.baekjoon.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SmallerThanX {

	public static void main(String[] args) throws IOException {
		// 백준 10871 - x 보다 작은수
		// 정수 N개로 이루어진 A와 정수 X가 주어진다.
		// 이때 A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성
		
		// 기존에는 Scanner을 사용했으나 BufferedReader와 성능차이로 인해
		// BufferedReader을 사용(Scanner 280ms, BufferedReader 108ms)
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder(); 

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());

			if (value < X)
				sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
}
