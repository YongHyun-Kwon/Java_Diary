package algorithm.baekjoon.flow;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// beakjoon 2884 �� �˶� �ð�
		
		// �˶������� 45�� �ռ��� �ð����� ��ȯ�ϱ�
		
		System.out.print("�˶��� ���� �ÿ� ���� �Է����ּ���. >");
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
		System.out.println("�˶��� ���� �Ͻ� �ð��� " + hour + "�� " + minute + "�� �Դϴ�." );
		
		if (minute < 45 ) {
			hour--;
			minute = 60 - (45 - minute);
			if(hour < 0) {
				hour = 23;
			}
			System.out.println("�˶��ð��� 45���� �ռ� " + hour + "�� " + minute + "�� ���� �����Ǿ����ϴ�."  );
		} else {
			System.out.println("�˶��ð��� 45���� �ռ� " + hour + "�� " + (minute - 45) + "�� ���� �����Ǿ����ϴ�."  );
		}
		
		

	}

}
