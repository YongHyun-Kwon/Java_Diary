package javastandard.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic�� ������� �ʰ� List���
 * 
 * @author user
 */
public class NotUseGeneric {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NotUseGeneric() {
		// 1. List ����
		List list = new ArrayList();
		// 2. ���� �Ҵ�
		list.add(2022);
		list.add(1);
		list.add(12.42);
		list.add("�ȳ��ϼ���?");
		// 3. �ϰ�ó��

		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i)); //��� �����Ͱ� ���´�. �����߻�.
			System.out.println(list.get(i)); // ��� �����Ͱ� ���´�. �����߻�.
		}

	} // NotUseGeneric

	public static void main(String[] args) {

		new NotUseGeneric();

		Integer ii = Integer.valueOf(10);
		int i = ii;
		System.out.println(i);

	} // main

} // class
