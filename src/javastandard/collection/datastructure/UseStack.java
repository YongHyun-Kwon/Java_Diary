package javastandard.collection.datastructure;

import java.util.Stack;

/**
 * Stack의 활용 예 : 수식 계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹 브라우저의 앞, 뒤로
 * @author 82109
 */
public class UseStack {
	
	private static Stack<String> back = new Stack<String>();
	private static Stack<String> forward = new Stack<String>();
	
	public UseStack() {
	} // UseStack
	
	public static void printStatus() {
		System.out.println("back :" + back);
		System.out.println("forward :" + forward);
		System.out.println("현재 화면 '" + back.peek() + "'");
		System.out.println();
	} // printStatus
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	} // goURL
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	} // goForward
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	} // goBack

	public static void main(String[] args) {
		new UseStack();
		
		// 들어간 페이지 입력
		goURL("1. 구글");
		goURL("2. 네이버");
		goURL("3. 페이스북");
		goURL("4. 인스타그램");
		printStatus();
		
		// 뒤로가기
		goBack();
		printStatus();
		
		// 앞으로가기
		goForward();
		printStatus();
		
		// 찾는 링크로 가기
		goURL("구글");
		printStatus();
		
		
	} // main

} // class
