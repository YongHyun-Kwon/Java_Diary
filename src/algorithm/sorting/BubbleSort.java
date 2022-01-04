package algorithm.sorting;

/**
 * ���������� �ٷο��� ���� ���ؼ� �ڸ��� �ٲ� �����ϴ� ���̴�.<br>
 * ���� ���� ���� �˰��������� �ð����⵵�� ���� �ʾ� �� ������� �ʴ´�.<br> 
 * ���������� �ð����⵵�� O(n��) �������⵵�� O(n)�̴�<br>
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		} // end for
		System.out.println();

		// �ѹ� ����Ǵ� �͸����� ������ ���� �ʱ� ������ �迭�� -1�� ��ŭ �ݺ��ؼ� ���ؾ��Ѵ�.
		for (int i = 0; i < numArr.length-1; i++) {
			boolean changed = false; // �ڸ� �ٲ��� �־����� üũ

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				// numArr[j]�� �ٷ� �� ��� numArr[j + 1]�� ���Ѵ�.
				if (numArr[j] > numArr[j + 1]) { // ���� ���� ������ ���� �ٲ۴�.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // �ڸ� �ٲ��� �߻������� true�� ����
				}
			} // end for j

			if (!changed) // �ڸ� �ٲ��� ������ �ݺ��� ����
				break;

			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]); // ���İ���� ���
			}
			System.out.println();
		} // end for i

	} // main

} // class
