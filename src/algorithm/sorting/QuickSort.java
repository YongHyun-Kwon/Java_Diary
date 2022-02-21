package algorithm.sorting;

import java.util.Arrays;

/**
 * �� ����(Quick Sort) ���� ���� ���Ǵ� ���� �˰����̸� ��κ��� ���α׷��� ����� ���� ���̺귯���� �ٰ��� �Ǵ� ���Ĺ�
 * 
 * �� ������ ��Ŀ������ �ϳ��� ����Ʈ�� �ǹ�(pivot)�� �������� �� ���� �κ����� ������ �ǹ����� ���� ������ �κи���Ʈ, �ٸ� �ϳ���
 * �ǹ����� ū ������ �κи������� ������ �� �� �κи���Ʈ�� ���� ��������� �����Ͽ� �����ϴ� ���
 * 
 * �� ������ ���� ���� �˰����� ������� ���ĵǴ� ����̴�.
 * 
 * �� ������ �����͸� ���ϸ鼭 ã�⿡ �� �����̶� �� �� ������ ������ ��� ������ �ܿ� �߰����� ������ �ʿ�� ���� �ʴ´� �׷��Ƿ�
 * ���ڸ� �����̶� �� �� �ִ�.
 * 
 * �ǹ������� �ϳ��� �ǹ��� �ΰ� �� ���� �κи���Ʈ�� ���� �� ���� ������ ���ҳ��� ��ȯ�� �Ͼ�⿡ �Ҿ��� ���� �˰����̱⵵ �ϴ�.
 * 
 * �������� ������ Ư�� ���°� �ƴ� �̻� ��� �ð� ���⵵�� O(NlogN)�̸� �ٸ� O(NlogN) �˰��� ����
 * �ӵ��� ���� ������. �߰����� �޸� �Ҹ� �ʿ�� ���� �ʴ´�.
 * 
 * �������δ� Ư�� ����(���ĵ� ����)������ ������ �ް��ϰ� �������� ��͸� ����ϱ⿡ ��͸� ������� ���ϴ� ��� ������ ����������.
 * 
 * �� ������ ��� �ð� ���⵵�� O(NlogN)�̰�, �־��� ��� O(N��)�̴�.
 */
public class QuickSort {

	public static void quickSort(int[] arr) {
		pivotSort(arr, 0, arr.length - 1);
	} // quickSort

	private static void pivotSort(int[] arr, int low, int high) {

		// low�� high���� ũ�ų� ������ ������ ���Ұ� 1�����ϰų� �����Ƿ� return
		if (low >= high) {
			return;
		} // end if

		int pivot = partition(arr, low, high);

		pivotSort(arr, low, pivot);
		pivotSort(arr, pivot + 1, high);

	} // pivotSort

	private static int partition(int[] arr, int left, int right) {

		int low = left - 1;
		int high = right + 1;
		int pivot = arr[(left + right) / 2]; // �߰� ��Ҹ� pivot���� ����

		while (true) {

			// 1 ���� ��Ų ���� low ��ġ�� ���� pivot �� ���� ū ���� ã�� ������ �ݺ�
			do {
				low++;
			} while (arr[low] < pivot);

			/*
			 * 1 ���ҽ�Ų ���� high�� ��ġ�� low���� ũ�ų� ���� ��ġ�̸� high�� ���� pivot���� ���� ���� ã�� �� ���� �ݺ�
			 */

			do {
				high--;
			} while (arr[high] > pivot && low <= high);

			// ���� high�� low ������ ũ�� ������ swap���� �ʰ� return

			if (low >= high) {
				return high;
			} // end if

			swap(arr, low, high);

		} // end while
	}// partition

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} // swap
	
	public static void main(String[] args) {
		
		int[] arr = { 8, 5, 2, 7, 9, 1, 3, 6, 4, 0};
		
		quickSort(arr);
		
		System.out.println(Arrays.toString(arr));

	} // main

} // class
