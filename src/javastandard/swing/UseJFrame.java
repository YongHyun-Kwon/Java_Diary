package javastandard.swing;

import javax.swing.JFrame;

/**
 * JFrame�� ��� ������ Window ���� �����Ǿ� ª�� �ڵ�� ����ڿ��� Application�� ������ �� �ִ�.
 * @author user
 */
@SuppressWarnings("serial")
public class UseJFrame extends JFrame {

	public UseJFrame() {
		setSize(800, 200);
		setVisible(true); // ȭ���� �����ְڴ� true �Ⱥ����ְڴ� false

	}

	public static void main(String[] args) {
		new UseJFrame();

	} // main

} // class
