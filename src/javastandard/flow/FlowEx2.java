package javastandard.flow;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch �� ���� c����� switch�� �����ϴ�.
		// switch ���� ���� ����
		// switch ���� ���ǽ� ����� ������ ���ڿ��̿��� �Ѵ�.
		// case ���� ���� ���� ����� �����ϸ�, �ߺ����� ���ƾ� �Ѵ�.
		
		// switch���� ����Ҷ��� case�� ������ ���̴� ���� �߿��ϴ�.
		// FlowEx1�� if ������ switch ������ �����ϰԵǸ�
		int score =0;
		char grade = ' ';
		
		System.out.print("������ ������ �Է��ϼ���. >");
		
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.nextLine(); //
		//score = Integer.parseInt(tmp);
		
		score = sc.nextInt();
		sc.close();
		
		// int / int�� ����� int�� ��ȯ�ϱ⿡ 98�� �־ 9.8�� �ƴ� 9�� �����̵ȴ�.
		switch (score / 10) {
		case 10:
		case 9:
			grade ='A';
			// break���� ���ٸ� switch�� () ������ ���̸� ������ ������ ��� �����Ѵ�. 
			// ������ �������� �Ǵܰ� ���α׷��� ������ ���� break���� �����ϴ� ��쵵 �ִ�.
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
			// ������ ���ٸ� default ������ �̵��Ѵ� �̴� if�� else�� ������ ������ �Ѵ�
		default : 
			grade = 'F';
		}
		
		System.out.println("������ ����� " + grade + " �Դϴ�.");
		
		

	}

}
