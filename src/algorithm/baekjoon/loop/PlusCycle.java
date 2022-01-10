package algorithm.baekjoon.loop;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		/* ���� 1110
		 * ���� : ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�.
		 * �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸�
		 *  ���ο� ���� ���� �� �ִ�.
		 *  
		 *  �Է� : ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.
		 *  
		 *  ��� : ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		int startNum = n;
		
		
		while (true) {
			int left = startNum / 10;
			int right = startNum % 10;
			startNum = right * 10 + (left + right) % 10;
			cnt++;
			if(startNum == n) {
				break;
				
			}
		}
		System.out.println(cnt);

	}

}
