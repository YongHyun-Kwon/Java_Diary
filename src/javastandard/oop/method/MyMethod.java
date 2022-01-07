package javastandard.oop.usemethod;

import java.util.Scanner;

public class MyMethod {

	public char lastName() {
		return 'K';
	} // lastName

	public boolean judgment(int score) {

		if (score > -1 && score < 101) {
			return true;
		} else {
			return false;
		}
	} // judgment

	public char grade(int score) {
		char grade = ' ';
		if (score > -1 && score < 101) {
			if (score > 89) {
				grade = 'A';
			} else if (score > 79) {
				grade = 'B';
			} else if (score > 69) {
				grade = 'C';
			} else if (score > 59) {
				grade = 'D';
			} else {
				grade = 'F';
			}

		} else {
			grade = 'X';
			System.out.print("0~100������ �Է�");
		}
		return grade;
	} // grade
	
	public void printStar() {
		OverloadStart to = new OverloadStart();
		for(int i =0; i < 4;i ++) {
			for(int j= 0; j < i +1; j++) {
				if(i == 0 || i ==2) {
					to.printStar();
				} else {
					to.printStar(1);
				}
			}
			System.out.println();
		}
	}

	public void printGugudan() {
		int dan = 2;
		for (int num = 1; num < 10; num++) {
			System.out.printf("%d * %d = %d ", dan, num, dan * num);
		} // end for
		System.out.println();
	} // printGugudan

	/**
	 * �������� ����ϴ� method overloading<br>
	 * @param num
	 */
	public void printGugudan(int num) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d ", num, i, num * i);
		} // end for
		System.out.println();
	} // printGugudan

	public static void main(String[] args) {

		MyMethod hm = new MyMethod();
		// �����
		System.out.println(hm.lastName());
		
		System.out.println("--------------------");

		System.out.print("������ �Է��ϼ���. >");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();

		// 2, 3 �Է� �� ���� Ȯ��, ���� ��ȯ
		System.out.println("���� : " + hm.judgment(score));
		System.out.printf(" ������ %d, ������ %c\n", score, hm.grade(score));

		System.out.println("----------------");

		// 4. �� ���
		hm.printStar();

		System.out.println("\n----------------------------------------------------------------------------");

		// 5. ������ ���
		hm.printGugudan();
		hm.printGugudan(5);

	} // main

} // class
