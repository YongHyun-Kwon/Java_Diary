package algorithm.sorting;

import java.util.Arrays;

/**
 * �պ������̶� ������ �����ϰ�, ������ ������ �����Ͽ� ��ġ�� ����'�̴�. �� �����ؼ� �����Ѵٴ� �������� �˰����� ��������ϴ�
 * ���Ĺ��̴�.
 * 
 * �����ؾ��� ����Ʈ�� �־����� ����Ʈ�� �����ϰ� �ݺ��� �ɰ��� ������ �κи���Ʈ���� ������ ���ҵ鳢�� ���Ͽ� �����ϴ� ����̴�.
 * 
 * ���ϸ鼭 ã�⿡ �� �����̸� ������ ������ �߰����� ������ �ʿ�� �ϱ⿡ ���ڸ� ������ �ƴϴ�. �ִ��� �۰� ������ �ɰ��� ���� �κ�
 * ����Ʈ���� ���ʴ�� ���ĳ����⿡ �������� �˰����̴�.
 * 
 * �պ� ������ ���� 1. �־��� ����Ʈ�� �������� �����Ͽ� �κи���Ʈ�� ������. 2. �ش� �κи���Ʈ�� ���̰� 1�� �ƴϸ� 1�������� ��Ǯ��
 * �Ѵ�. 3. ������ �κи���Ʈ���� �����Ͽ� ��ģ��.
 * 
 * ���������� �ݵ�� 2���� �κи���Ʈ�� ������� �ϴ� ���� �ƴϴ�.
 * 
 * �պ� ������ ������ �׻� �� �κи���Ʈ�� �ɰ��� ���⿡ �־��� ��쿡�� O(NlogN)�̸� ���� �����̴�. �������δ� ���İ�������
 * �߰����� ������ ����ϱ⿡ �޸� ��뷮�� ������ ���� �迭���� ���� �迭�� ������ �� ���� �ð��� �Һ��ϱ� ������ �����Ͱ� ���� ����
 * ���� �ð��� �ҿ�ȴ�.
 * 
 * �պ������� ��� �ð����⵵�� O(NlogN)�̴�.
 *
 */
public class MergeSort {

	private static int[] sortArr;

	public static void mergeSort(int[] arr) {

		sortArr = new int[arr.length];
		mergeSort(arr, 0, arr.length - 1);
		sortArr = null;
	} // mergeSort

	private static void mergeSort(int[] arr, int left, int right) {

		// �κи���Ʈ�� 1���� ������ ���� return
		if (left == right)
			return;

		int mid = (left + right) / 2; // ����Ʈ�� ���� ��ġ�� ���Ѵ�.

		mergeSort(arr, left, mid); // mid�� ������ ���� �κ� �� ���� ����Ʈ
		mergeSort(arr, mid + 1, right); // mid�� ������ ���� �κ� �� ������ �κи���Ʈ

		merge(arr, left, mid, right);

	} // mergeSort

	private static void merge(int[] arr, int left, int mid, int right) {
		int leftStrat = left;
		int rightStrat = mid + 1;
		int idx = left;

		while (leftStrat <= mid && rightStrat <= right) {
			// ���� �κи���Ʈ leftStart��° ���Ұ� ������ �κи���Ʈ rightStart ���Һ���
			// �۰ų� ������� ������ leftStrat��° ���Ҹ� ���迭�� �ְ� leftStrat�� idx�� 1����
			if (arr[leftStrat] <= arr[rightStrat]) {
				sortArr[idx] = arr[leftStrat];
				idx++;
				leftStrat++;
			} else { // ������ �κи���Ʈ rightStrat��° ���Ұ� ���� ����Ʈ 1��° ���Һ���
						// �۰ų� ������� rightStrat��° ���Ҹ� ���迭�� �ְ� idx�� �Բ� ����
				sortArr[idx] = arr[rightStrat];
				idx++;
				rightStrat++;
			}
		} // end while

		// ���� �κи���Ʈ�� ��� �� �迭�� ä������ ���
		// ������ �κи���Ʈ�� ������ ���ҵ��� �� �迭�� ä���ش�.
		if (leftStrat > mid) {
			while (rightStrat <= right) {
				sortArr[idx] = arr[rightStrat];
				idx++;
				rightStrat++;
			} // end while
		} else {
			while (leftStrat <= mid) {
				sortArr[idx] = arr[leftStrat];
				idx++;
				leftStrat++;
			} // end while
		} // end else

		for (int i = left; i <= right; i++) {
			arr[i] = sortArr[i];
		} // end for

	} // merge

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 2, 4, 6, 9, 0, 1, 3 };

		mergeSort(arr);

		System.out.println(Arrays.toString(arr));

	} // main

} // class
