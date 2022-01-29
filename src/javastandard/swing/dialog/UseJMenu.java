package javastandard.swing.dialog;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseJMenu extends JFrame {

	// 3. MenuItem ����
	private JMenuItem jmiNew, jmiDialog, jmiClose, jmiHelp; // Event�� �߻����� �� ���ϰų� �����ٰ� ���� ����

	public UseJMenu() {
		super("�޴�����.");
		// 1. �޴��ٸ� ����.
		JMenuBar jmb = new JMenuBar();
		// 2. �޴� ����
		JMenu jm = new JMenu("�޴�1");
		JMenu jm2 = new JMenu("�޴�2");
		// �޴������� ����
		jmiNew = new JMenuItem("�޴�������");
		jmiDialog = new JMenuItem("���̾�α�");
		jmiClose = new JMenuItem("�ݱ�");
		jmiHelp = new JMenuItem("����");

		// 4. Menu Item�� Menu�� ��ġ
		jm.add(jmiNew);
		jm.add(jmiDialog);
		jm.addSeparator();
		jm.add(jmiClose);

		jm2.add(jmiHelp);

		// 5. Menu�� Menu Bar�� ��ġ
		jmb.add(jm);
		jmb.add(jm2);

		// 6. Menu Bar�� Frame�� ��ġ
		setJMenuBar(jmb);

		// �޴������� �̺�Ʈ ���
		// has a
		UseJMenuEvent ujme = new UseJMenuEvent(this);
		jmiDialog.addActionListener(ujme);
		jmiClose.addActionListener(ujme);

		setSize(800, 600);
		setVisible(true);

	} // UseJMenu

	public JMenuItem getJmiDialog() {
		return jmiDialog;
	} // getJmiDialog

	public JMenuItem getJmiClose() {
		return jmiClose;
	} // getJmiClose

	public static void main(String[] args) {

		new UseJMenu();

	} // main

} // class
