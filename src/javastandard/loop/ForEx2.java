package javastandard.loop;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// 별찍기
		
		int star = 0;

		System.out.print("*을 출력할 라인의 수를 입력해주세요. >");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		star = Integer.parseInt(tmp);
		sc.close();

		for (int i = 0; i < star; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print('*');
			}
			System.out.println();
		}

	}

}
