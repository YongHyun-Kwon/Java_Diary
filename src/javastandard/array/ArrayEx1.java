package javastandard.array;

import java.util.*; // java.util.의 모든 기능을 가져온다.

/**
 * 배열이란?<br>
 * 같은 타입의 여러 변수를 하나의 묶음으로 묶는 것
 * 
 */
public class ArrayEx1 {

	public static void main(String[] args) {

		int[] iArr1 = new int[10]; // 배열의 index는 0부터 시작하므로 0~9까지 길이가 10인 배열을 생성
		int[] iArr2 = new int[10]; // 10의 범위가 넘게되면 Err
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 }; // 배열의 초기화 방법
		char[] chArr = { 'a', 'b', 'c', 'd' }; // new를 사용하지 않아도 된다. 하지만 타입을 생략할 순 없다.

		for (int i = 0; i < iArr1.length; i++) { // .length 배열의 길이
			iArr1[i] = i + 1;
		} // end for

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1; // 1~10의 값을 배열에 저장
		} // end for

		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ","); // 배열의 출력
		} // end for

		System.out.println();

		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3); // 배열의 주소가 출력
		System.out.println(chArr); // char배열일 경우에만 println이 구분자 없이 그대로 출력

	} // main

} // class
