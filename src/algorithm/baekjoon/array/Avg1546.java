package algorithm.baekjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class Avg1546 {
	
	/*
	 * ���� 1546
	 * ���� : �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
	 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� : ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����.
	 *  ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
	 *  
	 * ��� : ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
	 */

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		double score[] = new double [sc.nextInt()];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(score);
		double avg = 0;
		
		for(int i = 0 ; i<score.length;i++) {
			avg += ((score[i]/ score[score.length-1]) * 100);
		}
		
		System.out.printf("%f", avg / score.length);
		
		

	}

}
