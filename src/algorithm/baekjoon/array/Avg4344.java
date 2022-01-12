package algorithm.baekjoon.array;

import java.util.Scanner;

public class Avg4344 {

	public static void main(String[] args) {
		/*
		 * ���� 4344
		 * 
		 * ���� : ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�.
		 *  ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
		 *  
		 * �Է� : ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		 *   ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����.
		 *   ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�
		 *   
		 *  ��� : �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
		 */

		int[] arr;

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {

			int n = sc.nextInt(); // �л� ��
			arr = new int[n];

			double sum = 0; // ���� �ջ��� ����

			for (int j = 0; j < n; j++) {
				int score = sc.nextInt(); // ���� �Է�
				arr[j] = score;
				sum += score; // ���� ��
			}

			double mean = (sum / n);
			double count = 0; // ����� �Ѵ� �л��� ���� �������� ����
			
			// ��ճѴ� �л� ����
			for (int j = 0; j < n; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / n) * 100); // %%����� %�� ��µȴ�.
		}

		sc.close();

	}

}
