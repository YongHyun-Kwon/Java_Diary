package javastandard.loop;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// �����
		
		int star = 0;

		System.out.print("*�� ����� ������ ���� �Է����ּ���. >");

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
