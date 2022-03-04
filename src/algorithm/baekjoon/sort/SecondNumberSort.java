package algorithm.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 백준 2751 : 수정렬하기 2
 * 
 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는
 * 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 
 * 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 * 풀이 : Collections.sort()를 사용 Collection.sort()는 Tim sort이다 Tim sort의 경우
 * 합명, 삽입 정렬 알고리즘을 사용한다. 이 두가지가 섞여 있는 알고리즘을 hybrid sorting algorithm
 * 이라고 하며 합병정렬은 최선 최악 모두 O(nlogn)을 보장, 삽입 정렬은 최선O(n), 최악의 경우는 O(n2)이다.
 * 
 * 합병정렬의 최악의 경우 삽입정렬의 최선의 경우를 합친 알고리즘이 Tim sort라는 것
 * 시간 복잡도 O(n) ~ O(nlogn) 을 보장하며 배열이 아닌 List의 자료구조를 사용하여 정렬하면 쉽게 구현 사용가능하다.
 */
public class SecondNumberSort {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		} // end for

		Collections.sort(list);

		for (int value : list) {
			sb.append(value).append("\n");
		} // end for

		System.out.println(sb);

	} // main

} // class
