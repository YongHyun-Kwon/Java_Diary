package javastandard.collection.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue : FiFo(First in First out)
 * 
 * 
 * input : 0, 1, 2 Output : 0, 1, 2
 * 
 * 큐는 Data를 꺼낼때 항상 첫 번째 저장된 데이터를 삭제하므로 ArrayList와 같은 class를 사용하면
 * 데이터를 꺼낼 때마다 빈공간을 채우기 위해 데이터의 복사가 발생하므로 비효율적
 * 따라서 데이터의 추가/삭제가 쉬운 LinkedList로 구현하는 것이 더 적합하다.
 * @author 82109
 */
public class QueueEx {

	public QueueEx() {

		Queue<String> q = new LinkedList<String>(); // Queue의 Interface 구현체인 LinkedList를 사용한다.
		
		// 값을 추가하는 method offer();
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("--Data--");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		} // end while
		
	} // QuequeEx

	public static void main(String[] args) {
			
		new QueueEx();
		
	} // main

} // class
