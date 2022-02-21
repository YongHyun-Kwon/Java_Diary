package algorithm.sorting;

import java.util.Arrays;

/**
 * 퀵 정렬(Quick Sort) 가장 많이 사용되는 정렬 알고리즘이며 대부분의 프로그래밍 언어의 정렬 라이브러리의 근간이 되는 정렬법
 * 
 * 퀵 정렬의 메커니즘은 하나의 리스트를 피벗(pivot)을 기준으로 두 개의 부분으로 나누어 피벗보다 작은 값들의 부분리스트, 다른 하나는
 * 피벗보다 큰 값들의 부분리스르토 정렬한 후 각 부분리스트에 대해 재귀적으로 수행하여 정렬하는 방법
 * 
 * 퀵 정렬은 분할 정복 알고리즘을 기반으로 정렬되는 방식이다.
 * 
 * 퀵 정렬은 데이터를 비교하면서 찾기에 비교 정렬이라 할 수 있으며 정렬의 대상 데이터 외엔 추가적인 공간을 필요로 하지 않는다 그러므로
 * 제자리 정렬이라 할 수 있다.
 * 
 * 피벗정렬은 하나의 피벗을 두고 두 개의 부분리스트를 만들 때 서로 떨어진 원소끼리 교환이 일어나기에 불안정 정렬 알고리즘이기도 하다.
 * 
 * 퀵정렬의 장점은 특정 상태가 아닌 이상 평균 시간 복잡도는 O(NlogN)이며 다른 O(NlogN) 알고리즘에 비해
 * 속도가 가장 빠르다. 추가적인 메모리 소모를 필요로 하지 않는다.
 * 
 * 단점으로는 특정 조건(정렬된 상태)에서는 성능이 급격하게 떨어지며 재귀를 사용하기에 재귀를 사용하지 못하는 경우 구현이 복잡해진다.
 * 
 * 퀵 정렬의 평균 시간 복잡도는 O(NlogN)이고, 최악의 경우 O(N²)이다.
 */
public class QuickSort {

	public static void quickSort(int[] arr) {
		pivotSort(arr, 0, arr.length - 1);
	} // quickSort

	private static void pivotSort(int[] arr, int low, int high) {

		// low가 high보다 크거나 같으면 정렬할 원소가 1개이하거나 없으므로 return
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
		int pivot = arr[(left + right) / 2]; // 중간 요소를 pivot으로 설정

		while (true) {

			// 1 증가 시킨 후의 low 위치의 값이 pivot 값 보다 큰 값을 찾을 때까지 반복
			do {
				low++;
			} while (arr[low] < pivot);

			/*
			 * 1 감소시킨 후의 high의 위치가 low보다 크거나 같은 위치이며 high의 값이 pivot보다 작은 값을 찾을 때 까지 반복
			 */

			do {
				high--;
			} while (arr[high] > pivot && low <= high);

			// 만약 high가 low 값보다 크지 않으면 swap하지 않고 return

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
