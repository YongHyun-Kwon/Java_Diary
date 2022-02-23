package algorithm.sorting;

import java.util.Arrays;

/**
 * ���� ������ ���ϰ��� �ϴ� Ÿ�ٰ� �� ������ ���ҿ� ���Ͽ� �ڸ��� ��ȯ�ϴ� ���Ĺ��̴�.
 * �����͸� ���ϸ鼭 ã�⿡ �� �����̸� ����̵Ǵ� ������ �ܿ� �߰����� ������ �ʿ����� �ʾ� ���ڸ� �����̴�.
 * 
 * swap �� ��ȯ�� �� �߰����� ������ �ʿ������� ���� ���� ���̱⿡ ���ڸ� ���ķ� ����.
 * ���� ������ ���� �����̴�.
 * 
 * ���������� ������ �߰����� �޸� �Һ����� ���� ���� ���ִ� ��� ȿ�����̴�.
 * �ּ��� ��� O(N)�� �ð����⵵�� ������ ���������� �����ϴ�.
 * �������δ� ������ ����� ���� �ſ� ��ȿ�����̸� �־��� ��� O(N2)�� �ð� ���⵵�� ���´�.
 * �� �������� ���¿� ���� ���� ������ ���� �����̴�.
 * 
 * ��� �ð����⵵�� O(N2)������ ���� ��� �ð����⵵�� ������ �ִ� Bubble, Selection sort �˰��� �߿�����
 * ���� �� ���Ѵ�.
 */
public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
	
		insertionSort(arr, arr.length);
		
	} // insertionSort
	
	private static void insertionSort(int[] arr, int size) {
		int target = 0;
		int j = 0;
		
		for(int i = 1; i < size; i++) {
			
			target = arr[i];
			
			j = i - 1;
			
			// Ÿ�� ���� ���Ұ� ���� ���Һ��� Ŭ ������ �ݺ�
			while( j >= 0 && target < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			} // end wile
			
			arr[j + 1] = target;
			
		} // end for
	
	} // insertionSort

	public static void main(String[] args) {
		
		int[] arr = {0, 9, 5, 7, 6, 2, 1, 4, 3, 8};
		
		insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));

	} // main

} // class
