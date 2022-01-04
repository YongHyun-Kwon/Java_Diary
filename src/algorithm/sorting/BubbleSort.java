package algorithm.sorting;

/**
 * 버블정렬은 바로옆의 수와 비교해서 자리를 바꿔 정렬하는 것이다.<br>
 * 가장 쉬운 정렬 알고리즘이지만 시간복잡도가 좋지 않아 잘 사용하지 않는다.<br> 
 * 버블정렬의 시간복잡도는 O(n²) 공간복잡도는 O(n)이다<br>
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		} // end for
		System.out.println();

		// 한번 수행되는 것만으로 정렬이 되지 않기 때문에 배열의 -1번 만큼 반복해서 비교해야한다.
		for (int i = 0; i < numArr.length-1; i++) {
			boolean changed = false; // 자리 바꿈이 있었는지 체크

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				// numArr[j]와 바로 옆 요소 numArr[j + 1]을 비교한다.
				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // 자리 바꿈이 발생했으니 true로 변경
				}
			} // end for j

			if (!changed) // 자리 바꿈이 없으면 반복문 종료
				break;

			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]); // 정렬결과를 출력
			}
			System.out.println();
		} // end for i

	} // main

} // class
