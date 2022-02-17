package algorithm.baekjoon.bruteforce;

import java.util.Scanner;

public class MovieDirector {
	
	public static int getMovieName(int n) {
		int num = 666;
		int cnt = 1;
		
		while( cnt != n) {
			num++;
			if(String.valueOf(num).contains("666")) {
				cnt++;
			} // end if
		} // end while
		return num;
	} // getMovieName

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println(getMovieName(n));

	} // main

} // class
