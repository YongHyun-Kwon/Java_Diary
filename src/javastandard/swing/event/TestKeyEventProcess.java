package javastandard.swing.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a ����� TestKeyEventDesign class�� Event�� ó���� class.
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
		// ����Ű�� Ű ��, Ű �ڵ� ���
		// ����Ű�� Ű�ڵ� ���� ������ Ŭ������ JLable�� ���
		tked.getJlblOutput().setText(String.valueOf(ke.getKeyCode()) + "/" + ke.getKeyChar());
		
		// �ֿܼ� JTextFiled�� �Էµ� ��� ���ڿ��� ���.
		System.out.println(tked.getJtfKey().getText());

		// ESCŰ�� �������� ���α׷��� ����.
		switch (ke.getKeyCode()) {
		case KeyEvent.VK_ESCAPE:
			tked.dispose();
		} // end switch
		
	} // keyReleased

} // class
