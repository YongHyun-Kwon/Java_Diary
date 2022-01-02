package javastandard.flow;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random()을 사용한 가위, 바위, 보 게임
		System.out.print("가위[1], 바위[2], 보[3] 중 하나를 입력하세요. >");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1; // Math.random은 int나 double타입으로 사용해야한다.
		sc.close();
		
		System.out.println("User의 숫자는 " + user + " 입니다.");
		System.out.println("Com의 숫자는 " + com + " 입니다.");
		
		
		// switch 문의 제약 조건
		// switch 문의 조건식 결과는 정수나 문자열이여야 한다.
		// case 문의 값은 정수 상수만 가능하며, 중복되지 말아야 한다.
		switch(user - com) {
		case 2: case -1:
			System.out.println("User Lose!");
			break;
		case 1: case -2:
			System.out.println("User win!");
			break;
		case 0:
			System.out.println("Draw!");
		}
		
	}

}
