package algorithm.baekjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		/*
		 * ���� 10818
		 * ���� : N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� : ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
		 * ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
		 *  ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		 *  
		 * ��� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
		 */
		
		int count = 0;
		int[] arr;
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		arr = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[count-1]);
		
		
		
		

	}

}
