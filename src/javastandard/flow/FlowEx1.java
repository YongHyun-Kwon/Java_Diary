package javastandard.flow;

import java.util.Scanner;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if else if else�� c ������ ������ �����̴�.
		// if()�� ������ Ž���Ͽ� ���̸� �Ʒ��� ����� �����ϰ� �����̸� else�� ����� �����Ѵ�.
		
		// ������ �Է��ϸ� ����� ��ȯ�Ѵ�.
		
		int score = 0;
		char grade = ' ', opt = ' ';
		
		System.out.printf("������ �Է��ϼ���. >");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		sc.close();
		
		// if�� 
		
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
		
		System.out.printf("�Է��Ͻ� ������ %c%c �Դϴ�.", grade, opt );
		

	}

}
