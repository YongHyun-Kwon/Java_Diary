package javastandard.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * 키와 값의 쌍으로 된 자료구조 - Map
 * 
 * @author user
 */
public class UseMap {

	/**
	 * Hashtable : 기본생성자를 사용해서 생성하면 11개의 행이 생성된다.
	 */
	public void useHashtable() {
		// 1. 생성
		Map<String, String> map = new Hashtable<String, String>();
		// 2. 값 할당
		map.put("A", "세심하다. 친절하다.");
		map.put("B", "성질 드럽다.");
		map.put("AB", "싸이코");
		map.put("O", "우유부단하다.");

		// 중복 값에 대한 동작, 키는 중복될 수 없고, 값은 중복된다.
		map.put("A", "소심하다."); // 키는 중복되지 않는다.
		map.put("a", "소심하다."); // 값은 중복될 수 있다.

		System.out.println(map);

		// 키가 존재하는지.
		System.out.println(map.containsKey("A"));

		// 값 얻기 : 키가 존재하면 값이 반환되고, 키가 없으면 null이 반환된다.
		System.out.println(map.get("a") + "/" + map.get("ab"));

		// 모든 키 얻기
		Set<String> keys = map.keySet();
		Iterator<String> ita = keys.iterator();
		// 모든 키를 출력
//		for(String val : keys) {
//			System.out.println(val);
//		}
		String value = null;
		while (ita.hasNext()) {
			value = ita.next();
			System.out.println(value + " " + map.get(value));
		} // end while

		System.out.println("행의 수 : " + map.size());
		System.out.println("map 행이 존재? " + map.isEmpty());
		map.remove("O");
		map.clear();

		System.out.println("행의 수 : " + map.size());
		System.out.println("map 행이 존재? " + map.isEmpty());

		System.out.println(map);

	} // useHashtable

	/**
	 * HashMap : 기본생성자를 사용해서 생성하면 16개의 행이 생성된다.
	 */
	public void useHashMap() {
		// 1. 생성
		Map<String, String> map = new HashMap<String, String>();
		// 2. 값 할당
		map.put("A", "세심하다. 친절하다.");
		map.put("B", "성질 드럽다.");
		map.put("AB", "싸이코");
		map.put("O", "우유부단하다.");

		// 중복 값에 대한 동작, 키는 중복될 수 없고, 값은 중복된다.
		map.put("A", "소심하다."); // 키는 중복되지 않는다.
		map.put("a", "소심하다."); // 값은 중복될 수 있다.

		System.out.println(map);

		// 키가 존재하는지.
		System.out.println(map.containsKey("A"));

		// 값 얻기 : 키가 존재하면 값이 반환되고, 키가 없으면 null이 반환된다.
		System.out.println(map.get("a") + "/" + map.get("ab"));

		// 모든 키 얻기
		Set<String> keys = map.keySet();
		Iterator<String> ita = keys.iterator();
		// 모든 키를 출력
//				for(String val : keys) {
//					System.out.println(val);
//				}
		String value = null;
		while (ita.hasNext()) {
			value = ita.next();
			System.out.println(value + " " + map.get(value));
		} // end while

		System.out.println("행의 수 : " + map.size());
		System.out.println("map 행이 존재? " + map.isEmpty());
		map.remove("O");
		map.clear();

		System.out.println("map 행이 존재? " + map.isEmpty());
		System.out.println("행의 수 : " + map.size());

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
