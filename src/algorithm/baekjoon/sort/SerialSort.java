package algorithm.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * ���� 1431 : �ø��� ��ȣ
 * 
 * ���� : �ټ��̴� ��Ÿ�� ���� ������ �ִ�. �׸��� ������ ��Ÿ�� ��� �ٸ� �ø��� ��ȣ�� ������ �ִ�. �ټ��̴� ��Ÿ�� ���� ã�Ƽ� ����
 * ����鿡�� �������ֱ� ���ؼ� ��Ÿ�� �ø��� ��ȣ ������� �����ϰ��� �Ѵ�.
 * 
 * ��� �ø��� ��ȣ�� ���ĺ� �빮�� (A-Z)�� ���� (0-9)�� �̷���� �ִ�.
 * 
 * �ø����ȣ A�� �ø����ȣ B�� �տ� ���� ���� ������ ����.
 * 
 * 1. A�� B�� ���̰� �ٸ���, ª�� ���� ���� �´�.
 * 2. ���� ���� ���̰� ���ٸ�, A�� ��� �ڸ����� �հ� B�� ��� �ڸ����� ���� ���ؼ� ���� ���� ������ ���� �����´�. (������ �͸� ���Ѵ�) 
 * 3. ���� 1,2�� �� �������ε� ���� �� ������, ���������� ���Ѵ�. ���ڰ� ���ĺ����� ���������� �۴�.
 * 
 * �ø����� �־����� ��, �����ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : ù° �ٿ� ��Ÿ�� ���� N�� �־�����. N�� 50���� �۰ų� ����. ��° �ٺ��� N���� �ٿ� �ø��� ��ȣ�� �ϳ��� �־�����.
 * �ø��� ��ȣ�� ���̴� �ִ� 50�̰�, ���ĺ� �빮�� �Ǵ� ���ڷθ� �̷���� �ִ�. �ø��� ��ȣ�� �ߺ����� �ʴ´�.
 * 
 * ��� : ù° �ٺ��� ���ʴ�� N���� �ٿ� ���ٿ� �ϳ��� �ø��� ��ȣ�� ������ ����� ����Ѵ�.
 */
public class SerialSort {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		} // end for

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length()) {
					return -1;
				} else if (o1.length() == o2.length()) {
					if (add(o1) == add(o2)) {
						return o1.compareTo(o2);
					} else {
						return Integer.compare(add(o1), add(o2));
					} // end if
				} else {
					return 1;
				}

			} // compare

		});

		StringBuilder sb = new StringBuilder();
		for (String value : arr) {
			sb.append(value).append("\n");
		} // end for

		System.out.println(sb);

	} // main

	public static int add(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum += s.charAt(i) - '0';
			} // end if
		} // end for

		return sum;
	} // add
} // class
