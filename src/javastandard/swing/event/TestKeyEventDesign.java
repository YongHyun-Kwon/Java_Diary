package javastandard.swing.event;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// 1. 윈도우 컴포넌트 상속
public class TestKeyEventDesign extends JFrame {
	// 2. 이벤트 처리에 사용되는 Component 선언
	private JTextField jtfKey;
	private JLabel jlblOutput;

	public TestKeyEventDesign() {
		super("키보드 이벤트");

		jtfKey = new JTextField();
		jlblOutput = new JLabel("출력 :");

		Font font = new Font("맑은 고딕", Font.BOLD, 20);
		jtfKey.setFont(font);
		jlblOutput.setFont(font);
		
		setLayout(new GridLayout(2,1));
		
		add(jtfKey);
		add(jlblOutput);
		
		// Event를 등록
		TestKeyEventProcess tkep = new TestKeyEventProcess(this);
		jtfKey.addKeyListener(tkep); // JTextFiled를 이벤트 등록
		addWindowListener(tkep); // JFrame을 이벤트에 등록
		
		setBounds(100, 100, 300, 150);
		setVisible(true);
		
	} // TestKeyEventDesign
	
	

	public JLabel getJlblOutput() {
		return jlblOutput;
	} // getJlblOutput
	
	


	public JTextField getJtfKey() {
		return jtfKey;
	} // getJtfKey






	public static void main(String[] args) {
		new TestKeyEventDesign();
	} // main

} // class
