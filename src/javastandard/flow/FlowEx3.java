package javastandard.flow;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random()�� ����� ����, ����, �� ����
		System.out.print("����[1], ����[2], ��[3] �� �ϳ��� �Է��ϼ���. >");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1; // Math.random�� int�� doubleŸ������ ����ؾ��Ѵ�.
		sc.close();
		
		System.out.println("User�� ���ڴ� " + user + " �Դϴ�.");
		System.out.println("Com�� ���ڴ� " + com + " �Դϴ�.");
		
		
		// switch ���� ���� ����
		// switch ���� ���ǽ� ����� ������ ���ڿ��̿��� �Ѵ�.
		// case ���� ���� ���� ����� �����ϸ�, �ߺ����� ���ƾ� �Ѵ�.
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
