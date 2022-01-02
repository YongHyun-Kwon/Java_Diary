package javastandard.flow;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch도 if 처럼 중첩이 가능하다.

		// 주민번호를 입력하면 남자와 여자인지를 구분하고 2000년 전과 후에 따라서 구분한다.
		System.out.print("귀하의 주민번호를 다음의 양식과 동일하게 입력해주세요.[xxxxxx-xxxxxxx]>");

		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		sc.close();

		char gender = regNo.charAt(7); // charAt은 입력받은 문자열 중 () 값의 문자를 변수에 저장해준다.

		switch (gender) {
		case '1':
		case '3':
			switch (gender) {
			case '1':
				System.out.println("귀하는 2000년 이전에 출생한 남성 입니다.");
				break;
			case '3':
				System.out.println("귀하는 2000년 이후에 출생한 남성 입니다.");
				break;
			}
			break; // 중첩 밖의 switch문의 break를 빼먹지 않도록 주의하자!
		case '2':
		case '4':
			switch (gender) {
			case '2':
				System.out.println("귀하는 2000년 이전에 출생한 여성 입니다.");
				break;
			case '4':
				System.out.println("귀하는 2000년 이후에 출생한 여성 입니다.");
				break;
			}
			break;

		default:
			System.out.println("주민번호를 다시 입력해주세요.");

		}
	}
}
