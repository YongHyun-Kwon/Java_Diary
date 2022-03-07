package algorithm.sorting;

/**
 * Counting Sort : ��� ����, ī���� ���ķ� �Ҹ���.
 * ī���� ������ ���� �˰��� �� �ð����⵵�� O(n)���� �پ ������ ���̴� �˰����̴�.
 * ���� �����ٰ� �˰� �ִ� �� ����, �� ����, �պ������� �ִ� �� �� �˰����� ��� �ð� ���⵵��
 * O(nlogn)�ΰͿ� ���� �پ �ӵ��� ���̴� ���Ĺ��̴�.
 * ī���� ������ �⺻�� �������� ���� �� �� ���Դ����� ���ִ� ���̴�.
 * 
 * ī���� ������ ����
 * - ù��° ����
 * array�� �� �� ��ȸ�ϸ� ���� ���� ������ �ش� ���� index�� �ϴ� �� �迭 �� ī���� �迭�� ����
 * 1���� ��Ų��. �̷��� �Ǹ� counting �迭�� �� ���� ������ ������ִ� �迭�� �ȴ�.
 * 
 * - �ι�° ����
 * counting �迭�� �� ���� ���������� ��ȯ ��Ű�� �̶� ������ ��� counting �迭�� �� ����
 * ������ - 1�� �˷��ش�.
 * 
 * - ����° ����
 * �� array[0] = 4, counting[4] = 8�̸� ���⼭ counting[4]�� ���� 1�� ���� ��
 * �ش� ���� ���ο� �迭�� �ε��� 7�� ��ġ�ϰ� �ȴ�.
 * 
 * ���������� �����ϱ� ���ؼ��� array�� ������ index���� ��ȸ�ϴ� ���� ����.
 * 
 * ���⿡�� �� ���� ������ �ʱ⿡ ���� ��ġ�� ���������� ���ο� �迭�� �������ִ� ���� ū �����̴�.
 * ���� ���� ���Ҹ� �����Ϸ� �� �� �� ���� ������ 0 ~ 100,000,000�̶�� �޸� ���� ���ϰ� �ȴ�.
 * 
 * ���⼭ �� ���İ� ���������� ��ȣ�Ǵ� ������ �� �� �ִµ� �ϳ��� �迭�� ����ϰ�
 * �������⵵�� O(n) �ð����⵵��O(nlogn)�� ���� ���̱� �빮�̴�.
 * 
 * ���⼭ ���� ��Ȳ�� �°� ���� �˰����� ����ؾ� �Ѵٴ� ���� �� �� �ִ�.
 */
public class CountingSort {

	public static void main(String[] args) {
		
		int[] arr = new int[1000]; // ������ ����
		int[] counting = new int[51]; // ���� ���� 0
		int[] result = new int[1000]; // ���� ���� ���� �迭
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*51);
		} // end for
		
		// Counting sort
		for(int i = 0; i < arr.length;i++) {
			// array�� ��� ���� index�� �ϴ� counting�迭�� ���� 1 ������Ų��.
			counting[arr[i]]++;
		} // end for
		
		// Counting�迭 ������
		for(int i = 1; i < counting.length;i++) {
			counting[i] += counting[i-1];
		} // end for
		
		for(int i = arr.length - 1; i >= 0; i--) {
			// i �� ���Ҹ� �ε����� �ϴ� counting�迭�� -1
			// counting�迭�� ���� �ε����� result�� ��� ���� ����
			int val = arr[i];
			counting[val]--;
			result[counting[val]] = val;
		} // end for
		
		// ������ ���� ���� �迭
		System.out.println("arr �迭");
		for (int i = 0; i < arr.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(arr[i] + "\t");
		} // end for
		System.out.println("\n");
		
		// counting �迭
		System.out.println("Counting �迭");
		for(int i = 0; i < counting.length;i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(counting[i] + "\t");
		} // end for
		System.out.println("\n");
		
		// result �迭
		System.out.println("������ ���� result �迭");
		for(int i = 0; i < result.length;i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(result[i] + "\t");
		} // end for
		System.out.println();

	} // main

} // class
