package algorithm.search;

/**
 * ���� Ž��(Linear Search)�� �Ϸķ� �� �ڷḦ ���ʺ��� ���������� ���ʴ�� Ž���ϴ� ��
 * 
 * 3, 9, 11, 5, 87, 8, 6 �� �ڷᰡ ���� �� 5�� ã�� ���� ��
 * ù��° ���� 3�� 5���ƴϴ� ���� index�� ���� ���Ͽ� 5�� ������ �� ����
 * 
 * Ž���� ���� �����̸� ������ �ſ� ���������� �ݴ�� �������� �� �� �迭�� ũ�Ⱑ Ŀ�� ����
 * �ð��� �����ɸ��ٴ� ������ ������ �־��� ��� ������ ������ Ž���ϱ� ������ O(N)�� �ð� ���⵵�� ������.
 */
public class LinearSearch {
	
	public static int linearSearch(int[] arr, int find) {
		
		for( int i = 0; i < arr.length; i++) {
			if (find == arr[i]) {
				return i;
			} // end if
		} // end for
		
		// ã�� ���� �������� ���� ���
		return -1;
		
	} //  linearSearch

	public static void main(String[] args) {
		
		int[] arr = { 3, 9, 11, 5, 87, 8, 6 };
		
		System.out.println(linearSearch(arr, 5));

	}

}
