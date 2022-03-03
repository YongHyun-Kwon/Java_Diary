package algorithm.baekjoon.sort;

import java.util.Scanner;

/**
 * 백준 2750 : 수 정렬하기
 * 
 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이
 * 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 
 * 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 * 시간복잡도가 O(n2)인 정렬법은 선택 정렬
 */
public class NumberSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		} // end for

		sc.close();

		// Selection sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				} // end if
			} // end for j
		} // end for i

		for (int val : arr) {
			System.out.println(val);
		} // end for

	} // main
} // class