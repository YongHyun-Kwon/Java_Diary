package javastandard.swing.event;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterInnerClass extends JFrame {

	public TestAdapterInnerClass() {
		super("Inner class�� ����� �̺�Ʈ ó�����");

		// Inner class ��üȭ
		// TestAdapterInnerClass.InnerEvt ie = this.new InnerEvt(); // �׻� this�� new�ڿ�
		// �����ִ�.
		// Event ���
		// addWindowListener(ie); // has a ����

		addWindowListener(new InnerEvt());

		setSize(400, 300);
		setVisible(true);

	} // TestAdaperInnerClass

	////////////////////////////// inner class ����////////////////////////////
	// �ѹ� �̻� �����Ҷ��� Class�� �����Ѵ�. ����� �ѹ��� �����ϱ⿡ ���� ���� �ʿ���� anonymous class�� ó���� �� �ִ�.
	public class InnerEvt extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {

			dispose(); // Window class�� ���� method <- ����Ŭ������ �ٱ�Ŭ������ �ڿ��� ������� ����� �� �ִ�.

		} // windowClosing

	} // class

	////////////////////////////// inner class ��//////////////////////////////

	public static void main(String[] args) {

		new TestAdapterInnerClass();

	} // main

} // class
