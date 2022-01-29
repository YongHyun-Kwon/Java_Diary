package javastandard.swing.layout;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UseGridLayout extends JFrame {

	public UseGridLayout() {
		super("그리드레이아웃 연습");

		// 2. 컴포넌트 생성.
		JLabel jlblHobby = new JLabel("취미");
		JLabel jlblGender = new JLabel("성별");

		JCheckBox jcbHobby1 = new JCheckBox("책 읽기");
		JCheckBox jcbHobby2 = new JCheckBox("농구");
		
		//ButtonGroup을 생성해야 RadioButton이 하나만 선택된다.
		JRadioButton jrbM = new JRadioButton("남자");
		JRadioButton jrbF = new JRadioButton("여자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbM); //ButtonGroup과 JRadioButton으느 has a 관계
		bg.add(jrbF);
		
		
		// 3. 컴포넌트 배치
		//배치 관리자 적용
		setLayout(new GridLayout(2,2));
		add(jlblHobby);
		add(jcbHobby1);
		add(jcbHobby2);
		
		add(jlblGender);
		add(jrbM);
		add(jrbF);
		// 4. 윈도우 크기 설정.
		setSize(300, 200);
		// 5. 가시화
		setVisible(true);
		// 6. 윈도우 종료 이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	} // UseGridLayout

	public static void main(String[] args) {

		new UseGridLayout();

	} // main

} // class
