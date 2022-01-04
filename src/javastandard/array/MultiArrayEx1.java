package javastandard.array;

import java.util.Scanner;

/**
 * ������ �迭 <br>
 * ���� ���ϸ� [��][��] �̴�. <br>
 * ������ [1][A] �̱⵵ �ϴ�. <br>
 */
public class MultiArrayEx1 {

	public static void main(String[] args) {
		
		String[][] words = {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"coffe", "Ŀ��"},
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length;i++) {
			System.out.printf("Q%d. %s �� ����? >", i, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�. \n\n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s �����ϴ�. \n\n", words[i][1]);
			}
		} // end for
		sc.close();
	} // main
} // class