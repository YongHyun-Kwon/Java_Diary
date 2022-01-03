package algorithm.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStar {

	public static void main(String[] args) throws IOException {

		// ���� 2446 �� ��� - 9
		// ù° �ٺ��� 2*N-1 ��° �ٱ��� ���ʴ�� �� ���
		// �������� Scanner�� ��������� BufferedReader�� �������̷� ����
		// BufferedReader�� ���(Scanner 280ms, BufferedReader 72ms)
		// StringBuilder�� ����� ��� ���ڿ��� �ϳ��� ��ü�� �������� ��
		// �������� ����� �� �ѹ��� �� �ð��� �Ƴ� �� �ִ�.
		
		System.out.print("�� �Է�>");
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
