package algorithm.baekjoon.loop;

import java.util.Scanner;

public class WhileAdd2 {

	public static void main(String[] args) {
		/*
		 * ���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������,
		 * �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * ��� : �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 * ���� : ���� �� �ִ� ������(EOF)�� ���� �� ����
		 */

		Scanner sc = new Scanner(System.in);
		
		
			while (sc.hasNextInt()) {

				int a = sc.nextInt();
				int b = sc.nextInt();

				if (a > 0 && b < 10) {
					System.out.println(a + b);
				} else {
					System.out.println("0 < A, B < 10�� �Է� ����");
				}

				if (a == 0 && b == 0) {
					System.out.println("exit");
				sc.close();
				break;
				}

			}
			sc.close();

	} // main

} // class
