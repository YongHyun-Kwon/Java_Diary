package javastandard.collection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet : ���� Ž�� Ʈ��(Binary Search Tree)��� �ڷᱸ���� ���·� �����͸� �����ϴ� Collection Class
 * ����, �˻�, �����˻��� ���� ������ ���̴� �ڷᱸ���̴�.
 * 
 * �ߺ��� �������� ������ ������� �ʰ� ���ĵ� ��ġ�� �����ϹǷ� ��������� ��ġ������ �ʴ´�.
 * 
 * ��ũ�帮��Ʈó�� ���� ���� ��尡 ���� ����� ������ �� ��忡 �ִ� 2���� ��带 �����Ҽ� �ְ� root��� �Ҹ��� �ϳ��� ��忡������
 * ������ ��� Ȯ���� �� �ִ�.
 * 
 * @author 82109
 */
public class UseTreeSet {

	public UseTreeSet() {
		
		Set<Integer> set = new TreeSet<Integer>();
		
		// 1 ~45 �� ���� ����
		for( int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		// ToString�� Override�޾ұ⿡ ��ü�� �ּҰ� �ƴ� ���� ǥ�� �ȴ�.
		System.out.println(set); 
	} // UseTreeSet

	public static void main(String[] args) {

		new UseTreeSet();

	} // main

} // class
