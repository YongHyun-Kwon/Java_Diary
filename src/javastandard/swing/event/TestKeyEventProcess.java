package javastandard.swing.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a 관계로 TestKeyEventDesign class의 Event를 처리할 class.
 * 
 * @author user
 */
public class TestKeyEventProcess extends WindowAdapter implements KeyListener {

	TestKeyEventDesign tked;

	public TestKeyEventProcess(TestKeyEventDesign tked) {
		this.tked = tked;
	} // TestKeyEventProcess

	@Override
	public void windowClosing(WindowEvent ke) {
		tked.dispose();
	} // windowClosing

	@Override
	public void keyTyped(KeyEvent ke) {
//		System.out.println("keyTyped");
	} // keyTyped

	@Override
	public void keyPressed(KeyEvent ke) {
//		System.out.println("keyPressed");
	} // keyPressed

	@Override
	public void keyReleased(KeyEvent ke) {
//		System.out.println("keyReleased");
		// 눌린키의 키 값, 키 코드 얻기
		// 눌린키의 키코드 값을 디자인 클래스의 JLable에 출력
		tked.getJlblOutput().setText(String.valueOf(ke.getKeyCode()) + "/" + ke.getKeyChar());
		
		// 콘솔에 JTextFiled에 입력된 모든 문자열을 출력.
		System.out.println(tked.getJtfKey().getText());

		// ESC키가 눌러지면 프로그램을 종료.
		switch (ke.getKeyCode()) {
		case KeyEvent.VK_ESCAPE:
			tked.dispose();
		} // end switch
		
	} // keyReleased

} // class
