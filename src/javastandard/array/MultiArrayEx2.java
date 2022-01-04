package javastandard.array;

import java.util.Scanner;


public class MultiArrayEx2 {
	public static final int SIZE = 5;

	public static void main(String[] args) {
		// 2���� �迭�� ���� ����

		int x = 0, y = 0, num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);

		// �迭�� ��� ��Ҹ� SIZE * SIZE������ ���ڷ� �ʱ�ȭ�Ѵ�.
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			} // end for j
		} // end for i

		// shuffle
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);
				
				// bingo[i][j]�� ���Ƿ� ���õ� [x][y]�� �ٲ۴�.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			} // end for j
		} // end for i

		do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			} // end for
			System.out.println();

			System.out.printf("1~%d�� ���ڸ� �Է��ϼ���.(����� 0)>", SIZE * SIZE);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2�� �ݺ��� Ż��
					} // end if
				} // end for h
			} // end for i
		} while (num != 0);
		System.out.println("���� �Ǿ����ϴ�.");
		sc.close();
	} // main

} // class
