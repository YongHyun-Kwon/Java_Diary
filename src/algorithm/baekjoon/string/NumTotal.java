package algorithm.baekjoon.string;

import java.util.Scanner;

public class NumTotal {

	public static void main(String[] args) {
		
		/*
		 * 백준 11720
		 * 
		 * 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 * 
		 * 출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += s.charAt(i) - '0'; // 문자열 + 문자열은 문자열 변수가 int 이기 떄문에 
			//자동형변환 되어 정수로 들어간다.
		} // end for
		System.out.println(sum);
		
		
	} // main
		

} // class
