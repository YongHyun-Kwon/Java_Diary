package javastandard.swing.event;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterInnerClass extends JFrame {

	public TestAdapterInnerClass() {
		super("Inner class를 사용한 이벤트 처리방법");

		// Inner class 객체화
		// TestAdapterInnerClass.InnerEvt ie = this.new InnerEvt(); // 항상 this가 new뒤에
		// 숨어있다.
		// Event 등록
		// addWindowListener(ie); // has a 관계

		addWindowListener(new InnerEvt());

		setSize(400, 300);
		setVisible(true);

	} // TestAdaperInnerClass

	////////////////////////////// inner class 시작////////////////////////////
	// 한번 이상 실행할때만 Class를 생성한다. 종료는 한번만 실행하기에 따로 만들 필요없이 anonymous class로 처리할 수 있다.
	public class InnerEvt extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {

			dispose(); // Window class의 종료 method <- 안쪽클래스는 바깥클래스의 자원을 마음대로 사용할 수 있다.

		} // windowClosing

	} // class

	////////////////////////////// inner class 끝//////////////////////////////

	public static void main(String[] args) {

		new TestAdapterInnerClass();

	} // main

} // class
