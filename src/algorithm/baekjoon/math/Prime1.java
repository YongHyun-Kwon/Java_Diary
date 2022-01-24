package algorithm.baekjoon.math;

import java.util.Scanner;

/**
 * �Ҽ� : 1�� �׼� �ڽ� �̿��� �ڿ����δ� ���� �� ���� 1���� ū �ڿ���
 * 
 * @author 82109
 */
public class Prime1 {
	/*
	 * ���� 1978
	 * 
	 * ���� : �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� : ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
	 * 
	 * ��� : �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
	 */

	public static boolean getPrime(int prime) {
		if (prime < 2) { // 0�� 1�� �Ҽ��� �ƴ�
			return false;
		} // getPrime

		for (int i = 2; i * i <= prime; i++) {
			if (prime % i == 0) {
				return false;
			} // end if
		} // end for
		return true;
	} // getPrime

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int prime = 0; // �Է¹��� �Ҽ��� ���� ����
		int cnt = 0; // �Ҽ��� ������ ���� ���� ����
		for (int i = 0; i < n; i++) {
			prime = sc.nextInt();
			if (getPrime(prime)) {
				cnt++;
			} // end if
		} // end for
		System.out.println(cnt);
		sc.close();

	} // main

} // class
