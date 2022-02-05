package algorithm.baekjoon.recursion;

import java.util.Scanner;

public class Hanoi {

	/*
	 * ���� 11729 ���� : �� ���� ��밡 �ְ� ù ��° ��뿡�� �ݰ��� ���� �ٸ� n���� ������ �׿� �ִ�. �� ������ �ݰ��� ū �������
	 * �׿��ִ�. ���� �����µ��� ���� ��Ģ�� ���� ù ��° ��뿡�� �� ��° ���� �ű�� �Ѵ�. �� �۾��� �����ϴµ� �ʿ��� �̵� ������
	 * ����ϴ� ���α׷��� �ۼ��϶�. ��, �̵� Ƚ���� �ּҰ� �Ǿ�� �Ѵ�.
	 * 
	 * �Է� : ù° �ٿ� ù ��° ��뿡 ���� ������ ���� N (1 �� N �� 20)�� �־�����.
	 * 
	 * ��� : ù° �ٿ� �ű� Ƚ�� K�� ����Ѵ�.
	 * 
	 * �� ��° �ٺ��� ���� ������ ����Ѵ�. �� ��° �ٺ��� K���� �ٿ� ���� �� ���� A B�� ��ĭ�� ���̿� �ΰ� ����ϴµ�, �̴� A��°
	 * ž�� ���� ���� �ִ� ������ B��° ž�� ���� ���� �ű�ٴ� ���̴�.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		move(n, 1, 3, 2); // 3���� ������ 1��Ÿ������ 3��Ÿ���� �̵�, 2�� Ÿ���� Sub�� ���

		sc.close();

	}

	static void move(int n, int start, int end, int sub) {
		if (n == 1) {
			System.out.println(start + "->" + end);
			return;
		} // 1 �϶��� �ڵ�

		move(n - 1, start, sub, end); // N-1���� ��ǥ���ƴ� Sub�� �Űܳ��� �Ѵ�.
		move(1, start, end, sub); // move method�� ������ sub���� ������ ���̰� 3���� ��� �Ǿ� ū������ �ű��.
		move(n - 1, sub, end, start); // �Ʊ� �ű� ������ sub -> end Ÿ���� �ű��.

	}

}
