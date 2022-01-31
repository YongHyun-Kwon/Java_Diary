package javastandard.collection.datastructure;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Queue Interface의 구현체 중 하나로 저장한 순 저장한 순서에 관계없이 우선순위가 높은 것 부터 꺼낸다.
 * 
 * null은 저장이 불가능하다.
 * 
 * PriorityQueue는 저장공간으로 배열을 사용하고 heap이라는 자료구조에 저장한다.
 * JVM의 heap과는 다른 것이다.
 * @author 82109
 */
public class UsePriorityQueue {
	
	public UsePriorityQueue() {
		
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(3); // pq.offer(new Integer(3)) // auto boxing
		pq.offer(1);
		pq.offer(5);
		pq.offer(4);
		pq.offer(2);
		
		System.out.println(pq);
		
		Object obj = null;
		
		// PriorityQueue에 저장된 요소를 하나씩 출력.
		while((obj = pq.poll()) != null) {
			System.out.println(obj);
		}
 		
	} // UsePriorityQueue

	public static void main(String[] args) {
		
		new UsePriorityQueue();
		
	} // main

} // class
