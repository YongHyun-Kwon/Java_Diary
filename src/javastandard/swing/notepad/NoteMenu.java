package javastandard.swing.notepad;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class NoteMenu extends JFrame {
	
	// Font ���� �迭
	public static final String[] FONT = { "����", "���� ���", "�ü�ü", "Serif", "SansSerif" };
	public static final String[] STYLE = { "�Ϲ�", "����", "����Ӳ�", "��������Ӳ�" };
	public static final int[] STYLENO = { Font.PLAIN, Font.BOLD, Font.ITALIC, Font.BOLD | Font.ITALIC };
	public static final int[] SIZE = new int[38];
	
	// Event ó���� ���� Instance Variable ����
	private JMenuItem jmiNew, jmiClose, jmiFont;
	private JTextArea jta;
	private Font font;

	public NoteMenu() {

		super("�޸���");

		addSize();
		// SIZE �迭 �� Ȯ��
//		for (int i = 0; i < SIZE.length; i++) {
//			System.out.println(SIZE[i]);
//		}
		
		// MenuBar ����
		JMenuBar jmb = new JMenuBar();
		
		// MenuBar�� Item ����
		JMenu jmFile = new JMenu("����");
		JMenu jmTemplate = new JMenu("����");
		JMenu jmHelp = new JMenu("����");
		
		// jmFile Item
		jmiNew = new JMenuItem("����");
		JMenuItem jmiOpen = new JMenuItem("����");
		JMenuItem jmiSave = new JMenuItem("����");
		JMenuItem jmiDsave = new JMenuItem("�ٸ� �̸����� ����");
		jmiClose = new JMenuItem("�ݱ�");
		
		// jmTemplate Item
		jmiFont = new JMenuItem("�۲�");
		
		// jmHelp Item
		JMenuItem jmiHelp = new JMenuItem("�޸��� ����");
		
		// �� �ۼ� TextArea ����
		jta = new JTextArea();
		font = new Font(FONT[0], STYLENO[0], SIZE[0]);
		jta.setFont(font);
		jta.setLineWrap(true); // �ڵ� �ٹٲ� ����
		JScrollPane jsp = new JScrollPane(jta);
		
		// jmFile Menu�� Item ��ġ
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiDsave);
		jmFile.add(jmiClose);
		
		// jmTemplate Menu�� Item ��ġ
		jmTemplate.add(jmiFont);
		
		// jmHelp Menu�� Item ��ġ
		jmHelp.add(jmiHelp);
		
		// MenuBar�� Item ��ġ
		jmb.add(jmFile);
		jmb.add(jmTemplate);
		jmb.add(jmHelp);
		
		// MenuBar ��ġ
		setJMenuBar(jmb);
		
		// JTextArea ��ġ
		add(jsp);
		
		// Event ���
		NoteEvent noteEvent = new NoteEvent(this);
		jmiNew.addActionListener(noteEvent);
		jmiClose.addActionListener(noteEvent);
		jmiFont.addActionListener(noteEvent);

		// Window Size 
		setSize(600, 500);
		
		// ����ȭ
		setVisible(true);

	} // NoteMenu

	public JMenuItem getJmiNew() {
		return jmiNew;
	} //getJmiNew

	public JMenuItem getJmiClose() {
		return jmiClose;
	} // getJmiClose

	public JMenuItem getJmiFont() {
		return jmiFont;
	} // getJmiFont

	public JTextArea getJta() {
		return jta;
	} // getJta

	public Font getFont() {
		return font;
	} // getFont


	public void addSize() {
		for (int i = 0, j = 0; i < 38; i++, j++) {
			if (i < 3) {
				SIZE[i] = j + 8;
			} else {
				SIZE[i] = 8 + ++j;
			}
		}
	}

} // class
