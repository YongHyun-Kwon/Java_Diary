package javastandard.swing.event;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Design class�� �޾�(has a) Design class�� Event�� ó���ϴ� class
 * 
 * @author user
 */
public class TestAdapterHasA extends WindowAdapter {
	private TestDesign td; // ���� ��ü�� �� Ŭ������ ��� instance �������� ����ϱ� ����

	public TestAdapterHasA(TestDesign td) { // has a
		this.td = td;
	} // TestAdapterHasA

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�ܺ�Ŭ�������� ������ ���� �̺�Ʈ ó��");
//		dispose();// TestAdapterHasA Ŭ������ ��� �ٿ��� �� ����� �������� �ʴ´�.
		td.dispose();
	} // windowClosing

} // class
