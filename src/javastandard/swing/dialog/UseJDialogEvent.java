package javastandard.swing.dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * 다이얼로그의 이벤트 처리
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
		// 종료작업때 일을 더 할 수 있다.
		switch (JOptionPane.showConfirmDialog(ujd, "정말 종료 하시겠습니까?")) {
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
