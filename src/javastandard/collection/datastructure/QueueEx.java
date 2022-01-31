package javastandard.collection.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue : FiFo(First in First out)
 * 
 * 
 * input : 0, 1, 2 Output : 0, 1, 2
 * 
 * ť�� Data�� ������ �׻� ù ��° ����� �����͸� �����ϹǷ� ArrayList�� ���� class�� ����ϸ�
 * �����͸� ���� ������ ������� ä��� ���� �������� ���簡 �߻��ϹǷ� ��ȿ����
 * ���� �������� �߰�/������ ���� LinkedList�� �����ϴ� ���� �� �����ϴ�.
 * @author 82109
 */
public class QueueEx {

	public QueueEx() {

		Queue<String> q = new LinkedList<String>(); // Queue�� Interface ����ü�� LinkedList�� ����Ѵ�.
		
		// ���� �߰��ϴ� method offer();
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
