package kr.co.project_1.sist;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")

public class ButtonView extends JFrame {
	private JButton jbtnView, jbtnReport;

	// LoginView의 값을 받기 위해 생성자에 매개변수 선언
	public ButtonView(LoginView lv) {

		JLabel jlblInfo = new JLabel("Log File");
		jbtnView = new JButton("view");
		jbtnReport = new JButton("report");

		// 배경색 설정
		getContentPane().setBackground(Color.white);

		// 배치
		add(jlblInfo);
		add(jbtnView);
		add(jbtnReport);

		// 소개 라벨 폰트 설정
		jlblInfo.setFont(new Font("Freestyle Script", Font.BOLD, 40));

		// 위치 크기 설정
		jlblInfo.setBounds(85, 20, 220, 50);
		jbtnView.setBounds(50, 80, 70, 30);
		jbtnReport.setBounds(150, 80, 70, 30);

		// button 테두리 제거
		jbtnView.setBorderPainted(false);
		jbtnReport.setBorderPainted(false);

		// 버튼 색 설정
		jbtnView.setBackground(new Color(0xFDDE45));
		jbtnReport.setBackground(new Color(0xd3d3d3));
		// event
		ButtonEvent be = new ButtonEvent(this, lv);
		jbtnView.addActionListener(be);
		jbtnReport.addActionListener(be);

		// 레이아웃 설정안함
		setLayout(null);

		// 가시화
		setVisible(true);

		// Title
		setTitle("log data info");

		// window 크기설정
		setSize(280, 180);

		// window 확대 방지
		setResizable(false);

		// 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// ButtonView

	public JButton getJbtnView() {
		return jbtnView;
	}

	public JButton getJbtnReport() {
		return jbtnReport;
	}

}// class
