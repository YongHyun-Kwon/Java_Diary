package javastandard.array;

import java.util.*; // java.util.�� ��� ����� �����´�.

/**
 * �迭�̶�?<br>
 * ���� Ÿ���� ���� ������ �ϳ��� �������� ���� ��
 * 
 */
public class ArrayEx1 {

	public static void main(String[] args) {

		int[] iArr1 = new int[10]; // �迭�� index�� 0���� �����ϹǷ� 0~9���� ���̰� 10�� �迭�� ����
		int[] iArr2 = new int[10]; // 10�� ������ �ѰԵǸ� Err
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 }; // �迭�� �ʱ�ȭ ���
		char[] chArr = { 'a', 'b', 'c', 'd' }; // new�� ������� �ʾƵ� �ȴ�. ������ Ÿ���� ������ �� ����.

		for (int i = 0; i < iArr1.length; i++) { // .length �迭�� ����
			iArr1[i] = i + 1;
		} // end for

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1; // 1~10�� ���� �迭�� ����
		} // end for

		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ","); // �迭�� ���
		} // end for

		System.out.println();

		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3); // �迭�� �ּҰ� ���
		System.out.println(chArr); // char�迭�� ��쿡�� println�� ������ ���� �״�� ���

	} // main

} // class
