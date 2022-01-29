package javastandard.swing.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//1 윈도우 컴포넌트 상속
public class NumberKeys extends JFrame {

	public NumberKeys() {
		super("Number Keys");
		// 2. 컴포넌트 생성.
		JButton jbt1 = new JButton("1");
		JButton jbt2 = new JButton("2");
		JButton jbt3 = new JButton("3");
		JButton jbt4 = new JButton("4");
		JButton jbt5 = new JButton("5");
		JButton jbt6 = new JButton("6");
		JButton jbt7 = new JButton("7");
		JButton jbt8 = new JButton("8");
		JButton jbt9 = new JButton("9");
		JButton jbt_1 = new JButton("*");
		JButton jbt0 = new JButton("0");
		JButton jbt_2 = new JButton("#");

		// 3. 컴포넌트 배치
		// 배치 관리자 적용
		setLayout(new GridLayout(4, 3));
		add(jbt1);
		add(jbt2);
		add(jbt3);

		add(jbt4);
		add(jbt5);
		add(jbt6);

		add(jbt7);
		add(jbt8);
		add(jbt9);

		add(jbt_1);
		add(jbt0);
		add(jbt_2);

		// 4. 윈도우 크기 설정
		setSize(300, 400);

		// 5. 가시화
		setVisible(true);

		// 6. 윈도우 종료 이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	} // NumberKeys

	public static void main(String[] args) {

		new NumberKeys();

	} // main

} // class
