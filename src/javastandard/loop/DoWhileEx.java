package javastandard.loop;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		// do-while�� �⺻���� ������ while�� ������ do while�� �ּ� �ѹ��� ����ȴ�.

		int input = 0, answer = 0;
		
		answer = (int) (Math.random()* 100) + 1; // 1~100������ �ӽ��� ���� ����
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1~100������ ������ �Է��ϼ���. >");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("�� �������� �õ��ϼ���");
			} else if (input < answer) {
				System.out.println("�� ū���� �õ��ϼ���");
			} 
		} while ( input != answer);
		System.out.println("���� �Դϴ�.");
 	}

}
