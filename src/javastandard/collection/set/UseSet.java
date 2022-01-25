package javastandard.collection.set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/**
 * �˻��� ����� ����, �ߺ����� �������� �ʴ� �ڷᱸ��. �Է°��� ���������� ���� �ʴ´�.
 * 
 * @author user
 */
public class UseSet {

	public UseSet() {
		// 1. ����
		Set<String> set = new HashSet<String>();
		// 2. �� �Ҵ� - �Է°��� ���������� ���� �ʴ´�.
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML");
		set.add("CSS");
		set.add("JavaScript");
		// �ߺ� �� - �ԷµǴ� ���� ������ ���� ���� ������ �Էµ��� �ʴ´�.
		set.add("HTML");
		set.add("HTML");
		set.add("Java");

		// 3. ũ��
		System.out.println(set.size());

		// 4. �迭�� ����
		// �� �迭 ����
		String[] arr = new String[set.size()];
		// ����
		set.toArray(arr);

		// �˻� - ��� ����.
//		set.get(0); // Error
		// �˻� ���� : Iterator
		// 1.Set��ü�� ������� �޴´�.
		Iterator<String> ita = set.iterator();
		// 2. Iterator�� ���ؼ� Set�� ��Ұ� �����ϴ��� �˻��� �� ��
		String value = " ";
		while (ita.hasNext()) {
			value = ita.next();
			System.out.println(value);
		}
		// 3. ��Ұ� �����Ѵٸ� ���� ���, �����͸� �������� �̵���Ų��.

		// ����.
		set.remove("JDBC"); // Ư�� element�� ���� ������ �� �ִ�.
		set.clear(); // ��� ���� �� ������ ���ִ�.
		System.out.println(set.isEmpty());

		System.out.println(set);
		System.out.println("----------------����� ��------------------");

		for (String val : arr) {
			System.out.println(val);
		}

	} // UseSet

	/**
	 * Set�� �ߺ��� ���� ����
	 */
	public void dupVal() {
		// 1. ����
		Set<TestVO> set = new HashSet<TestVO>();
		// 2. �� �Ҵ� - > set�� 1�������� ������ ���� �ߺ� ���� �������� �ʴ´�.
		set.add(new TestVO("�ǿ���", 25));//new�� ������ ��ü�� �ּҰ� �ٸ��Ƿ�
		set.add(new TestVO("���ֺ�", 25));
		set.add(new TestVO("�̱Կ�", 25));
		set.add(new TestVO("�̱Կ�", 25)); // ������ ���� ���� �������� �Էµȴ�.
		
		TestVO tv = new TestVO("������", 26);
		set.add(tv); // �ϳ��� �ּҰ�
		set.add(tv); // ������ �ԷµǸ� �߰����� �ʴ´�.

		System.out.println(set);
	} // dupVal

	public static void main(String[] args) {

		UseSet us = new UseSet();
		System.out.println("------------�ߺ����� ó��-----------------");
		us.dupVal();

	} // main

} // class
