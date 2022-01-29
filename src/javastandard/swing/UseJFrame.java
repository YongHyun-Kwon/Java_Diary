package javastandard.swing;

import javax.swing.JFrame;

/**
 * JFrame을 상속 받으면 Window 부터 생성되어 짧은 코드로 사용자에게 Application을 제공할 수 있다.
 * @author user
 */
@SuppressWarnings("serial")
public class UseJFrame extends JFrame {

	public UseJFrame() {
		setSize(800, 200);
		setVisible(true); // 화면을 보여주겠다 true 안보여주겠다 false

	}

	public static void main(String[] args) {
		new UseJFrame();

	} // main

} // class
