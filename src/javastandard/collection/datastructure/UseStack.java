package javastandard.collection.datastructure;

import java.util.Stack;

/**
 * Stack�� Ȱ�� �� : ���� ���, ���İ�ȣ�˻�, �������μ����� undo/redo, �� �������� ��, �ڷ�
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
		System.out.println("���� ȭ�� '" + back.peek() + "'");
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
		
		// �� ������ �Է�
		goURL("1. ����");
		goURL("2. ���̹�");
		goURL("3. ���̽���");
		goURL("4. �ν�Ÿ�׷�");
		printStatus();
		
		// �ڷΰ���
		goBack();
		printStatus();
		
		// �����ΰ���
		goForward();
		printStatus();
		
		// ã�� ��ũ�� ����
		goURL("����");
		printStatus();
		
		
	} // main

} // class
