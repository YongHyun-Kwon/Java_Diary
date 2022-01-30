package javastandard.swing.notepad;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FontTemplateEvent extends WindowAdapter implements ActionListener, ListSelectionListener {

	// Has A ���� Instance Variable ����
	NoteMenu nm;
	FontTemplate ft;

	// JList ���ý� preview ������ ���� ���� ����
	private String font;
	private int style, size;

	public FontTemplateEvent(NoteMenu nm, FontTemplate ft) {
		this.nm = nm;
		this.ft = ft;

		font = ft.getPreviewFont();
		style = ft.getPreviewStyle();
		size = ft.getPreviewSize();
	} // FontTemplateEvent

	// ListSelection Event�� �ι� ����Ǿ� 1���������� �����ϱ� ���� ����
	private boolean flag;

	@Override
	public void valueChanged(ListSelectionEvent le) {
		
		// JList Item�� ���� �ɶ� �ǽð� ������ ���� Event
		
		if (flag) {
			if (le.getSource() == ft.getListFont()) {
				ft.getJtfFont().setText(ft.getDlmFont().get(ft.getListFont().getSelectedIndex()));
				this.font = NoteMenu.FONT[ft.getListFont().getSelectedIndex()];
				ft.getJlblPreview().setFont(new Font(font, style, size));
			} // end if
			if (le.getSource() == ft.getListStyle()) {
				ft.getJtfStyle().setText(ft.getDlmStyle().get(ft.getListStyle().getSelectedIndex()));
				this.style = NoteMenu.STYLENO[ft.getListStyle().getSelectedIndex()];
				ft.getJlblPreview().setFont(new Font(font, style, size));
			} // end if
			if (le.getSource() == ft.getListSize()) {
				ft.getJtfSize().setText(String.valueOf(ft.getDlmSize().get(ft.getListSize().getSelectedIndex())));
				this.size = NoteMenu.SIZE[ft.getListSize().getSelectedIndex()];
				ft.getJlblPreview().setFont(new Font(font, style, size));
			} // end if

		} // end if
		flag = !flag;
	} // valueChanged

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// Ȯ�� ��ư�� ������ NoteMenu�� JTextArea�� Font���� ����
		if(ae.getSource() == ft.getJbtnConfirm()) {
			nm.getJta().setFont(new Font(font,style,size));
			ft.dispose();
		} // end if
		
		// ��ҽ� Dialog ����
		if(ae.getSource() == ft.getJbtnCancle()) {
			ft.dispose();
		} // end if

	} // actionPerformed

	@Override
	public void windowClosing(WindowEvent we) {
		ft.dispose();
	} // windowClosing

} // class
