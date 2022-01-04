package javastandard.array;

public class ArrayEx5 {

	public static void main(String[] args) {

		// �迭�� ���ڸ� ���� ����(ī�����, �ζǹ�ȣ �̱� ������ ���� ����)

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i] + " ");
		} // end for

		System.out.println();

		for (int i = 0; i < 100; i++) { // 100�� shuffle
			int n = (int) (Math.random() * 10); // 0~9���� ���ڷ� �ʱ�ȭ
			int tmp = numArr[0]; // tmp�� numArr�� ù��° �ڸ��� �ʱ�ȭ
			numArr[0] = numArr[n]; // random�Լ��� ���� 0~9������ index�� ����
			numArr[n] = tmp; // tmp�� ���� n�ڸ��� ����

		} // end for
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		} // end for
		
		System.out.println("\n-------------------");
		
		// �ζ� ������
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i;
		}
		
		int temp = 0; // ���� �ٲٱ� ���� ����� ����
		int ranNum = 0; // ������ ���� ������ ����
		
		// ���� 6�ڸ��� ��� ����� ���̱⿡ 6���� �ݺ��ϸ� �ȴ�.
		for(int i = 0; i < 6; i++) {
			ranNum = (int)(Math.random() * 45);  // 0~44������ ���� ��´�.

			temp = ball[i]; 
			ball[i] = ball[ranNum];
			ball[ranNum] = temp;	
		} // end for
		
		// 6�ڸ� �ζ� ��ȣ ��÷
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		} // end for

	} // main

} // class
