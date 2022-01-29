package javastandard.swing.dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * ���̾�α��� �̺�Ʈ ó��
 * 
 * @author user
 */
public class UseJDialogEvent extends WindowAdapter implements ActionListener {
	private UseJDialog ujd;

	public UseJDialogEvent(UseJDialog ujd) {
		this.ujd = ujd;
	} // UseJDialogEvent

	@Override
	public void windowClosing(WindowEvent we) {
		// �����۾��� ���� �� �� �� �ִ�.
		switch (JOptionPane.showConfirmDialog(ujd, "���� ���� �Ͻðڽ��ϱ�?")) {
		case JOptionPane.OK_OPTION:
			ujd.dispose();
			break;
		}
	} // windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		ujd.dispose();
	} // actionPerformed

} // class
