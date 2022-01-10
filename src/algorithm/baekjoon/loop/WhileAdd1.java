package algorithm.baekjoon.loop;

import java.util.Scanner;

public class WhileAdd1 {

	public static void main(String[] args) {

		/*
		 * ���� 10952�� ���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. 
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �Է��� ���������� 0 �� ���� ���´�.
		 * 
		 * ��� : �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(">");
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

	} // main

} // class
