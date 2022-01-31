package javastandard.collection.datastructure;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Queue Interface�� ����ü �� �ϳ��� ������ �� ������ ������ ������� �켱������ ���� �� ���� ������.
 * 
 * null�� ������ �Ұ����ϴ�.
 * 
 * PriorityQueue�� ����������� �迭�� ����ϰ� heap�̶�� �ڷᱸ���� �����Ѵ�.
 * JVM�� heap���� �ٸ� ���̴�.
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
		
		// PriorityQueue�� ����� ��Ҹ� �ϳ��� ���.
		while((obj = pq.poll()) != null) {
			System.out.println(obj);
		}
 		
	} // UsePriorityQueue

	public static void main(String[] args) {
		
		new UsePriorityQueue();
		
	} // main

} // class
