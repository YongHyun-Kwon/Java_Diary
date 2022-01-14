package algorithm.baekjoon.string;

import java.util.Scanner;

public class SerchAlphabet {

	public static void main(String[] args) {

		/*
		 * ���� 10809
		 * ���� : ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��,
		 * ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� :ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
		 * 
		 * ��� : ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ�
		 * ����Ѵ�.
		 * ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��°
		 * ��ġ�̴�
		 * 
		 */

		int[] arr = new int[26]; // �ҹ��� ���ĺ� ����

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		} // ��� ���� -1�� �ʱ�ȭ // end for

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			} //end if
		} //end for

		for (int value : arr) {
			System.out.print(value + " ");
		} // end for
		sc.close();
	} // main

} // class
