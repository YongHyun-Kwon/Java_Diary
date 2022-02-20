package algorithm.sorting;

import java.util.Arrays;

/**
 * 선택 정렬은 데이터가 무작위로 여러 개 있다고 가정했을 시, 가장 작은 데이터를 선택해
 * 맨 앞에있는 데이터와 바꾸고, 그 다음 작은 데이터를 선택해
 *  앞에서 두 번째 데이터와 바꾸는 과정을 반복한다.
 *  
 * 선택정렬은 N-1 만큼 가장 작은 수를 찾아서 맨 앞으로 보내야 하며 매번 작은 수를 찾기 위해
 * 비교 연산이 필요하다. 연산 횟수는 N + (N-1) + (N-2) + ... + 2이며
 * 근사치로 N * (N + 1)/2번의 연산을 수행하며 O(N²) 시간 복잡도를 가진다.
 * 
 * 데이터의 양이 적을 때 좋은 성능을 나타내고,
 * 작은 값을 선택하기 위해서 비교는 여러번 수행되지만 교환횟수가 적다.
 * 단, 많은 자료에 대해서는 속도가 급격히 떨어져 적절히 사용되기 힘들며 안정 정렬이 아니다.
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
		 * 앞 인덱스 부터 정렬해나가기 때문에 N-1개가 정렬되어 있다는 것은
		 * 마지막 원소가 최댓값이기 때문에 굳이 참조할 필요가 없다.
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
