package javastandard.array;

public class ArrayEx4 {

	public static void main(String[] args) {

		// 배열을 활용해 최댓값과 최솟값 찾기

		int[] score = { 79, 88, 91, 60, 22, 100, 55, 64 };

		// score의 첫번째 값으로 초기화
		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) { // 첫번째 값으로 초기화 했으니 다음 값부터 읽이 위해 1로 초기화

			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			} // end els if
		} // end for

		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);

	} // main

} // class
