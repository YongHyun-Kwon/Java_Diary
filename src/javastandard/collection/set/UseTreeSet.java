package javastandard.collection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet : 이진 탐색 트리(Binary Search Tree)라는 자료구조의 형태로 데이터를 저장하는 Collection Class
 * 정렬, 검색, 범위검색에 높은 성능을 보이는 자료구조이다.
 * 
 * 중복된 데이터의 저장을 허용하지 않고 정렬된 위치에 저장하므로 저장순서를 유치하지도 않는다.
 * 
 * 링크드리스트처럼 여러 개의 노드가 서로 연결된 구조로 각 노드에 최대 2개의 노드를 연결할수 있고 root라고 불리는 하나의 노드에서부터
 * 시작해 계속 확장할 수 있다.
 * 
 * @author 82109
 */
public class UseTreeSet {

	public UseTreeSet() {
		
		Set<Integer> set = new TreeSet<Integer>();
		
		// 1 ~45 의 값을 설정
		for( int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		// ToString을 Override받았기에 객체의 주소가 아닌 값이 표기 된다.
		System.out.println(set); 
	} // UseTreeSet

	public static void main(String[] args) {

		new UseTreeSet();

	} // main

} // class
