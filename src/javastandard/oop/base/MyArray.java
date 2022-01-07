package javastandard.oop.base;

/**
 * 배열의 선언, 정렬과 총합을 하는 클래스 구현
 */
public class MyArray {

	public static void main(String[] args) {

		int[] arr = new int[] {5, 9, 4, 7, 6, 2, 1, 0, 8, 3};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum = " + sumArr(arr));

	}// main

	static void printArr(int[] arr) {
		System.out.print("[");
		for (int i : arr) { // 상향된 for 문 
			System.out.print(arr[i] + ", ");
		} // end for
		System.out.println("]");
	} // end method

	static int sumArr(int[] arr) { // 배열 index들의 총합
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} // end for
		return sum;
	} // end method
	
	static void sortArr(int[] arr) { // 하나의 배열을 오른쪽 정렬
		
		for(int i = 0;i < arr.length-1;i++) {
			for(int j = 0; j < arr.length - 1 - i;j++) {
				if(arr[j] < arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				} // end if
			} // end for j
		} //end for i
	} // end method

} // class
