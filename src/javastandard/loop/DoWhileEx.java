package javastandard.loop;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		// do-while은 기본적인 구조는 while과 같으나 do while은 최소 한번은 실행된다.

		int input = 0, answer = 0;
		
		answer = (int) (Math.random()* 100) + 1; // 1~100사이의 임시의 수를 저장
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1~100사이의 정수를 입력하세요. >");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은수로 시도하세요");
			} else if (input < answer) {
				System.out.println("더 큰수로 시도하세요");
			} 
		} while ( input != answer);
		System.out.println("정답 입니다.");
 	}

}
