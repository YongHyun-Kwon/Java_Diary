package javastandard.loop;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {

		// while은 조건이 참인동안은 무한이 실행되며 조건이 거짓이 될때까지 {} 안을 반복한다.
		// for 문과 while문의 기능은 비슷하다 다만 초기화나 증감식이 있는 경우네는 for문을 쓰는 것이 좋다.
		
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("합계를 구할 숫자를 입력하세요.(종료하려면 0을 누르세요)");

		while (flag) {
			System.out.print(">>");

			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num;
			} else {
				flag = false;
			}
		} // while end

		System.out.println("합계 : " + sum);
		sc.close();
	}

}
