package algorithm.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * ���� : 2108 �����
 * 
 * ���� : ���� ó���ϴ� ���� ����п��� ����� �߿��� ���̴�. ����п��� N���� ���� ��ǥ�ϴ� �⺻ ��谪���� ������ ���� �͵��� �ִ�.
 * ��, N�� Ȧ����� ��������.
 * 
 * 1. ������ : N���� ������ ���� N���� ���� ��
 * 2. �߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
 * 3. �ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
 * 4. ���� : N���� ���� �� �ִ񰪰� �ּڰ��� ���� N���� ���� �־����� ��, �װ��� �⺻ ��谪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : ù° �ٿ� ���� ���� N(1 �� N �� 500,000)�� �־�����. ��, N�� Ȧ���̴�. �� ���� N���� �ٿ��� ��������
 * �־�����. �ԷµǴ� ������ ������ 4,000�� ���� �ʴ´�.
 * 
 * ��� : ù° �ٿ��� �������� ����Ѵ�. �Ҽ��� ���� ù° �ڸ����� �ݿø��� ���� ����Ѵ�.
 * ��° �ٿ��� �߾Ӱ��� ����Ѵ�.
 * ��° �ٿ��� �ֺ��� ����Ѵ�. ���� �� ���� ������ �ֺ� �� �� ��°�� ���� ���� ����Ѵ�.
 * ��° �ٿ��� ������ ����Ѵ�.
 * 
 * (0 + 0 + (-1)) / 3 = -0.333333... �̰� �̸� ù° �ڸ����� �ݿø��ϸ� 0�̴�. -0���� ����ϸ� �ȵȴ�.
 */
public class Statisitcs {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			arr[i] = value;
			sum += value;
		} // end for

		Arrays.sort(arr);

		boolean flag = false;
		int max = 0;
		int min = 10000;
		int skip = 0; // ���� ���� ������ �� ��
		int cnt = 1;
		int value = 0;

		for (int i = 0; i < n; i++) {
			value = arr[i];

			for (int j = i + 1; j < n; j++) {
				if (value != arr[j]) {
					break;
				} // end if
				cnt++;
				skip++;
			} // end for j

			if (cnt > max) {
				max = cnt;
				min = value;
				flag = true;
			} else if (cnt == max && flag == true) {
				min = value;
				flag = false;
			} // end else if

			i += skip;
		} // end for i

		System.out.println((int) Math.round((double) sum / n));
		System.out.println(arr[n / 2]);
		System.out.println(min);
		System.out.println(arr[n - 1] - arr[0]);

	} // main

} // class
