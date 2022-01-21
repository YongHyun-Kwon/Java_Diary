package javastandard.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic을 사용하지 않고 List사용
 * 
 * @author user
 */
public class NotUseGeneric {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NotUseGeneric() {
		// 1. List 생성
		List list = new ArrayList();
		// 2. 값을 할당
		list.add(2022);
		list.add(1);
		list.add(12.42);
		list.add("안녕하세요?");
		// 3. 일괄처리

		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i)); //모든 데이터가 나온다. 문제발생.
			System.out.println(list.get(i)); // 모든 데이터가 나온다. 문제발생.
		}

	} // NotUseGeneric

	public static void main(String[] args) {

		new NotUseGeneric();

		Integer ii = Integer.valueOf(10);
		int i = ii;
		System.out.println(i);

	} // main

} // class
