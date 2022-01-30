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
	
	// Font 설정 배열
	public static final String[] FONT = { "돋움", "맑은 고딕", "궁서체", "Serif", "SansSerif" };
	public static final String[] STYLE = { "일반", "굵게", "기울임꼴", "굵은기울임꼴" };
	public static final int[] STYLENO = { Font.PLAIN, Font.BOLD, Font.ITALIC, Font.BOLD | Font.ITALIC };
	public static final int[] SIZE = new int[38];
	
	// Event 처리를 위해 Instance Variable 설정
	private JMenuItem jmiNew, jmiClose, jmiFont;
	private JTextArea jta;
	private Font font;

	public NoteMenu() {

		super("메모장");

		addSize();
		// SIZE 배열 값 확인
//		for (int i = 0; i < SIZE.length; i++) {
//			System.out.println(SIZE[i]);
//		}
		
		// MenuBar 생성
		JMenuBar jmb = new JMenuBar();
		
		// MenuBar의 Item 생성
		JMenu jmFile = new JMenu("파일");
		JMenu jmTemplate = new JMenu("서식");
		JMenu jmHelp = new JMenu("도움말");
		
		// jmFile Item
		jmiNew = new JMenuItem("새글");
		JMenuItem jmiOpen = new JMenuItem("열기");
		JMenuItem jmiSave = new JMenuItem("저장");
		JMenuItem jmiDsave = new JMenuItem("다른 이름으로 저장");
		jmiClose = new JMenuItem("닫기");
		
		// jmTemplate Item
		jmiFont = new JMenuItem("글꼴");
		
		// jmHelp Item
		JMenuItem jmiHelp = new JMenuItem("메모장 정보");
		
		// 글 작성 TextArea 생성
		jta = new JTextArea();
		font = new Font(FONT[0], STYLENO[0], SIZE[0]);
		jta.setFont(font);
		jta.setLineWrap(true); // 자동 줄바꿈 설정
		JScrollPane jsp = new JScrollPane(jta);
		
		// jmFile Menu에 Item 배치
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiDsave);
		jmFile.add(jmiClose);
		
		// jmTemplate Menu에 Item 배치
		jmTemplate.add(jmiFont);
		
		// jmHelp Menu에 Item 배치
		jmHelp.add(jmiHelp);
		
		// MenuBar에 Item 배치
		jmb.add(jmFile);
		jmb.add(jmTemplate);
		jmb.add(jmHelp);
		
		// MenuBar 배치
		setJMenuBar(jmb);
		
		// JTextArea 배치
		add(jsp);
		
		// Event 등록
		NoteEvent noteEvent = new NoteEvent(this);
		jmiNew.addActionListener(noteEvent);
		jmiClose.addActionListener(noteEvent);
		jmiFont.addActionListener(noteEvent);

		// Window Size 
		setSize(600, 500);
		
		// 가시화
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
