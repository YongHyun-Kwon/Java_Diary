package javastandard.array;

public class ArrayEx4 {

	public static void main(String[] args) {

		// �迭�� Ȱ���� �ִ񰪰� �ּڰ� ã��

		int[] score = { 79, 88, 91, 60, 22, 100, 55, 64 };

		// score�� ù��° ������ �ʱ�ȭ
		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) { // ù��° ������ �ʱ�ȭ ������ ���� ������ ���� ���� 1�� �ʱ�ȭ

			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			} // end els if
		} // end for

		System.out.println("�ִ� : " + max);
		System.out.println("�ּҰ� : " + min);

	} // main

} // class
