package algorithm.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * ���� 10814 : ���̼� ����
 * 
 * ���� : �¶��� ������ ������ ������� ���̿� �̸��� ������ ������� �־�����. �̶�, ȸ������ ���̰� �����ϴ� ������, ���̰� ������ ���� ������ ����� �տ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : ù° �ٿ� �¶��� ���� ȸ���� �� N�� �־�����. (1 �� N �� 100,000)

��° �ٺ��� N���� �ٿ��� �� ȸ���� ���̿� �̸��� �������� ���еǾ� �־�����. ���̴� 1���� ũ�ų� ������, 200���� �۰ų� ���� �����̰�, �̸��� ���ĺ� ��ҹ��ڷ� �̷���� �ְ�, ���̰� 100���� �۰ų� ���� ���ڿ��̴�. �Է��� ������ ������ �־�����.

��� : ù° �ٺ��� �� N���� �ٿ� ���� �¶��� ���� ȸ���� ���� ��, ���̰� ������ ������ ������ �� �ٿ� �� �� ���̿� �̸��� �������� ������ ����Ѵ�.
 *
 */
public class AgeOrder {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());

		User[] u = new User[n];

		StringTokenizer st = null;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			u[i] = new User(age, name);
		} // end for

		Arrays.sort(u, new Comparator<User>() {

			@Override
			public int compare(User u1, User u2) {
				return u1.age - u2.age;
			} // compare

		});
		
		for(int i = 0; i < n; i++) {
			sb.append(u[i]);
		} // end for
		
		System.out.println(sb);

	}

	public static class User {
		int age;
		String name;

		public User(int age, String name) {
			this.age = age;
			this.name = name;
		} // User

		@Override
		public String toString() {
			return "User [age=" + age + ", name=" + name + "]" + "\n";
		}

	} // User

}
