package javastandard.loop;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {

		// while�� ������ ���ε����� ������ ����Ǹ� ������ ������ �ɶ����� {} ���� �ݺ��Ѵ�.
		// for ���� while���� ����� ����ϴ� �ٸ� �ʱ�ȭ�� �������� �ִ� ���״� for���� ���� ���� ����.
		
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�����Ϸ��� 0�� ��������)");

		while (flag) {
			System.out.print(">>");

			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num;
			} else {
				flag = false;
			}
		} // while end

		System.out.println("�հ� : " + sum);
		sc.close();
	}

}
