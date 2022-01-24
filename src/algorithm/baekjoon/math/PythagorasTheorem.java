package algorithm.baekjoon.math;

import java.util.Scanner;

/**
 * 피타고라스의 정리
 * 직각 삼각형에서 빗변 길이의 제곱은 빗변을 제외한 두 변의 각각 제곱의 합과 같다.
 * a^2 + b^2 = c^2
 * 
 * @author 82109
 */
public class PythagorasTheorem {

	public static void main(String[] args) {
		/*
		 * 백준 1929
		 * 
		 * 문제 : M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
		 * 
		 * 출력 : 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
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
