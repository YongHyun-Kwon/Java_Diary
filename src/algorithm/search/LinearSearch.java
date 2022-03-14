package algorithm.search;

/**
 * 선형 탐색(Linear Search)는 일렬로 된 자료를 왼쪽부터 오른쪽으로 차례대로 탐색하는 것
 * 
 * 3, 9, 11, 5, 87, 8, 6 의 자료가 있을 때 5를 찾고 싶을 때
 * 첫번째 값인 3은 5가아니니 다음 index의 값을 비교하여 5와 만났을 때 종료
 * 
 * 탐색의 가장 기초이며 구현이 매우 간단하지만 반대로 데이터의 수 즉 배열의 크기가 커질 수록
 * 시간이 오래걸린다는 단점이 있으며 최악의 경우 마지막 값까지 탐색하기 때문에 O(N)의 시간 복잡도를 가진다.
 */
public class LinearSearch {
	
	public static int linearSearch(int[] arr, int find) {
		
		for( int i = 0; i < arr.length; i++) {
			if (find == arr[i]) {
				return i;
			} // end if
		} // end for
		
		// 찾는 값이 존재하지 않을 경우
		return -1;
		
	} //  linearSearch

	public static void main(String[] args) {
		
		int[] arr = { 3, 9, 11, 5, 87, 8, 6 };
		
		System.out.println(linearSearch(arr, 5));

	}

}
