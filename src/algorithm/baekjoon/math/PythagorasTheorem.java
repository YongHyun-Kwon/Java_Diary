package algorithm.baekjoon.math;

import java.util.Scanner;

/**
 * ��Ÿ����� ����
 * ���� �ﰢ������ ���� ������ ������ ������ ������ �� ���� ���� ������ �հ� ����.
 * a^2 + b^2 = c^2
 * 
 * @author 82109
 */
public class PythagorasTheorem {

	public static void main(String[] args) {
		/*
		 * ���� 1929
		 * 
		 * ���� : M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� : ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000) M�̻� N������ �Ҽ��� �ϳ� �̻� �ִ� �Է¸� �־�����.
		 * 
		 * ��� : �� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);

		while (true) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			if (x == 0 && y == 0 && z == 0)
				break;

			if ((x * x + y * y) == z * z) {
				System.out.println("right");
			} else if (x * x == (y * y + z * z)) {
				System.out.println("right");
			} else if (y * y == (x * x + z * z)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();

	}

}
