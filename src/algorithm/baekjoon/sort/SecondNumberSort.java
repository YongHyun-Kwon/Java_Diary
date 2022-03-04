package algorithm.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ���� 2751 : �������ϱ� 2
 * 
 * ���� : N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���� �־�����. �� ����
 * ������ 1,000,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * 
 * ��� : ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * Ǯ�� : Collections.sort()�� ��� Collection.sort()�� Tim sort�̴� Tim sort�� ���
 * �ո�, ���� ���� �˰����� ����Ѵ�. �� �ΰ����� ���� �ִ� �˰����� hybrid sorting algorithm
 * �̶�� �ϸ� �պ������� �ּ� �־� ��� O(nlogn)�� ����, ���� ������ �ּ�O(n), �־��� ���� O(n2)�̴�.
 * 
 * �պ������� �־��� ��� ���������� �ּ��� ��츦 ��ģ �˰����� Tim sort��� ��
 * �ð� ���⵵ O(n) ~ O(nlogn) �� �����ϸ� �迭�� �ƴ� List�� �ڷᱸ���� ����Ͽ� �����ϸ� ���� ���� ��밡���ϴ�.
 */
public class SecondNumberSort {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		} // end for

		Collections.sort(list);

		for (int value : list) {
			sb.append(value).append("\n");
		} // end for

		System.out.println(sb);

	} // main

} // class
