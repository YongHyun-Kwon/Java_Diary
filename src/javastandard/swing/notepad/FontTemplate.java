package javastandard.swing.notepad;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FontTemplate extends JDialog {
	
	// Event 처리를 위한 Instance Variable 설정
	private JTextField jtfFont, jtfStyle, jtfSize;

	private DefaultListModel<String> dlmFont, dlmStyle;
	private DefaultListModel<Integer> dlmSize;

	private JList<String> listFont, listStyle;
	private JList<Integer> listSize;

	private JLabel jlblPreview;
	
	private JButton jbtnConfirm, jbtnCancle;

	private String previewFont;
	private int previewStyle, previewSize;

	public FontTemplate(NoteMenu notemenu) {

		super(notemenu, "글꼴", true);
		
	
		// JLabel 설정
		JLabel jlblFont = new JLabel("글꼴");
		JLabel jlblStyle = new JLabel("글꼴 스타일");
		JLabel jlblSize = new JLabel("크기");

		// JTextField 설정
		jtfFont = new JTextField(notemenu.getFont().getFontName());
		jtfStyle = new JTextField(NoteMenu.STYLE[notemenu.getFont().getStyle()]);
		jtfSize = new JTextField(String.valueOf(notemenu.getFont().getSize()));
		
		// 미리보기 Font 설정
		previewFont = NoteMenu.FONT[0];
		previewStyle = NoteMenu.STYLENO[0];
		previewSize = NoteMenu.SIZE[0];
		
		// JList 설정
		dlmFont = new DefaultListModel<String>();
		for (int i = 0; i < NoteMenu.FONT.length; i++) {
			dlmFont.addElement(NoteMenu.FONT[i]);
		} // end for
		listFont = new JList<String>(dlmFont);
		
		dlmStyle = new DefaultListModel<String>();
		for (int i = 0; i < NoteMenu.STYLE.length; i++) {
			dlmStyle.addElement(NoteMenu.STYLE[i]);
		} // end for
		listStyle = new JList<String>(dlmStyle);
		
		dlmSize = new DefaultListModel<Integer>();
		for (int i = 0; i < NoteMenu.SIZE.length; i++) {
			dlmSize.addElement(NoteMenu.SIZE[i]);
		} // end for
		listSize = new JList<Integer>(dlmSize);

		// JScrollPane을 설정해 Scroll Bar 설정
		JScrollPane jspListSize = new JScrollPane(listSize);
		
		// 글꼴 변경 확인 취소 설정.
		jbtnConfirm = new JButton("확인");
		jbtnCancle = new JButton("취소");

		// Preview JLabel 설정
		JLabel jlblSee = new JLabel("보기");
		jlblPreview = new JLabel("AaBbYyZz");
		Font previewFt = new Font(previewFont, previewStyle, previewSize);
		jlblPreview.setFont(previewFt);
		
		// Event 등록
		FontTemplateEvent ftEvt = new FontTemplateEvent(notemenu, this);
		listFont.addListSelectionListener(ftEvt);
		listStyle.addListSelectionListener(ftEvt);
		listSize.addListSelectionListener(ftEvt);

		jbtnConfirm.addActionListener(ftEvt);
		jbtnCancle.addActionListener(ftEvt);

		// Layout 설정
		setLayout(null);
		setResizable(false);

		// Component 위치 설정 및 배치
		jlblFont.setLocation(20, 20);
		jlblFont.setSize(50, 50);
		jtfFont.setLocation(20, 60);
		jtfFont.setSize(120, 20);

		jlblStyle.setLocation(150, 20);
		jlblStyle.setSize(100, 50);
		jtfStyle.setLocation(150, 60);
		jtfStyle.setSize(120, 20);

		jlblSize.setLocation(300, 20);
		jlblSize.setSize(50, 50);
		jtfSize.setLocation(300, 60);
		jtfSize.setSize(70, 20);

		jlblSee.setLocation(200, 170);
		jlblSee.setSize(50, 50);
		jlblPreview.setLocation(200, 180);
		jlblPreview.setSize(150, 100);

		listFont.setBounds(20, 80, 120, 100);
		listStyle.setBounds(150, 80, 120, 100);
		jspListSize.setBounds(300, 80, 70, 100);

		jbtnConfirm.setLocation(100, 270);
		jbtnConfirm.setSize(60, 20);
		jbtnCancle.setLocation(200, 270);
		jbtnCancle.setSize(60, 20);

		add(jlblFont);
		add(jlblStyle);
		add(jlblSize);
		add(jlblSee);
		add(jlblPreview);

		add(jtfFont);
		add(jtfStyle);
		add(jtfSize);

		add(listFont);
		add(listStyle);
		add(jspListSize);

		add(jbtnConfirm);
		add(jbtnCancle);

		setBounds(notemenu.getX() + 70, notemenu.getY() + 70, 400, 350);
		setVisible(true);

	}

	public DefaultListModel<String> getDlmFont() {
		return dlmFont;
	} // DefaultListModel

	public DefaultListModel<String> getDlmStyle() {
		return dlmStyle;
	} // DefaultListModel

	public DefaultListModel<Integer> getDlmSize() {
		return dlmSize;
	} // DefaultListModel

	public JButton getJbtnConfirm() {
		return jbtnConfirm;
	} // getJbtnConfirm

	public JButton getJbtnCancle() {
		return jbtnCancle;
	} // getJbtnCancle

	public JList<String> getListFont() {
		return listFont;
	} // getListFont

	public JList<String> getListStyle() {
		return listStyle;
	} // getListStyle

	public JList<Integer> getListSize() {
		return listSize;
	} // getListSize

	public JLabel getJlblPreview() {
		return jlblPreview;
	} // getJlblPreview

	public JTextField getJtfFont() {
		return jtfFont;
	} // getJtfFont

	public JTextField getJtfStyle() {
		return jtfStyle;
	} // getJtfStyle

	public JTextField getJtfSize() {
		return jtfSize;
	} // getJtfSize

	public String getPreviewFont() {
		return previewFont;
	} // getPreviewFont

	public int getPreviewStyle() {
		return previewStyle;
	} // getPreviewStyle

	public int getPreviewSize() {
		return previewSize;
	} // getPreviewSize

}
