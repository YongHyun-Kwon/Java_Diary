package javastandard.swing.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// 1. 윈도우 컴포넌트 상속
public class UseFlowLayout extends JFrame {

	public UseFlowLayout() {
		super("흐름레이아웃 연습");
		// 2. 컴포넌트 생성.
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);
		JCheckBox jcbSaveFlag = new JCheckBox("저장", true);
		JButton jbtnAdd = new JButton("입력");

		// 3. 컴포넌트 배치
		// Frame의 Layout을 BorderLayout => FlowLayout으로 변경.
		setLayout(new FlowLayout());
		
		add(jlblName); // 라벨배치
		add(jtfName); // 텍스트필드배치
		add(jcbSaveFlag); // 체크박스배치
		add(jbtnAdd); // 버튼배치
		// 4. 왼도우 크기 설정
		setSize(600, 300);
		// 5. 가시화
		setVisible(true);
		// 6. 왼도우 종료 이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // UseFlowLayout

	public static void main(String[] args) {

		new UseFlowLayout();

	} // main

} // class
