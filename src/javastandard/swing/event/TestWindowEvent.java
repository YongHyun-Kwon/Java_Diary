package javastandard.swing.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestWindowEvent extends JFrame implements WindowListener {

	public TestWindowEvent() {

		super("윈도우 이벤트 연습");

		// 이벤트 등록
		addWindowListener(this);
		setSize(300, 400);
		setVisible(true);

	} // TestWindowEvent

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
//		dispose(); // 윈도우 작업이 종료되고
		System.exit(0); // 0. 정상종료 - JVM의 종료프로세스를 수행하고 종료,
		// 1. 비정상 종료 - JVM의 종료프로세스를 중단하고 종료
	}

	@Override
	public void windowClosed(WindowEvent e) { // 종료완료된 후 호출
		System.out.println("windowClosed");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

	public static void main(String[] args) {

		new TestWindowEvent();

	} // main

} // class
