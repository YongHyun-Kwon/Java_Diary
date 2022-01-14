package algorithm.baekjoon.string;

import java.util.Scanner;

public class GroupWordCheck {

	public static void main(String[] args) {

		/*
		 * ���� 1316 �׷� �ܾ� üĿ
		 * 
		 * ����: �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb��
		 * c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b��
		 * �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
		 * 
		 * �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� : ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ��
		 * ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
		 * 
		 * ��� : ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.
		 */
		// �ʿ��� ���� �ܾ��Է¹��� ����
		// �׷�ܾ� ������ count
		// ���ڿ� ���� str
		//
		// �׷칮������ �ƴ���

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0; // �׷�ܾ� ����

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			boolean[] apb = new boolean[26]; // int �迭�̸� ���ڰ���� �ȵ�
			boolean checker = true;

			for (int j = 0; j < str.length(); j++) {
				int apbIndex = str.charAt(j) - 'a'; // �ҹ��ڸ� �������ĺ��̵� 'a'���� �ε����� �ȴ�.
				if (apb[apbIndex]) {
					if (str.charAt(j) != str.charAt(j - 1)) { // ������ ������
						checker = false; // �׷칮�ڰ� �ƴ�
						break;
					} // end if
				} else {
					apb[apbIndex] = true; // �ț��ٸ�
				} // end else
			} // end for j
			if (checker)
				cnt++;
		} // end for i
		System.out.println(cnt);
		sc.close();

	} // main

} // class
