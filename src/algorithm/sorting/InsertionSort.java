package algorithm.sorting;

import java.util.Arrays;

/**
 * 삽입 정렬은 비교하고자 하는 타겟과 그 이전의 원소와 비교하여 자리를 교환하는 정렬법이다.
 * 데이터를 비교하면서 찾기에 비교 정렬이며 대상이되는 데이터 외엔 추가적인 공간이 필요하지 않아 제자리 정렬이다.
 * 
 * swap 즉 교환할 때 추가적인 변수가 필요하지만 아주 적은 양이기에 제자리 정렬로 본다.
 * 삽입 정렬은 안정 정렬이다.
 * 
 * 삽입정렬의 장점은 추가적인 메모리 소비가적고 거의 정렬 되있는 경우 효과적이다.
 * 최선의 경우 O(N)의 시간복잡도를 가지며 안정정렬이 가능하다.
 * 단점으로는 역순에 가까울 수록 매우 비효율적이며 최악의 경우 O(N2)의 시간 복잡도를 갖는다.
 * 즉 데이터의 상태에 따라 성능 편차가 심한 정렬이다.
 * 
 * 평균 시간복잡도는 O(N2)이지만 같은 평균 시간복잡도를 가지고 있는 Bubble, Selection sort 알고리즘 중에서는
 * 빠른 편에 속한다.
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
			
			// 타겟 값의 원소가 이전 원소보다 클 때까지 반복
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
