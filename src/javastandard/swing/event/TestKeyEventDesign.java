package javastandard.swing.event;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// 1. ������ ������Ʈ ���
public class TestKeyEventDesign extends JFrame {
	// 2. �̺�Ʈ ó���� ���Ǵ� Component ����
	private JTextField jtfKey;
	private JLabel jlblOutput;

	public TestKeyEventDesign() {
		super("Ű���� �̺�Ʈ");

		jtfKey = new JTextField();
		jlblOutput = new JLabel("��� :");

		Font font = new Font("���� ���", Font.BOLD, 20);
		jtfKey.setFont(font);
		jlblOutput.setFont(font);
		
		setLayout(new GridLayout(2,1));
		
		add(jtfKey);
		add(jlblOutput);
		
		// Event�� ���
		TestKeyEventProcess tkep = new TestKeyEventProcess(this);
		jtfKey.addKeyListener(tkep); // JTextFiled�� �̺�Ʈ ���
		addWindowListener(tkep); // JFrame�� �̺�Ʈ�� ���
		
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
