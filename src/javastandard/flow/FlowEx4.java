package javastandard.flow;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch�� if ó�� ��ø�� �����ϴ�.

		// �ֹι�ȣ�� �Է��ϸ� ���ڿ� ���������� �����ϰ� 2000�� ���� �Ŀ� ���� �����Ѵ�.
		System.out.print("������ �ֹι�ȣ�� ������ ��İ� �����ϰ� �Է����ּ���.[xxxxxx-xxxxxxx]>");

		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		sc.close();

		char gender = regNo.charAt(7); // charAt�� �Է¹��� ���ڿ� �� () ���� ���ڸ� ������ �������ش�.

		switch (gender) {
		case '1':
		case '3':
			switch (gender) {
			case '1':
				System.out.println("���ϴ� 2000�� ������ ����� ���� �Դϴ�.");
				break;
			case '3':
				System.out.println("���ϴ� 2000�� ���Ŀ� ����� ���� �Դϴ�.");
				break;
			}
			break; // ��ø ���� switch���� break�� ������ �ʵ��� ��������!
		case '2':
		case '4':
			switch (gender) {
			case '2':
				System.out.println("���ϴ� 2000�� ������ ����� ���� �Դϴ�.");
				break;
			case '4':
				System.out.println("���ϴ� 2000�� ���Ŀ� ����� ���� �Դϴ�.");
				break;
			}
			break;

		default:
			System.out.println("�ֹι�ȣ�� �ٽ� �Է����ּ���.");

		}
	}
}
