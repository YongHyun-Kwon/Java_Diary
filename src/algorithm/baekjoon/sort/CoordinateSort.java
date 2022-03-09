package algorithm.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * ���� 11650 : ��ǥ �����ϱ�
 * 
 * ���� : 2���� ��� ���� �� N���� �־�����. ��ǥ�� x��ǥ�� �����ϴ� ������, x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ������ ����
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : ù° �ٿ� ���� ���� N (1 �� N �� 100,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� i������ ��ġ xi�� yi��
 * �־�����. (-100,000 �� xi, yi �� 100,000) ��ǥ�� �׻� �����̰�, ��ġ�� ���� �� ���� ����.
 * 
 * ��� : ù° �ٺ��� N���� �ٿ� ���� ������ ����� ����Ѵ�.
 */
public class CoordinateSort {

	/*
	 * 2���� �迭�� Arrays.sort()�� ���������� ����� �� ����. �� API�� ���� sort method�� <T>[] a ,
	 * Comparator<? super T> c) �� ���ڸ� ���� �� �ִ�. Comparator�� ��� ���ٽ����� ǥ���� �����ϴ�.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][2];

		StringTokenizer st = null;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		} // end for

//		Arrays.sort(arr, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//
//				if (o1[0] == o2[0]) {
//					return o1[1] - o2[1];
//				} else {
//					return o1[0] - o2[0];
//				}
//
//			}
//
//		});

		Arrays.sort(arr, (n1, n2) -> {
			if (n1[0] == n2[0]) {
				return n1[1] - n2[1];
			} else {
				return n1[0] - n2[0];
			} // end else
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		} // end for
		System.out.println(sb);

	}

}
