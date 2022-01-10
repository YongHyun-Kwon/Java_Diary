package algorithm.baekjoon.loop;

import java.util.Scanner;

public class WhileAdd2 {

	public static void main(String[] args) {
		/*
		 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며,
		 * 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 출력 : 각 테스트 케이스마다 A+B를 출력한다.
		 * 조건 : 읽을 수 있는 데이터(EOF)가 없을 때 종료
		 */

		Scanner sc = new Scanner(System.in);
		
		
			while (sc.hasNextInt()) {

				int a = sc.nextInt();
				int b = sc.nextInt();

				if (a > 0 && b < 10) {
					System.out.println(a + b);
				} else {
					System.out.println("0 < A, B < 10만 입력 가능");
				}

				if (a == 0 && b == 0) {
					System.out.println("exit");
				sc.close();
				break;
				}

			}
			sc.close();

	} // main

} // class
