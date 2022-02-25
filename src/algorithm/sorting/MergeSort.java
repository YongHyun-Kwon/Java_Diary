package algorithm.sorting;

import java.util.Arrays;

/**
 * 합병정렬이란 문제를 분할하고, 분할한 문제를 정복하여 합치는 과정'이다. 즉 분할해서 정복한다는 분할정복 알고리즘을 기반으로하는
 * 정렬법이다.
 * 
 * 정렬해야할 리스트가 주어지면 리스트를 분할하고 반복해 쪼개신 시점에 부분리스트에서 인접한 원소들끼리 비교하여 정렬하는 방식이다.
 * 
 * 비교하면서 찾기에 비교 정렬이며 정렬의 대상외의 추가적인 공간을 필요로 하기에 제자리 정렬이 아니다. 최대한 작게 문제를 쪼개어 앞의 부분
 * 리스트부터 차례대로 합쳐나가기에 안정정렬 알고리즘이다.
 * 
 * 합병 정렬의 과정 1. 주어진 리스트를 절반으로 분할하여 부분리스트로 나눈다. 2. 해당 부분리스트의 길이가 1이 아니면 1번과정을 되풀이
 * 한다. 3. 인접한 부분리스트끼리 정렬하여 합친다.
 * 
 * 주의할점은 반드시 2개의 부분리스트로 나뉘어야 하는 것은 아니다.
 * 
 * 합병 정렬의 장점은 항상 두 부분리스트로 쪼개어 들어가기에 최악의 경우에도 O(NlogN)이며 안정 정렬이다. 단점으로는 정렬과정에서
 * 추가적인 공간을 사용하기에 메모리 사용량이 많으며 보조 배열에서 원본 배열로 복사할 때 많은 시간을 소비하기 때문에 데이터가 많은 경우는
 * 많은 시간이 소요된다.
 * 
 * 합병정렬의 평균 시간복잡도는 O(NlogN)이다.
 *
 */
public class MergeSort {

	private static int[] sortArr;

	public static void mergeSort(int[] arr) {

		sortArr = new int[arr.length];
		mergeSort(arr, 0, arr.length - 1);
		sortArr = null;
	} // mergeSort

	private static void mergeSort(int[] arr, int left, int right) {

		// 부분리스트가 1개의 원소일 경우는 return
		if (left == right)
			return;

		int mid = (left + right) / 2; // 리스트의 절반 위치를 구한다.

		mergeSort(arr, left, mid); // mid로 절반을 나눈 부분 중 왼쪽 리스트
		mergeSort(arr, mid + 1, right); // mid로 절반을 나눈 부분 중 오른쪽 부분리스트

		merge(arr, left, mid, right);

	} // mergeSort

	private static void merge(int[] arr, int left, int mid, int right) {
		int leftStrat = left;
		int rightStrat = mid + 1;
		int idx = left;

		while (leftStrat <= mid && rightStrat <= right) {
			// 왼쪽 부분리스트 leftStart번째 원소가 오른쪽 부분리스트 rightStart 원소보다
			// 작거나 같은경우 왼쪽의 leftStrat번째 원소를 새배열에 넣고 leftStrat와 idx를 1증가
			if (arr[leftStrat] <= arr[rightStrat]) {
				sortArr[idx] = arr[leftStrat];
				idx++;
				leftStrat++;
			} else { // 오른쪽 부분리스트 rightStrat번째 원소가 왼쪽 리스트 1번째 원소보다
						// 작거나 같을경우 rightStrat번째 원소를 새배열에 넣고 idx와 함께 증가
				sortArr[idx] = arr[rightStrat];
				idx++;
				rightStrat++;
			}
		} // end while

		// 왼쪽 부분리스트가 모두 새 배열에 채워졌을 경우
		// 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
		if (leftStrat > mid) {
			while (rightStrat <= right) {
				sortArr[idx] = arr[rightStrat];
				idx++;
				rightStrat++;
			} // end while
		} else {
			while (leftStrat <= mid) {
				sortArr[idx] = arr[leftStrat];
				idx++;
				leftStrat++;
			} // end while
		} // end else

		for (int i = left; i <= right; i++) {
			arr[i] = sortArr[i];
		} // end for

	} // merge

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 2, 4, 6, 9, 0, 1, 3 };

		mergeSort(arr);

		System.out.println(Arrays.toString(arr));

	} // main

} // class
