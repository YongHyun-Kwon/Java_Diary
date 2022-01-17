package algorithm.baekjoon.math;

import java.util.Scanner;

public class Baekjoon2292 {

	public static void main(String[] args) {

		/*
		 * ���� 2292
		 * 
		 * ���� : ���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭
		 * 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� ��
		 * ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 13������ 3��, 58������ 5���� ������.
		 * 
		 * �Է� : ù° �ٿ� N(1 �� N �� 1,000,000,000)�� �־�����.
		 * 
		 * ��� : �Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int cnt = 1;
		int range = 2; // �ּҰ��� ����

		if (n == 1) {
			System.out.print(1);
		}

		else {
			while (range <= n) {
				range = range + (6 * cnt); // �氳���� 6���� �þ��.
				cnt++; // count 1 ����
			}
			System.out.print(cnt);
		}

	}

}
