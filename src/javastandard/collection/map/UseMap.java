package javastandard.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Ű�� ���� ������ �� �ڷᱸ�� - Map
 * 
 * @author user
 */
public class UseMap {

	/**
	 * Hashtable : �⺻�����ڸ� ����ؼ� �����ϸ� 11���� ���� �����ȴ�.
	 */
	public void useHashtable() {
		// 1. ����
		Map<String, String> map = new Hashtable<String, String>();
		// 2. �� �Ҵ�
		map.put("A", "�����ϴ�. ģ���ϴ�.");
		map.put("B", "���� �巴��.");
		map.put("AB", "������");
		map.put("O", "�����δ��ϴ�.");

		// �ߺ� ���� ���� ����, Ű�� �ߺ��� �� ����, ���� �ߺ��ȴ�.
		map.put("A", "�ҽ��ϴ�."); // Ű�� �ߺ����� �ʴ´�.
		map.put("a", "�ҽ��ϴ�."); // ���� �ߺ��� �� �ִ�.

		System.out.println(map);

		// Ű�� �����ϴ���.
		System.out.println(map.containsKey("A"));

		// �� ��� : Ű�� �����ϸ� ���� ��ȯ�ǰ�, Ű�� ������ null�� ��ȯ�ȴ�.
		System.out.println(map.get("a") + "/" + map.get("ab"));

		// ��� Ű ���
		Set<String> keys = map.keySet();
		Iterator<String> ita = keys.iterator();
		// ��� Ű�� ���
//		for(String val : keys) {
//			System.out.println(val);
//		}
		String value = null;
		while (ita.hasNext()) {
			value = ita.next();
			System.out.println(value + " " + map.get(value));
		} // end while

		System.out.println("���� �� : " + map.size());
		System.out.println("map ���� ����? " + map.isEmpty());
		map.remove("O");
		map.clear();

		System.out.println("���� �� : " + map.size());
		System.out.println("map ���� ����? " + map.isEmpty());

		System.out.println(map);

	} // useHashtable

	/**
	 * HashMap : �⺻�����ڸ� ����ؼ� �����ϸ� 16���� ���� �����ȴ�.
	 */
	public void useHashMap() {
		// 1. ����
		Map<String, String> map = new HashMap<String, String>();
		// 2. �� �Ҵ�
		map.put("A", "�����ϴ�. ģ���ϴ�.");
		map.put("B", "���� �巴��.");
		map.put("AB", "������");
		map.put("O", "�����δ��ϴ�.");

		// �ߺ� ���� ���� ����, Ű�� �ߺ��� �� ����, ���� �ߺ��ȴ�.
		map.put("A", "�ҽ��ϴ�."); // Ű�� �ߺ����� �ʴ´�.
		map.put("a", "�ҽ��ϴ�."); // ���� �ߺ��� �� �ִ�.

		System.out.println(map);

		// Ű�� �����ϴ���.
		System.out.println(map.containsKey("A"));

		// �� ��� : Ű�� �����ϸ� ���� ��ȯ�ǰ�, Ű�� ������ null�� ��ȯ�ȴ�.
		System.out.println(map.get("a") + "/" + map.get("ab"));

		// ��� Ű ���
		Set<String> keys = map.keySet();
		Iterator<String> ita = keys.iterator();
		// ��� Ű�� ���
//				for(String val : keys) {
//					System.out.println(val);
//				}
		String value = null;
		while (ita.hasNext()) {
			value = ita.next();
			System.out.println(value + " " + map.get(value));
		} // end while

		System.out.println("���� �� : " + map.size());
		System.out.println("map ���� ����? " + map.isEmpty());
		map.remove("O");
		map.clear();

		System.out.println("map ���� ����? " + map.isEmpty());
		System.out.println("���� �� : " + map.size());

		System.out.println(map);

	} // useHashMap

	public static void main(String[] args) {

		UseMap um = new UseMap();
		System.out.println("--------------Hashtable---------------");
		um.useHashtable();
		System.out.println("--------------HashtMap----------------");
		um.useHashMap();

	} // main

} // class
