package javastandard.swing;

import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 * JWindow를 상속받으면, 컴포ㅓㄴ트나 컨테이너 컴포넌트를 배치하여 보여주기 위해
 * JFrame이 필요하다.
 * @author user
 */
@SuppressWarnings("serial")
public class UseJWindow extends JWindow {

	public UseJWindow(JFrame jf) {
		super(jf);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		new UseJWindow(jf);
	} // main

} // class
