package algorithm.baekjoon.recursion;

import java.util.Scanner;

public class Hanoi {

	/*
	 * 백준 11729 문제 : 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로
	 * 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다. 이 작업을 수행하는데 필요한 이동 순서를
	 * 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
	 * 
	 * 입력 : 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.
	 * 
	 * 출력 : 첫째 줄에 옮긴 횟수 K를 출력한다.
	 * 
	 * 두 번째 줄부터 수행 과정을 출력한다. 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 이는 A번째
	 * 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		move(n, 1, 3, 2); // 3개의 원판을 1번타워에서 3번타워로 이동, 2번 타워는 Sub로 사용

		sc.close();

	}

	static void move(int n, int start, int end, int sub) {
		if (n == 1) {
			System.out.println(start + "->" + end);
			return;
		} // 1 일때의 코드

		move(n - 1, start, sub, end); // N-1개를 목표가아닌 Sub에 옮겨놔야 한다.
		move(1, start, end, sub); // move method가 끝나면 sub에는 원판이 쌓이고 3번은 비게 되어 큰원판을 옮긴다.
		move(n - 1, sub, end, start); // 아까 옮긴 원판을 sub -> end 타워로 옮긴다.

	}

}
