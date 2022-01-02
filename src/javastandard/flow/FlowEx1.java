package javastandard.flow;

import java.util.Scanner;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if else if else는 c 언어에서와 동일한 개념이다.
		// if()의 조건을 탐색하여 참이면 아래의 결과를 실행하고 거짓이면 else의 결과를 실행한다.
		
		// 학점을 입력하면 등급을 반환한다.
		
		int score = 0;
		char grade = ' ', opt = ' ';
		
		System.out.printf("점수를 입력하세요. >");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		sc.close();
		
		// if는 
		
		if (score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		} else if(score >= 70) {
			grade = 'C';
			if(score >= 78) {
				opt = '+';
			} else if(score < 74) {
				opt = '-';
			}
		} else if(score >=60) {
			grade = 'D';
			if(score >= 68) {
				opt = '+';
			} else if (score < 64) {
				opt = '-';
			}
		} else {
			grade = 'F';
		}
		
		System.out.printf("입력하신 학점은 %c%c 입니다.", grade, opt );
		

	}

}
