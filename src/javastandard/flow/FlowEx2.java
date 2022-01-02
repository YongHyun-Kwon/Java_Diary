package javastandard.flow;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch 문 또한 c언어의 switch와 동일하다.
		// switch 문의 제약 조건
		// switch 문의 조건식 결과는 정수나 문자열이여야 한다.
		// case 문의 값은 정수 상수만 가능하며, 중복되지 말아야 한다.
		
		// switch문을 사용할때는 case의 갯수를 줄이는 것이 중요하다.
		// FlowEx1의 if 조건을 switch 문으로 변경하게되면
		int score =0;
		char grade = ' ';
		
		System.out.print("귀하의 점수를 입력하세요. >");
		
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.nextLine(); //
		//score = Integer.parseInt(tmp);
		
		score = sc.nextInt();
		sc.close();
		
		// int / int의 결과는 int로 반환하기에 98을 넣어도 9.8이 아닌 9로 연산이된다.
		switch (score / 10) {
		case 10:
		case 9:
			grade ='A';
			// break문이 없다면 switch의 () 조건이 참이면 이후의 조건을 계속 수행한다. 
			// 하지만 개발자의 판단과 프로그램의 로직에 따라 break문을 생략하는 경우도 있다.
			break; 
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
			// 조건이 없다면 default 문으로 이동한다 이는 if의 else와 동일한 역할을 한다
		default : 
			grade = 'F';
		}
		
		System.out.println("귀하의 등급은 " + grade + " 입니다.");
		
		

	}

}
