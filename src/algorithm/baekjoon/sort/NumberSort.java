package algorithm.baekjoon.sort;

import java.util.Scanner;

/**
 * ���� 2750 : �� �����ϱ�
 * 
 * ���� : N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� �� �־�����. �� ���� ������
 * 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * 
 * ��� : ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * �ð����⵵�� O(n2)�� ���Ĺ��� ���� ����
 */
public class NumberSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		} // end for

		sc.close();

		// Selection sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				} // end if
			} // end for j
		} // end for i

		for (int val : arr) {
			System.out.println(val);
		} // end for

	} // main
} // class