package javastandard.swing.dialog;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJDialog extends JDialog {

	private JButton jbtnClose;

	public UseJDialog(UseJMenu ujm) {
		super(ujm, "�ڽ�â", true); // UseJMenu(������) Ŭ������ �θ���������� Dialog����

		jbtnClose = new JButton("�ݱ�");
		JPanel jpSouth = new JPanel(); // BorderLayou���� ��ư�� ���� ũ��� ��ġ�ϱ� ���� ���
		jpSouth.add(jbtnClose);

		add("South", jpSouth);

		// Event ��� : setVisible���� �Ǿ���Ѵ�.
		UseJDialogEvent ujde = new UseJDialogEvent(this);
		addWindowListener(ujde);
		jbtnClose.addActionListener(ujde);

		// setBounds(100, 100, 400, 300); //������ǥ�� �θ�������� ���þ��� �׻� ������ ��ġ���� ��������.
		setBounds(ujm.getX() + 100, ujm.getY() + 150, 400, 300);
		setVisible(true);

//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	} // UseJDialog

	public JButton getJbtnClose() {
		return jbtnClose;
	}

} // class