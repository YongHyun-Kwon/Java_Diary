package algorithm.sorting;

/**
 * Counting Sort : 계수 정렬, 카운팅 정렬로 불린다.
 * 카운팅 정렬은 많은 알고리즘 중 시간복잡도가 O(n)으로 뛰어난 성능을 보이는 알고리즘이다.
 * 보통 빠르다고 알고 있는 퀵 정렬, 힙 정렬, 합병정렬이 있는 데 이 알고리즘의 평균 시간 복잡도는
 * O(nlogn)인것에 비해 뛰어난 속도를 보이는 정렬법이다.
 * 카운팅 정렬의 기본은 데이터의 값이 몇 번 나왔는지를 세주는 것이다.
 * 
 * 카운팅 정렬의 과정
 * - 첫번째 과정
 * array를 한 번 순회하며 값이 나올 때마다 해당 값을 index로 하는 새 배열 즉 카운팅 배열의 값을
 * 1증가 시킨다. 이렇게 되면 counting 배열은 각 값의 개수가 담겨져있는 배열이 된다.
 * 
 * - 두번째 과정
 * counting 배열의 각 값을 누적합으로 변환 시키며 이때 정렬할 경우 counting 배열의 각 값은
 * 시작점 - 1을 알려준다.
 * 
 * - 세번째 과정
 * 즉 array[0] = 4, counting[4] = 8이면 여기서 counting[4]의 값에 1을 빼준 뒤
 * 해당 값이 새로운 배열의 인덱스 7에 위치하게 된다.
 * 
 * 안정적으로 정렬하기 위해서는 array의 마지막 index부터 순회하는 것이 좋다.
 * 
 * 보기에는 두 수를 비교하지 않기에 빠른 배치가 가능하지만 새로운 배열을 선언해주는 것이 큰 단점이다.
 * 작은 수의 원소를 정렬하려 할 때 그 수의 범위가 0 ~ 100,000,000이라면 메모리 낭비가 심하게 된다.
 * 
 * 여기서 퀵 정렬과 병합정렬이 선호되는 이유를 알 수 있는데 하나의 배열만 사용하고
 * 공간복잡도는 O(n) 시간복잡도는O(nlogn)로 빠른 편이기 대문이다.
 * 
 * 여기서 각기 상황에 맞게 정렬 알고리즘을 사용해야 한다는 점을 알 수 있다.
 */
public class CountingSort {

	public static void main(String[] args) {
		
		int[] arr = new int[1000]; // 정렬할 원소
		int[] counting = new int[51]; // 수의 범위 0
		int[] result = new int[1000]; // 정렬 값을 넣을 배열
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*51);
		} // end for
		
		// Counting sort
		for(int i = 0; i < arr.length;i++) {
			// array의 결과 값을 index로 하는 counting배열의 값을 1 증가시킨다.
			counting[arr[i]]++;
		} // end for
		
		// Counting배열 누적합
		for(int i = 1; i < counting.length;i++) {
			counting[i] += counting[i-1];
		} // end for
		
		for(int i = arr.length - 1; i >= 0; i--) {
			// i 번 원소를 인덱스로 하는 counting배열을 -1
			// counting배열의 값을 인덱스로 result에 결과 값을 저장
			int val = arr[i];
			counting[val]--;
			result[counting[val]] = val;
		} // end for
		
		// 원소의 수를 가진 배열
		System.out.println("arr 배열");
		for (int i = 0; i < arr.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(arr[i] + "\t");
		} // end for
		System.out.println("\n");
		
		// counting 배열
		System.out.println("Counting 배열");
		for(int i = 0; i < counting.length;i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(counting[i] + "\t");
		} // end for
		System.out.println("\n");
		
		// result 배열
		System.out.println("정렬한 값인 result 배열");
		for(int i = 0; i < result.length;i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(result[i] + "\t");
		} // end for
		System.out.println();

	} // main

} // class
