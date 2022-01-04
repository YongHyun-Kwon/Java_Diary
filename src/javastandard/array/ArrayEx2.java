package javastandard.array;

/**
 * �迭�� ����<br>
 * �迭�� �ѹ� �����ϸ� ���̸� �����ؼ� �÷�����ϸ� �̷� �۾��� ����� ���� ���.<br>
 * ó������ ������ �迭�� ���� *2�� �ؼ� �˳��� �������.<br>
 * �迭�� ����� for�� arraycopy()�� ����Ѵ�<br>
 * for���� �迭�� ��Ҹ� �ϳ��� �����Ͽ� ����������<br>
 * arraycopy()�� ������ ������ ������ �ѹ��� �����Ѵ�.<br>
 * �̴� �迭�� ��ҵ��� ���������� ����Ǿ� �ִ� Ư�� ������ ������ ó�� ����̴�.
 */
public class ArrayEx2 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		// �迭 arr�� �� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		} // end for

		System.out.println("[���� ��]");
		System.out.println("arr.length : " + arr.length);

		// �迭 ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		} // end for

		int[] tmp = new int[arr.length * 2]; // arr�� ���̺��� 2���� tmp �迭 ����

		// for������ arr �迭�� ���� tmp�� ����
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		} // end for

		arr = tmp;

		System.out.println("[���� ��]");
		System.out.println("arr.length : " + arr.length);
		// �迭 ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		} // end for
		
		System.out.println();

		char[] abc = { 'A', 'B', 'C', 'D', };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc); // println�� char �迭�� ��쿡�� �������� ���� ���
		System.out.println(num);
		
		// �迭 abc�� num�� �ٿ��� �ϳ��� [result] ����
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		// �迭 abc�� num�� ù��° ��ġ���� abc�� ���̸�ŭ ����.
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number�� �ε��� 6 ��ġ�� 3���� ����
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	} // main

} // class
