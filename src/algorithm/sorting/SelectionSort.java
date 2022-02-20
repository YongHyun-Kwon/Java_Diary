package algorithm.sorting;

import java.util.Arrays;

/**
 * ���� ������ �����Ͱ� �������� ���� �� �ִٰ� �������� ��, ���� ���� �����͸� ������
 * �� �տ��ִ� �����Ϳ� �ٲٰ�, �� ���� ���� �����͸� ������
 *  �տ��� �� ��° �����Ϳ� �ٲٴ� ������ �ݺ��Ѵ�.
 *  
 * ���������� N-1 ��ŭ ���� ���� ���� ã�Ƽ� �� ������ ������ �ϸ� �Ź� ���� ���� ã�� ����
 * �� ������ �ʿ��ϴ�. ���� Ƚ���� N + (N-1) + (N-2) + ... + 2�̸�
 * �ٻ�ġ�� N * (N + 1)/2���� ������ �����ϸ� O(N��) �ð� ���⵵�� ������.
 * 
 * �������� ���� ���� �� ���� ������ ��Ÿ����,
 * ���� ���� �����ϱ� ���ؼ� �񱳴� ������ ��������� ��ȯȽ���� ����.
 * ��, ���� �ڷῡ ���ؼ��� �ӵ��� �ް��� ������ ������ ���Ǳ� ����� ���� ������ �ƴϴ�.
 * 
 * @user
 */
public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		
		selectionSort(arr, arr.length);
		
	} // selectionSort
	
	private static void selectionSort(int[] arr, int size) {
		
		int min;
		
		/* 
		 * �� �ε��� ���� �����س����� ������ N-1���� ���ĵǾ� �ִٴ� ����
		 * ������ ���Ұ� �ִ��̱� ������ ���� ������ �ʿ䰡 ����.
		 */
		for(int i = 0; i < size - 1; i++) {
			min = i;
			
			for(int j = i + 1; j < size; j++) {
				if(arr[j] < arr[min]){
					min = j;
				} // end if
			} // end for j
			
			swap(arr, min, i);
			
		} // end for i
		
	} // selectionSort
	
	private static void swap(int[]arr, int min, int i) {
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	} // swap
	

	public static void main(String[] args) {
		
		int[] arr = { 4, 8, 2, 5, 1, 6, 7, 9, 0, 3};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	} // main

} // class
