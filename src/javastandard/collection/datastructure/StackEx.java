package javastandard.collection.datastructure;

import java.util.Stack;

/**
 * Stack : LiFO(Last in First out)
 * 
 * Input : 0, 1, 2 Output : 2, 1, 0
 * 
 * ���������� �����͸� �߰��ϰ� �����ϴ� Stack������ ArrayList�� ���� �迭����� Class �� �����ϴ�.
 * 
 * @author 82109
 */
public class StackEx {

	public StackEx() {
		
		Stack<String> st = new Stack<String>();
		
		// stack�� ���� �ִ� method push()
		st.push("0");
		st.push("1");
		st.push("2");
		
				
		System.out.println("--Data--");
		
		
		while(!st.empty()) {
			// stack�� ���� �������� method pop()
			System.out.println(st.pop()); // �� ������ ������ 2, 1, 0 ������ ���
		} // end while
		
	} // StackEx
	
	public static void main(String[] args) {
		
		new StackEx();

	} // main

} // class
