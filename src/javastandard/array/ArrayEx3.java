package javastandard.array;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		// 배열을 활용해 평균 계산
		
		int sum = 0;
		float avg = 0f; // 리터럴의 차이로 접미사 f를 붙여줘야함
		
		int[] score = {100, 88, 90, 96, 54}; 
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // end for
		
		avg = sum/score.length;
		
		System.out.println("총 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);
		
	} // main

} // class
