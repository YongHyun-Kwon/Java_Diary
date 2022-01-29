package javastandard.swing.dialog;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJDialog extends JDialog {

	private JButton jbtnClose;

	public UseJDialog(UseJMenu ujm) {
		super(ujm, "자식창", true); // UseJMenu(윈도우) 클래스를 부모윈도우로한 Dialog생성

		jbtnClose = new JButton("닫기");
		JPanel jpSouth = new JPanel(); // BorderLayou에서 버튼을 고유 크기로 배치하기 위해 사용
		jpSouth.add(jbtnClose);

		add("South", jpSouth);

		// Event 등록 : setVisible전에 되어야한다.
		UseJDialogEvent ujde = new UseJDialogEvent(this);
		addWindowListener(ujde);
		jbtnClose.addActionListener(ujde);

		// setBounds(100, 100, 400, 300); //고정좌표로 부모윈도우와 관련없이 항상 정해진 위치에서 보여진다.
		setBounds(ujm.getX() + 100, ujm.getY() + 150, 400, 300);
		setVisible(true);

//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	} // UseJDialog

	public JButton getJbtnClose() {
		return jbtnClose;
	}

} // class
