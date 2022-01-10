package algorithm.baekjoon.loop;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		/* 백준 1110
		 * 문제 : 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
		 * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면
		 *  새로운 수를 만들 수 있다.
		 *  
		 *  입력 : 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
		 *  
		 *  출력 : 첫째 줄에 N의 사이클 길이를 출력한다.
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
