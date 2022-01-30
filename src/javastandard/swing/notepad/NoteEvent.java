package javastandard.swing.notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class NoteEvent extends WindowAdapter implements ActionListener {

	// Has A 관계
	NoteMenu notemenu;
	
//	private String memo;
	
	public NoteEvent(NoteMenu notemenu) {
		this.notemenu = notemenu;
	} // NoteEvent
	
	@Override
	public void windowClosing(WindowEvent we) {
		notemenu.dispose();
	} // windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == notemenu.getJmiClose()) {
			notemenu.dispose();
		} // end if
		if (ae.getSource() == notemenu.getJmiNew()) {
		
			resetText();
		} // end if
		if (ae.getSource() == notemenu.getJmiFont()) {
			new FontTemplate(notemenu);
		} // end if

	} // actionPerformed
	
	// JTextArea 초기화 Method
	public void resetText() {
		notemenu.getJta().setText(" ");
	} // resetText

} // class
