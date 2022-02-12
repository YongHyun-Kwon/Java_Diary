package kr.co.project_1.sist;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class LoginView extends JFrame {

	private Map<String, String> loginMap = new HashMap<String, String>();

	private JButton btnLogin;
	private JButton btnInit;
	private JPasswordField passText;
	private JTextField idText;

	public LoginView() {

		// 로그인 정보
		loginMap.put("admin", "1234");
		loginMap.put("administrator", "12345");
		loginMap.put("root", "1111");

		// setting
		setTitle("SIST Login");
		setSize(300, 400);
		setResizable(false);
		setLocation(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// panel
		JPanel panel = new JPanel();
		LoginPanel(panel);

		// add
		panel.setBackground(Color.white);
		add(panel);

		setLocation(550, 200);

		// 가시화
		setVisible(true);
	} // LoginView

	public void LoginPanel(JPanel panel) {
		// layout 자율적으로 배치
		panel.setLayout(null);

		// Label에 로그인 로고를 넣는 작업
		// 사이즈를 맞추기위해 image클래스 사용
		ImageIcon logPic = new ImageIcon(
				"C:\\Users\\82109\\Desktop\\workspace\\Java\\Java_Diary\\src\\kr\\co\\project_1\\sist\\LoginPic.jpg");
		Image img = logPic.getImage();
		Image changeLogPic = img.getScaledInstance(135, 135, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeLogPic);
		JLabel jlblLoginPic = new JLabel(changeIcon);
		jlblLoginPic.setBounds(80, 13, 135, 135);
		panel.add(jlblLoginPic);

		JLabel idLabel = new JLabel("ID");
		idLabel.setBounds(10, 145, 80, 35);
		panel.add(idLabel);

		JLabel passLabel = new JLabel("PassWord");
		passLabel.setBounds(10, 188, 80, 35);
		panel.add(passLabel);

		idText = new JTextField(20) {// 테두리 없애는 작업
			public void setBorder(Border border) {

			}
		};
		idText.setBounds(80, 145, 190, 35);
		idText.setBackground(new Color(0xd3d3d3));

		panel.add(idText);

		passText = new JPasswordField(20) {// 테두리 없애는 작업
			public void setBorder(Border border) {
			}
		};
		passText.setBounds(80, 188, 190, 35);
		passText.setBackground(new Color(0xd3d3d3));

		panel.add(passText);
		passText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				isLoginCheck();
			} // actionPerformed
		});

		btnInit = new JButton("Reset");
		btnInit.setBounds(20, 275, 250, 35);
		btnInit.setBackground(Color.DARK_GRAY);
		btnInit.setForeground(Color.white);
		panel.add(btnInit);
		btnInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				idText.setText("");
				passText.setText("");
			} // actionPerformed
		});

		btnLogin = new JButton("Login") {// 테두리 없애는 작업
			public void setBorder(Border border) {
			}
		};
		btnLogin.setBounds(20, 235, 250, 35);
		panel.add(btnLogin);
		btnLogin.setBackground(new Color(0xFDDE45));
		btnLogin.setForeground(Color.black);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				isLoginCheck();
			} // actionPerformed
		});
	} // LoginPanel

	public void isLoginCheck() {

		if (!loginMap.containsKey(idText.getText())) {
			JOptionPane.showMessageDialog(null, "ID가 다릅니다.", "Login", JOptionPane.WARNING_MESSAGE);
			jtfInit();
		} else {
			if (loginMap.get(idText.getText()).equals(new String(passText.getPassword()))) {
				JOptionPane.showMessageDialog(null, "Login 성공");
				dispose();
				// Button View 열기
				new ButtonView(this);
			} else {
				JOptionPane.showMessageDialog(null, "Password가 다릅니다.", "Login", JOptionPane.WARNING_MESSAGE);
				jtfInit();
			} // end else
		} // end else
	} // isLoginCheck

	public JTextField getIdText() {
		return idText;
	} // getIdText

	/**
	 * ID, Password 틀렸을 시 TextField 초기화
	 */
	public void jtfInit() {
		idText.setText("");
		passText.setText("");
	} // jtfInit

} // class
