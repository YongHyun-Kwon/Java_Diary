package javastandard.swing.event;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestDesign extends JFrame {
	
	public TestDesign() {
		super("�ܺ�Ŭ�������� �̺�Ʈ ó��");
				
		// has a ����� �̺�Ʈ�� ����.
		TestAdapterHasA taha = new TestAdapterHasA(this);
		// Design class���� �߻� �� Event�� has a ������ Ŭ�������� ó���ϵ��� ���.
		addWindowListener(taha);
		
		setSize(400, 400);
		setVisible(true);
	} // TestDesign

	public static void main(String[] args) {
		
		new TestDesign();

	} // main

} // class
