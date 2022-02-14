package algorithm.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bulk {

	/*
	 * ���� 7568
	 * 
	 * ���� : N���� ���ܿ��� �� ����� ��ġ ����� �ڽź��� �� "ū ��ġ"�� ����� ���� ��������. ���� �ڽź��� �� ū ��ġ�� �����
	 * k���̶�� �� ����� ��ġ ����� k+1�� �ȴ�. �̷��� ����� �����ϸ� ���� ��ġ ����� ���� ����� ���� �� �����ϴ�. �л� N����
	 * �����Կ� Ű�� ��� �Է��� �о �� ����� ��ġ ����� ����Ͽ� ����ؾ� �Ѵ�.
	 * 
	 * �Է� : ù �ٿ��� ��ü ����� �� N�� �־�����. �׸��� �̾����� N���� �ٿ��� �� ����� �����Կ� Ű�� ��Ÿ���� ���� ���� x�� y��
	 * �ϳ��� ������ �ΰ� ���� ��Ÿ����.
	 * 
	 * ��� : �������� �Է¿� ������ ����� ��ġ ����� ���ؼ� �� ������� ù �ٿ� ����ؾ� �Ѵ�.
	 *  ��, �� ��ġ ����� ���鹮�ڷ� �и��Ǿ�� �Ѵ�.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arrBulk = new int[n][2];

		String[] arrSplit;

		for (int i = 0; i < n; i++) {
			arrSplit = br.readLine().split(" ");
			arrBulk[i][0] = Integer.parseInt(arrSplit[0]); // ����
			arrBulk[i][1] = Integer.parseInt(arrSplit[1]); // Ű
		} // end for

		int rank = 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (arrBulk[i][0] < arrBulk[j][0] && arrBulk[i][1] < arrBulk[j][1]) {
					rank++;
				} // end if
			} // end for j
		} // end for i
		System.out.println(rank + " ");
	} // main

} // class
