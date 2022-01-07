package javastandard.oop.base;

/**
 * �迭�� ����, ���İ� ������ �ϴ� Ŭ���� ����
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
		for (int i : arr) { // ����� for �� 
			System.out.print(arr[i] + ", ");
		} // end for
		System.out.println("]");
	} // end method

	static int sumArr(int[] arr) { // �迭 index���� ����
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} // end for
		return sum;
	} // end method
	
	static void sortArr(int[] arr) { // �ϳ��� �迭�� ������ ����
		
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
