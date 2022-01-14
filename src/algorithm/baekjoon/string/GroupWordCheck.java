package algorithm.baekjoon.string;

import java.util.Scanner;

public class GroupWordCheck {

	public static void main(String[] args) {

		/*
		 * 백준 1316 그룹 단어 체커
		 * 
		 * 문제: 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는
		 * c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가
		 * 떨어져서 나타나기 때문에 그룹 단어가 아니다.
		 * 
		 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는
		 * 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
		 * 
		 * 출력 : 첫째 줄에 그룹 단어의 개수를 출력한다.
		 */
		// 필요한 변수 단어입력받을 숫자
		// 그룹단어 개산할 count
		// 문자열 받을 str
		//
		// 그룹문자인지 아닌지

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0; // 그룹단어 갯수

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			boolean[] apb = new boolean[26]; // int 배열이면 숫자계산이 안됨
			boolean checker = true;

			for (int j = 0; j < str.length(); j++) {
				int apbIndex = str.charAt(j) - 'a'; // 소문자면 무슨알파벳이든 'a'빼면 인덱스가 된다.
				if (apb[apbIndex]) {
					if (str.charAt(j) != str.charAt(j - 1)) { // 이전에 썻으면
						checker = false; // 그룹문자가 아님
						break;
					} // end if
				} else {
					apb[apbIndex] = true; // 안썻다면
				} // end else
			} // end for j
			if (checker)
				cnt++;
		} // end for i
		System.out.println(cnt);
		sc.close();

	} // main

} // class
