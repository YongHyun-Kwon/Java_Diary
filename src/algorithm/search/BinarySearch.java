package algorithm.search;

/**
 * 이진 탐색은 이분 탐색이라고도 불리며 정렬된 배열 또는 리스트에 적합한 고속 탐색 방법이다.
 * 
 * 배열의 중앙에 있는 값을 조사하여 찾고자 하는 항목이 왼쪽 또는 오른 쪽 부분 배열에 있는지를 알아내어 탐색의 범위를 반으로 줄인다.
 * 
 * 찾고자 하는 값이 속해있지 않은 부분은 전혀 고려할 필요가 없기 때문에, 매 단계에서 검색해야 할 리스트의 크기를 반으로 줄일 수 있다.
 * 이러한 방법을 반복적으로 사용해 탐색하는 방법이 이진 탐색이다.
 *
 * 이진 탐색은 데이터의 삽입이나 삭제가 빈번할 시에는 적합하지 않고, 주로 고정된 데이터에 대한 탐색에 적합하다.
 * 
 * 이진 탐색의 시간 복잡도는 O(logN) 이다.
 */
public class BinarySearch {

	private static int binarySearch(int[] arr, int value) {
		// 반복 이진 탐색

		int start = 0, end = arr.length - 1, mid = 0;

		// 배열의 범위 까지 반복
		while (start <= end) {
			mid = (start + end) / 2;
			// 찾는 값이 mid 위치의 원소보다 크다면 mid + 1
			if (value > arr[mid]) {
				start = mid + 1;
			} else {
				// 찾는 값이 mid 위치의 원소보다 작다면 mid - 1
				end = mid - 1;
			} // end else

		} // end while

		return end + 1;

	}

	private static int binarySearch(int[] arr, int value, int start, int end) {
		// 재귀 이진 탐색

		// 원하는 값이 없을 시 -1을 return
		if (start > end) {
			return -1;
		} // end if

		int mid = (start + end) / 2;

		// 찾는 값이 중간 값과 동일 하다면
		if (value == arr[mid]) {
			return mid;
		} // end if

		// 찾는 값이 mid 위치의 원소 값보다 크다면 mid + 1하여 재귀 호출
		if (value > arr[mid]) {
			return binarySearch(arr, value, mid + 1, end);
		} // end if
			// 찾는 값이 mid 위치의 원소 값 보다 작다면 mid - 1 하여 재귀 호출
		return binarySearch(arr, value, start, mid - 1);

	} // binarySearch

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		int value = 2;
		int rptResult = binarySearch(arr, value);
		int rcsResult = binarySearch(arr, value, 0, arr.length - 1);

		System.out.println(value + "의 위치는 : " + rptResult);
		System.out.println(value + "의 위치는 : " + rcsResult);

	} // main

} // class
