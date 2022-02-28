package algorithm.search;

/**
 * ���� Ž���� �̺� Ž���̶�� �Ҹ��� ���ĵ� �迭 �Ǵ� ����Ʈ�� ������ ��� Ž�� ����̴�.
 * 
 * �迭�� �߾ӿ� �ִ� ���� �����Ͽ� ã���� �ϴ� �׸��� ���� �Ǵ� ���� �� �κ� �迭�� �ִ����� �˾Ƴ��� Ž���� ������ ������ ���δ�.
 * 
 * ã���� �ϴ� ���� �������� ���� �κ��� ���� ����� �ʿ䰡 ���� ������, �� �ܰ迡�� �˻��ؾ� �� ����Ʈ�� ũ�⸦ ������ ���� �� �ִ�.
 * �̷��� ����� �ݺ������� ����� Ž���ϴ� ����� ���� Ž���̴�.
 *
 * ���� Ž���� �������� �����̳� ������ ����� �ÿ��� �������� �ʰ�, �ַ� ������ �����Ϳ� ���� Ž���� �����ϴ�.
 * 
 * ���� Ž���� �ð� ���⵵�� O(logN) �̴�.
 */
public class BinarySearch {

	private static int binarySearch(int[] arr, int value) {
		// �ݺ� ���� Ž��

		int start = 0, end = arr.length - 1, mid = 0;

		// �迭�� ���� ���� �ݺ�
		while (start <= end) {
			mid = (start + end) / 2;
			// ã�� ���� mid ��ġ�� ���Һ��� ũ�ٸ� mid + 1
			if (value > arr[mid]) {
				start = mid + 1;
			} else {
				// ã�� ���� mid ��ġ�� ���Һ��� �۴ٸ� mid - 1
				end = mid - 1;
			} // end else

		} // end while

		return end + 1;

	}

	private static int binarySearch(int[] arr, int value, int start, int end) {
		// ��� ���� Ž��

		// ���ϴ� ���� ���� �� -1�� return
		if (start > end) {
			return -1;
		} // end if

		int mid = (start + end) / 2;

		// ã�� ���� �߰� ���� ���� �ϴٸ�
		if (value == arr[mid]) {
			return mid;
		} // end if

		// ã�� ���� mid ��ġ�� ���� ������ ũ�ٸ� mid + 1�Ͽ� ��� ȣ��
		if (value > arr[mid]) {
			return binarySearch(arr, value, mid + 1, end);
		} // end if
			// ã�� ���� mid ��ġ�� ���� �� ���� �۴ٸ� mid - 1 �Ͽ� ��� ȣ��
		return binarySearch(arr, value, start, mid - 1);

	} // binarySearch

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		int value = 2;
		int rptResult = binarySearch(arr, value);
		int rcsResult = binarySearch(arr, value, 0, arr.length - 1);

		System.out.println(value + "�� ��ġ�� : " + rptResult);
		System.out.println(value + "�� ��ġ�� : " + rcsResult);

	} // main

} // class
