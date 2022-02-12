package kr.co.project_1.sist;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ViewDialog extends JDialog {
	private LogInfo li = null;
	private JTextField startNumtf;
	private JTextField lastNumtf;
	private JButton jbtnInput;

	public ViewDialog(ButtonView bv) throws FileNotFoundException, IOException {
		super(bv, "ViewDialog", true);

		li = new LogInfo();
		// 생성
		// HTTP 코드 보여주는 라벨
		JLabel jlblHTTPStatus = new JLabel("HTTP_Status");
		JLabel jlblHTTP200 = new JLabel("200");
		JLabel jlblHTTP403 = new JLabel("403");
		JLabel jlblHTTP404 = new JLabel("404");
		JLabel jlblHTTP500 = new JLabel("500");

		// HTTP 응답 횟수 + 비율 데이터 입력받을 라벨
		JLabel jlblCountHTTP = new JLabel("응답횟수, 비율");
		JLabel jlblCountHTTP200 = new JLabel();
		JLabel jlblCountHTTP403 = new JLabel();
		JLabel jlblCountHTTP404 = new JLabel();
		JLabel jlblCountHTTP500 = new JLabel();

		// 인터넷 브라우저명 띄울 라벨
		JLabel jlblBrowser = new JLabel("Internet Browser");
		JLabel jlblIe = new JLabel("Ie");
		JLabel jlblChrome = new JLabel("Chrome");
		JLabel jlblOpera = new JLabel("Opera");
		JLabel jlblFireFox = new JLabel("Firefox");
		JLabel jlblSafari = new JLabel("Safari");

		// 인터넷 브라우저별 접속 횟수, 비율 데이터 입력받을 라벨
		JLabel jlblCountBrowser = new JLabel("접속횟수, 비율");
		JLabel jlblCountIe = new JLabel();
		JLabel jlblCountChrome = new JLabel();
		JLabel jlblCountOpera = new JLabel();
		JLabel jlblCountFireFox = new JLabel();
		JLabel jlblCountSafari = new JLabel();

		// 사용자에게 logFile 라인번호를 받아올 텍스트 필드
		JLabel jlblStartNum = new JLabel("Start Line");
		JLabel jlblLastNum = new JLabel("Last Line");
		startNumtf = new JTextField() {
			public void setBorder(Border border) {
			}
		};
		lastNumtf = new JTextField() {
			public void setBorder(Border border) {
			}
		};

		// 입력 버튼
		jbtnInput = new JButton("입력");

		// 많이 쓴 키
		JLabel jlblKeyInfo = new JLabel("[가장 많이 나온 키]");
		JLabel jlblKey = new JLabel("Key");
		JLabel jlblCountKey = new JLabel("횟수");
		JLabel jlblOutputKey = new JLabel();
		JLabel jlblOutputCountKey = new JLabel();

		// 사용자가 입력한 라인에서 가장 많이 나온 키와 횟수 보일 라벨
		JLabel jlblInfo = new JLabel("[입력 라인에서 가장 많이 나온 키]");
		JLabel jlblLineKey = new JLabel("Key");
		JLabel jlblLineCountKey = new JLabel("횟수");
		JLabel jlblOutputLineKey = new JLabel();
		JLabel jlblOutputCountLineKey = new JLabel();

		// 정해진 라인의 로그파일을 띄울 텍스트Area
		JTextArea jtaData = new JTextArea();
		JScrollPane jspLogFile = new JScrollPane(jtaData);
		jspLogFile.setBorder(new TitledBorder("Log File Data"));

		// 가장많이 접속한 시간대 보여주는 라벨
		JLabel jlblTimeInfo = new JLabel("[사용자가 가장 많이 접속한 시간]");
		JLabel jlblMostAccessTime = new JLabel();

		// [window Layout, size 설정]
		setLayout(null);
		setSize(900, 580);

		// [컴포넌트 크기 위치 설정]
		jlblHTTPStatus.setBounds(20, 10, 90, 35);
		jlblHTTP200.setBounds(20, 50, 70, 35);
		jlblHTTP403.setBounds(20, 90, 70, 35);
		jlblHTTP404.setBounds(20, 130, 70, 35);
		jlblHTTP500.setBounds(20, 170, 70, 35);
		jlblCountHTTP.setBounds(130, 10, 150, 35);
		jlblCountHTTP200.setBounds(100, 50, 150, 33);
		jlblCountHTTP403.setBounds(100, 90, 150, 33);
		jlblCountHTTP404.setBounds(100, 130, 150, 33);
		jlblCountHTTP500.setBounds(100, 170, 150, 33);

		jlblBrowser.setBounds(15, 240, 100, 35);
		jlblIe.setBounds(20, 280, 70, 35);
		jlblChrome.setBounds(20, 320, 70, 35);
		jlblOpera.setBounds(20, 360, 70, 35);
		jlblFireFox.setBounds(20, 400, 70, 35);
		jlblSafari.setBounds(20, 440, 70, 35);
		jlblCountBrowser.setBounds(130, 240, 150, 35);
		jlblCountIe.setBounds(100, 280, 150, 33);
		jlblCountChrome.setBounds(100, 320, 150, 33);
		jlblCountOpera.setBounds(100, 360, 150, 33);
		jlblCountFireFox.setBounds(100, 400, 150, 33);
		jlblCountSafari.setBounds(100, 440, 150, 33);

		jspLogFile.setBounds(300, 240, 550, 180);

		jlblStartNum.setBounds(300, 130, 70, 35);
		jlblLastNum.setBounds(440, 130, 70, 35);
		startNumtf.setBounds(360, 130, 70, 33);
		lastNumtf.setBounds(500, 130, 70, 33);
		jbtnInput.setBounds(600, 130, 70, 33);

		jlblKeyInfo.setBounds(300, 10, 550, 35);
		jlblKey.setBounds(320, 50, 70, 35);
		jlblCountKey.setBounds(460, 50, 40, 35);
		jlblOutputKey.setBounds(360, 50, 70, 33);
		jlblOutputCountKey.setBounds(500, 50, 70, 33);

		jlblInfo.setBounds(300, 90, 550, 35);
		jlblLineKey.setBounds(320, 170, 40, 35);
		jlblLineCountKey.setBounds(460, 170, 40, 35);
		jlblOutputLineKey.setBounds(360, 170, 70, 33);
		jlblOutputCountLineKey.setBounds(500, 170, 70, 33);

		jlblTimeInfo.setBounds(300, 440, 200, 35);
		jlblMostAccessTime.setBounds(510, 440, 70, 33);

		// [색변경]
		// 투명도

		jlblCountHTTP200.setOpaque(true);
		jlblCountHTTP403.setOpaque(true);
		jlblCountHTTP404.setOpaque(true);
		jlblCountHTTP500.setOpaque(true);
		jlblCountIe.setOpaque(true);
		jlblCountChrome.setOpaque(true);
		jlblCountOpera.setOpaque(true);
		jlblCountSafari.setOpaque(true);
		jlblCountFireFox.setOpaque(true);
		jlblOutputKey.setOpaque(true);
		jlblOutputCountKey.setOpaque(true);
		jlblOutputLineKey.setOpaque(true);
		jlblOutputCountLineKey.setOpaque(true);
		jlblMostAccessTime.setOpaque(true);
		jlblHTTP200.setOpaque(true);
		jlblHTTP403.setOpaque(true);
		jlblHTTP404.setOpaque(true);
		jlblHTTP500.setOpaque(true);
		jlblIe.setOpaque(true);
		jlblChrome.setOpaque(true);
		jlblOpera.setOpaque(true);
		jlblFireFox.setOpaque(true);
		jlblSafari.setOpaque(true);

		// 배경색
		Color lgray = new Color(0xd3d3d3);
		jlblCountHTTP200.setBackground(lgray);
		jlblCountHTTP403.setBackground(lgray);
		jlblCountHTTP404.setBackground(lgray);
		jlblCountHTTP500.setBackground(lgray);
		jlblCountIe.setBackground(lgray);
		jlblCountChrome.setBackground(lgray);
		jlblCountOpera.setBackground(lgray);
		jlblCountSafari.setBackground(lgray);
		jlblCountFireFox.setBackground(lgray);

		startNumtf.setBackground(new Color(0xFDDE45));
		lastNumtf.setBackground(new Color(0xFDDE45));
		jbtnInput.setBackground(Color.black);
		jbtnInput.setForeground(Color.white);
		jspLogFile.setBackground(new Color(0xFDDE45));
		jlblOutputKey.setBackground(lgray);
		jlblOutputCountKey.setBackground(lgray);

		jlblOutputLineKey.setBackground(lgray);
		jlblOutputCountLineKey.setBackground(lgray);
		jlblMostAccessTime.setBackground(lgray);
		super.getContentPane().setBackground(Color.white);

		jlblHTTP200.setBackground(Color.DARK_GRAY);
		jlblHTTP200.setForeground(Color.white);
		jlblHTTP403.setBackground(Color.DARK_GRAY);
		jlblHTTP403.setForeground(Color.white);
		jlblHTTP404.setBackground(Color.DARK_GRAY);
		jlblHTTP404.setForeground(Color.white);
		jlblHTTP500.setBackground(Color.DARK_GRAY);
		jlblHTTP500.setForeground(Color.white);

		jlblIe.setBackground(Color.DARK_GRAY);
		jlblIe.setForeground(Color.white);
		jlblChrome.setBackground(Color.DARK_GRAY);
		jlblChrome.setForeground(Color.white);
		jlblOpera.setBackground(Color.DARK_GRAY);
		jlblOpera.setForeground(Color.white);
		jlblFireFox.setBackground(Color.DARK_GRAY);
		jlblFireFox.setForeground(Color.white);
		jlblSafari.setBackground(Color.DARK_GRAY);
		jlblSafari.setForeground(Color.white);

		// 폰트
		Font font = new Font("맑은 고딕", Font.BOLD, 13);
		jlblHTTPStatus.setFont(font);
		jlblCountHTTP.setFont(font);
		jlblBrowser.setFont(font);
		jlblCountBrowser.setFont(font);
		jlblKey.setFont(font);
		jlblCountKey.setFont(font);
		jlblLineKey.setFont(font);
		jlblLineCountKey.setFont(font);
		jlblKeyInfo.setFont(font);
		jlblInfo.setFont(font);
		jlblTimeInfo.setFont(font);
		jlblIe.setHorizontalAlignment(JLabel.CENTER);
		jlblChrome.setHorizontalAlignment(JLabel.CENTER);
		jlblOpera.setHorizontalAlignment(JLabel.CENTER);
		jlblFireFox.setHorizontalAlignment(JLabel.CENTER);
		jlblSafari.setHorizontalAlignment(JLabel.CENTER);
		jlblHTTP200.setHorizontalAlignment(JLabel.CENTER);
		jlblHTTP403.setHorizontalAlignment(JLabel.CENTER);
		jlblHTTP404.setHorizontalAlignment(JLabel.CENTER);
		jlblHTTP500.setHorizontalAlignment(JLabel.CENTER);
		jlblCountHTTP200.setHorizontalAlignment(JLabel.CENTER);
		jlblCountHTTP403.setHorizontalAlignment(JLabel.CENTER);
		jlblCountHTTP404.setHorizontalAlignment(JLabel.CENTER);
		jlblCountHTTP500.setHorizontalAlignment(JLabel.CENTER);
		jlblCountIe.setHorizontalAlignment(JLabel.CENTER);
		jlblCountChrome.setHorizontalAlignment(JLabel.CENTER);
		jlblCountOpera.setHorizontalAlignment(JLabel.CENTER);
		jlblCountSafari.setHorizontalAlignment(JLabel.CENTER);
		jlblCountFireFox.setHorizontalAlignment(JLabel.CENTER);
		jlblOutputKey.setHorizontalAlignment(JLabel.CENTER);
		jlblOutputCountKey.setHorizontalAlignment(JLabel.CENTER);
		jlblOutputLineKey.setHorizontalAlignment(JLabel.CENTER);
		jlblOutputCountLineKey.setHorizontalAlignment(JLabel.CENTER);
		jlblMostAccessTime.setHorizontalAlignment(JLabel.CENTER);

		// http 상태코드 데이터 추가
		jlblCountHTTP200.setText(String.valueOf(li.getStatus200() + "회"));
		jlblCountHTTP403.setText(li.request403());
		jlblCountHTTP404.setText(String.valueOf(li.getStatus404() + "회"));
		jlblCountHTTP500.setText(li.request500());

		// 브라우저 횟수 데이터 추가
		Set<String> keys = li.getMapBrowser().keySet();
		Iterator<String> ita = keys.iterator();
		String key = "";
		int idx = 0;
		JLabel[] arrJlabel = { jlblCountOpera, jlblCountFireFox, jlblCountSafari, jlblCountChrome, jlblCountIe };
		while (ita.hasNext()) {
			key = ita.next();
			arrJlabel[idx].setText(String.format("%s회, (%.2f%%)\n", li.getMapBrowser().get(key),
					(li.getMapBrowser().get(key) / (double) li.getLineCnt()) * 100));
			idx++;
		} // end while

		// 가장 많이 눌린 키 데이터 추가
		li.calMaxKey();
		jlblOutputKey.setText(li.getMaxKey());
		jlblOutputCountKey.setText(String.valueOf(li.getMapKey().get(li.getMaxKey())));

// 입력버튼 눌렸을시 line값 출력 및 최대키 데이터 추가
		jbtnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				li.getFilePath();
				BufferedReader br = null;
				int startNum = 0;
				int lastNum = 0;

				try {
					// 파일에 연결하는 기능을 가진 스트림과 연결.
					br = new BufferedReader(new FileReader(li.getFilePath()));
					String data = "";
					int lineCnt = 0;

					try {
						startNum = Integer.parseInt(startNumtf.getText());
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "글자는 입력할 수 없습니다.", "Error", JOptionPane.ERROR_MESSAGE);
						textInit();
						return;
					} // end catch
					try {
						lastNum = Integer.parseInt(lastNumtf.getText());
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "글자는 입력할 수 없습니다.", "Error", JOptionPane.ERROR_MESSAGE);
						textInit();
						return;
					} // end catch

					if (startNum > lastNum) {
						JOptionPane.showMessageDialog(null, "시작라인이 끝라인보다 클 수 없습니다.", "Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (startNum < 0 || lastNum < 0) {
						JOptionPane.showMessageDialog(null, "시작라인과 끝 라인은은 0보다 커야 합니다.", "Error",
								JOptionPane.ERROR_MESSAGE);
						textInit();
						return;
					}
					if (startNum == 0 || lastNum == 0) {
						JOptionPane.showMessageDialog(null, "시작과 끝라인은 0으로 입력할 수 없습니다.", "Error",
								JOptionPane.ERROR_MESSAGE);
						textInit();
						return;
					}
					if (startNum != 0 && lastNum != 0) {
						jtaData.setText("");
						jlblOutputLineKey.setText("");
						jlblOutputCountLineKey.setText("");
						li.getMapLineKey().clear();
						while ((data = br.readLine()) != null) {
							lineCnt++;
							if (lineCnt >= startNum && lineCnt <= lastNum) {
								li.cntLineKey(data);
								jtaData.append(data + "\n");
							} // end if
						} // end while
					} // end if
					if (lineCnt < startNum || lineCnt < lastNum) {
						JOptionPane.showMessageDialog(null, "시작과 끝라인은 최대라인보다 클 수 없습니다.", "Error",
								JOptionPane.ERROR_MESSAGE);
						textInit();
					} // end if
					li.calMaxLineKey();
					jlblOutputLineKey.setText(li.getMaxLineKey());
					jlblOutputCountLineKey.setText(String.valueOf(li.getMapLineKey().get(li.getMaxLineKey())));
				} catch (FileNotFoundException fnfe) {
					fnfe.printStackTrace();
				} catch (IOException ie) {
					ie.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException ie) {
							ie.printStackTrace();
						}
					} // end if
				} // end finally
			}
		});

		// 가장많은 시간 추가
		li.calMaxHour();
		jlblMostAccessTime.setText(li.getMaxHour() + "시");

		// 배치
		add(jlblHTTPStatus);
		add(jlblHTTP200);
		add(jlblHTTP403);
		add(jlblHTTP404);
		add(jlblHTTP500);
		add(jlblCountHTTP);
		add(jlblCountHTTP200);
		add(jlblCountHTTP403);
		add(jlblCountHTTP404);
		add(jlblCountHTTP500);
		add(jlblBrowser);
		add(jlblIe);
		add(jlblChrome);
		add(jlblSafari);
		add(jlblOpera);
		add(jlblFireFox);
		add(jlblCountBrowser);
		add(jlblCountIe);
		add(jlblCountOpera);
		add(jlblCountChrome);
		add(jlblCountSafari);
		add(jlblCountFireFox);

		add(jlblKeyInfo);
		add(jlblKey);
		add(jlblCountKey);
		add(jlblOutputKey);
		add(jlblOutputCountKey);

		add(jspLogFile);
		add(jbtnInput);
		add(jlblStartNum);
		add(jlblLastNum);
		add(startNumtf);
		add(lastNumtf);
		add(jlblLineKey);
		add(jlblInfo);
		add(jlblLineCountKey);
		add(jlblOutputLineKey);
		add(jlblOutputCountLineKey);
		add(jlblTimeInfo);
		add(jlblMostAccessTime);

		// [가시화]
		setVisible(true);

		// [종료 이벤트]
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	} // ViewDialog

	public void textInit() {
		startNumtf.setText("");
		lastNumtf.setText("");
	} // textInit

	public JTextField getStartNumtf() {
		return startNumtf;
	} // getStartNumtf

	public JTextField getLastNumtf() {
		return lastNumtf;
	} // getLastNumtf

} // class