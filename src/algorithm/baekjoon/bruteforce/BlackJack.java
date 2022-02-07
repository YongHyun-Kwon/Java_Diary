package algorithm.baekjoon.bruteforce;

import java.util.Scanner;

public class BlackJack {

	/*
	 * 백준 2798 : 블랙잭
	 * 
	 * 문제 : 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른
	 * 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다. N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에
	 * 최대한 가까운 카드 3장의 합을 구해 출력하시오.
	 * 
	 * 입력 : 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는
	 * 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
	 * 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
	 * 
	 * 출력 : 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = search(arr, n, m);
		System.out.println(result);

		sc.close();
	}

// 탐색
	static int search(int[] arr, int n, int m) {
		int result = 0;

		// 3개를 고르는 조건이기에 첫번쨰는 n-2
		for (int i = 0; i < n - 2; i++) {
			// 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만 순회
			for (int j = i + 1; j < n - 1; j++) {
				// 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
				for (int k = j + 1; k < n; k++) {
					int temp = arr[i] + arr[j] + arr[k];

					if (m == temp) {
						return temp;
					}

					if (result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}

		return result;
	}
}