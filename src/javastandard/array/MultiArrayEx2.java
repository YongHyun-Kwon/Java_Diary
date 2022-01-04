package javastandard.array;

import java.util.Scanner;


public class MultiArrayEx2 {
	public static final int SIZE = 5;

	public static void main(String[] args) {
		// 2차원 배열로 만든 빙고

		int x = 0, y = 0, num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);

		// 배열의 모든 요소를 SIZE * SIZE까지의 숫자로 초기화한다.
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
				
				// bingo[i][j]와 임의로 선택된 [x][y]를 바꾼다.
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

			System.out.printf("1~%d의 숫자를 입력하세요.(종료는 0)>", SIZE * SIZE);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2중 반복문 탈출
					} // end if
				} // end for h
			} // end for i
		} while (num != 0);
		System.out.println("종료 되었습니다.");
		sc.close();
	} // main

} // class
