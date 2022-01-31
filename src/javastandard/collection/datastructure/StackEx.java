package javastandard.collection.datastructure;

import java.util.Stack;

/**
 * Stack : LiFO(Last in First out)
 * 
 * Input : 0, 1, 2 Output : 2, 1, 0
 * 
 * 순차적으로 데이터를 추가하고 삭제하는 Stack에서는 ArrayList와 같은 배열기반의 Class 가 적합하다.
 * 
 * @author 82109
 */
public class StackEx {

	public StackEx() {
		
		Stack<String> st = new Stack<String>();
		
		// stack의 값을 넣는 method push()
		st.push("0");
		st.push("1");
		st.push("2");
		
				
		System.out.println("--Data--");
		
		
		while(!st.empty()) {
			// stack의 값을 꺼내오는 method pop()
			System.out.println(st.pop()); // 들어간 순서의 역순인 2, 1, 0 순으로 출력
		} // end while
		
	} // StackEx
	
	public static void main(String[] args) {
		
		new StackEx();

	} // main

} // class
