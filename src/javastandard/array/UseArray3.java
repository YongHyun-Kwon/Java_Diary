package javastandard.array;

/**
 * 3���� �迭�� ���
 * 
 * @author user
 */
public class UseArray3 {
	public UseArray3() {
		// 1. ����) ��������[][][] �迭�� = null;
		int[][][] arr = null;

		// 2.���� ) �迭�� = new ��������[��][��][��]
		arr = new int[3][3][4];
		System.out.println("���� �� : " + arr.length + ", ���� �� : " + arr[0].length + ", ���� �� : " + arr[0][0].length);

		// 3. ���Ҵ� ) �迭��[��][��][��] = ��;
		arr[0][0][0] = 2022;
		arr[1][1][1] = 1;
		arr[2][2][3] = 13;

		// 4. ����� ) �迭��[��][��][��]
		System.out.println(arr[0][0][0] + "/" + arr[0][0][1]);

		// �ϰ�ó��
		for (int i = 0; i < arr.length; i++) { // ��
			System.out.println(i + "�� ����");

			for (int j = 0; j < arr[i].length; j++) { // ��
				System.out.println(j + " �� ����");

				for (int k = 0; k < arr[i][j].length; k++) { // ��
					System.out.printf("arr[%d][%d][%d] = %-5d", i, j, k, arr[i][j][k]);
				}

				System.out.println(j + " �� ��");
			}

			System.out.println(i + "�� ��");
		}

		// �⺻������: �鱸�� ��ȣ, �� ���а�ȣ
		int[][][] arr2 = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9, }, { 10, 11, 12 } } };
		System.out.println(arr.length + "��," + arr[0].length + "��," + arr[0][0].length + "��");

		for (int[][] tempArr2 : arr2) { // ������ �迭�� �Ѹ��� ������ �迭
			for (int[] tempArr1 : tempArr2) { // ������ �迭�� �Ѹ��� ������ �迭
				for (int value : tempArr1) { // ������ �迭�� �ѿ��� ������
					System.out.printf("%-6d", value);
				} // end for
				System.out.println();
			} // end for
			System.out.println();
		} // end for

	} // UseArray3

	public static void main(String[] args) {
		new UseArray3();
	}// main

} // class
