package javastandard.swing.dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a 관계 이벤트 처리
 * 
 * @author user
 */
public class UseJMenuEvent extends WindowAdapter implements ActionListener {

	private UseJMenu ujm;

	public UseJMenuEvent(UseJMenu ujm) { // has a 관계
		this.ujm = ujm;
	} // UseJMenuEvent

	@Override
	public void windowClosing(WindowEvent we) {
		ujm.dispose();
	} // windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == ujm.getJmiDialog()) {
			new UseJDialog(ujm);
		} // end if

		if (ae.getSource() == ujm.getJmiClose()) {
			ujm.dispose();
		} // end if

	} // actionPerformed

}
