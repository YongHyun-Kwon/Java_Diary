package javastandard.swing.dialog;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseJMenu extends JFrame {

	// 3. MenuItem 선언
	private JMenuItem jmiNew, jmiDialog, jmiClose, jmiHelp; // Event가 발생했을 시 비교하거나 가져다가 쓰기 위해

	public UseJMenu() {
		super("메뉴연습.");
		// 1. 메뉴바를 생성.
		JMenuBar jmb = new JMenuBar();
		// 2. 메뉴 생성
		JMenu jm = new JMenu("메뉴1");
		JMenu jm2 = new JMenu("메뉴2");
		// 메뉴아이템 생성
		jmiNew = new JMenuItem("메뉴아이템");
		jmiDialog = new JMenuItem("다이얼로그");
		jmiClose = new JMenuItem("닫기");
		jmiHelp = new JMenuItem("도움말");

		// 4. Menu Item을 Menu에 배치
		jm.add(jmiNew);
		jm.add(jmiDialog);
		jm.addSeparator();
		jm.add(jmiClose);

		jm2.add(jmiHelp);

		// 5. Menu를 Menu Bar에 배치
		jmb.add(jm);
		jmb.add(jm2);

		// 6. Menu Bar를 Frame에 배치
		setJMenuBar(jmb);

		// 메뉴아이템 이벤트 등록
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
