package javastandard.lambda;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Test4 extends JFrame {

	private JButton jbtn;
	private Test4 t4;

	public Test4() {
		super("테스트");

		jbtn = new JButton("클릭");
		t4 = this;
		jbtn.addActionListener((ActionEvent e) -> {			
			switch(JOptionPane.showConfirmDialog(this, "종료?")){
			case JOptionPane.OK_OPTION:
				dispose();
			}
		});
		

		add("Center", jbtn);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test4();
	} // main

} // class
