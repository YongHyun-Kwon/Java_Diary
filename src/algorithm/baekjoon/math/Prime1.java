package algorithm.baekjoon.math;

import java.util.Scanner;

/**
 * 소수 : 1과 그수 자신 이외의 자연수로는 나눌 수 없는 1보다 큰 자연수
 * 
 * @author 82109
 */
public class Prime1 {
	/*
	 * 백준 1978
	 * 
	 * 문제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	 * 
	 * 입력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
	 * 
	 * 출력 : 주어진 수들 중 소수의 개수를 출력한다.
	 */

	public static boolean getPrime(int prime) {
		if (prime < 2) { // 0과 1은 소수가 아님
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
		int prime = 0; // 입력받을 소수를 담을 변수
		int cnt = 0; // 소수의 갯수를 세기 위한 변수
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
