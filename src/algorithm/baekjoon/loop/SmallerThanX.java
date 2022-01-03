package algorithm.baekjoon.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SmallerThanX {

	public static void main(String[] args) throws IOException {
		// ���� 10871 - x ���� ������
		// ���� N���� �̷���� A�� ���� X�� �־�����.
		// �̶� A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ�
		
		// �������� Scanner�� ��������� BufferedReader�� �������̷� ����
		// BufferedReader�� ���(Scanner 280ms, BufferedReader 108ms)
		
		
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
