package algorithm.baekjoon.string;

import java.util.Scanner;

public class NumTotal {

	public static void main(String[] args) {
		
		/*
		 * ���� 11720
		 * 
		 * ���� : N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� : ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
		 * 
		 * ��� : �Է����� �־��� ���� N���� ���� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += s.charAt(i) - '0'; // ���ڿ� + ���ڿ��� ���ڿ� ������ int �̱� ������ 
			//�ڵ�����ȯ �Ǿ� ������ ����.
		} // end for
		System.out.println(sum);
		
		
	} // main
		

} // class
