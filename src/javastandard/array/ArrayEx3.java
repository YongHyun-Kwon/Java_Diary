package javastandard.array;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		// �迭�� Ȱ���� ��� ���
		
		int sum = 0;
		float avg = 0f; // ���ͷ��� ���̷� ���̻� f�� �ٿ������
		
		int[] score = {100, 88, 90, 96, 54}; 
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // end for
		
		avg = sum/score.length;
		
		System.out.println("�� ���� : " + sum);
		System.out.println("��� ���� : " + avg);
		
	} // main

} // class
