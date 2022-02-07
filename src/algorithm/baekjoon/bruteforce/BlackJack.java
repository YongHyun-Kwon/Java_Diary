package algorithm.baekjoon.bruteforce;

import java.util.Scanner;

public class BlackJack {

	/*
	 * ���� 2798 : ����
	 * 
	 * ���� : ���� �÷��̾�� ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�. ���� ���� �����̱� ������, �÷��̾ ��
	 * ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�. N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M��
	 * �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.
	 * 
	 * �Է� : ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����. ��° �ٿ��� ī�忡 ���� �ִ�
	 * ���� �־�����, �� ���� 100,000�� ���� �ʴ� ���� �����̴�.
	 * ���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.
	 * 
	 * ��� : ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = search(arr, n, m);
		System.out.println(result);

		sc.close();
	}

// Ž��
	static int search(int[] arr, int n, int m) {
		int result = 0;

		// 3���� ���� �����̱⿡ ù������ n-2
		for (int i = 0; i < n - 2; i++) {
			// �� ��° ī��� ù ��° ī�� �������� N - 1 ������ ��ȸ
			for (int j = i + 1; j < n - 1; j++) {
				// �� ��° ī��� �� ��° ī�� �������� N ���� ��ȸ
				for (int k = j + 1; k < n; k++) {
					int temp = arr[i] + arr[j] + arr[k];

					if (m == temp) {
						return temp;
					}

					if (result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}

		return result;
	}
}