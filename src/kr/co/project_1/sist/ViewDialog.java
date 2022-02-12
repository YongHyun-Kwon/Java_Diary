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
		// ����
		// HTTP �ڵ� �����ִ� ��
		JLabel jlblHTTPStatus = new JLabel("HTTP_Status");
		JLabel jlblHTTP200 = new JLabel("200");
		JLabel jlblHTTP403 = new JLabel("403");
		JLabel jlblHTTP404 = new JLabel("404");
		JLabel jlblHTTP500 = new JLabel("500");

		// HTTP ���� Ƚ�� + ���� ������ �Է¹��� ��
		JLabel jlblCountHTTP = new JLabel("����Ƚ��, ����");
		JLabel jlblCountHTTP200 = new JLabel();
		JLabel jlblCountHTTP403 = new JLabel();
		JLabel jlblCountHTTP404 = new JLabel();
		JLabel jlblCountHTTP500 = new JLabel();

		// ���ͳ� �������� ��� ��
		JLabel jlblBrowser = new JLabel("Internet Browser");
		JLabel jlblIe = new JLabel("Ie");
		JLabel jlblChrome = new JLabel("Chrome");
		JLabel jlblOpera = new JLabel("Opera");
		JLabel jlblFireFox = new JLabel("Firefox");
		JLabel jlblSafari = new JLabel("Safari");

		// ���ͳ� �������� ���� Ƚ��, ���� ������ �Է¹��� ��
		JLabel jlblCountBrowser = new JLabel("����Ƚ��, ����");
		JLabel jlblCountIe = new JLabel();
		JLabel jlblCountChrome = new JLabel();
		JLabel jlblCountOpera = new JLabel();
		JLabel jlblCountFireFox = new JLabel();
		JLabel jlblCountSafari = new JLabel();

		// ����ڿ��� logFile ���ι�ȣ�� �޾ƿ� �ؽ�Ʈ �ʵ�
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

		// �Է� ��ư
		jbtnInput = new JButton("�Է�");

		// ���� �� Ű
		JLabel jlblKeyInfo = new JLabel("[���� ���� ���� Ű]");
		JLabel jlblKey = new JLabel("Key");
		JLabel jlblCountKey = new JLabel("Ƚ��");
		JLabel jlblOutputKey = new JLabel();
		JLabel jlblOutputCountKey = new JLabel();

		// ����ڰ� �Է��� ���ο��� ���� ���� ���� Ű�� Ƚ�� ���� ��
		JLabel jlblInfo = new JLabel("[�Է� ���ο��� ���� ���� ���� Ű]");
		JLabel jlblLineKey = new JLabel("Key");
		JLabel jlblLineCountKey = new JLabel("Ƚ��");
		JLabel jlblOutputLineKey = new JLabel();
		JLabel jlblOutputCountLineKey = new JLabel();

		// ������ ������ �α������� ��� �ؽ�ƮArea
		JTextArea jtaData = new JTextArea();
		JScrollPane jspLogFile = new JScrollPane(jtaData);
		jspLogFile.setBorder(new TitledBorder("Log File Data"));

		// ���帹�� ������ �ð��� �����ִ� ��
		JLabel jlblTimeInfo = new JLabel("[����ڰ� ���� ���� ������ �ð�]");
		JLabel jlblMostAccessTime = new JLabel();

		// [window Layout, size ����]
		setLayout(null);
		setSize(900, 580);

		// [������Ʈ ũ�� ��ġ ����]
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

		// [������]
		// ����

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

		// ����
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

		// ��Ʈ
		Font font = new Font("���� ���", Font.BOLD, 13);
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

		// http �����ڵ� ������ �߰�
		jlblCountHTTP200.setText(String.valueOf(li.getStatus200() + "ȸ"));
		jlblCountHTTP403.setText(li.request403());
		jlblCountHTTP404.setText(String.valueOf(li.getStatus404() + "ȸ"));
		jlblCountHTTP500.setText(li.request500());

		// ������ Ƚ�� ������ �߰�
		Set<String> keys = li.getMapBrowser().keySet();
		Iterator<String> ita = keys.iterator();
		String key = "";
		int idx = 0;
		JLabel[] arrJlabel = { jlblCountOpera, jlblCountFireFox, jlblCountSafari, jlblCountChrome, jlblCountIe };
		while (ita.hasNext()) {
			key = ita.next();
			arrJlabel[idx].setText(String.format("%sȸ, (%.2f%%)\n", li.getMapBrowser().get(key),
					(li.getMapBrowser().get(key) / (double) li.getLineCnt()) * 100));
			idx++;
		} // end while

		// ���� ���� ���� Ű ������ �߰�
		li.calMaxKey();
		jlblOutputKey.setText(li.getMaxKey());
		jlblOutputCountKey.setText(String.valueOf(li.getMapKey().get(li.getMaxKey())));

// �Է¹�ư �������� line�� ��� �� �ִ�Ű ������ �߰�
		jbtnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				li.getFilePath();
				BufferedReader br = null;
				int startNum = 0;
				int lastNum = 0;

				try {
					// ���Ͽ� �����ϴ� ����� ���� ��Ʈ���� ����.
					br = new BufferedReader(new FileReader(li.getFilePath()));
					String data = "";
					int lineCnt = 0;

					try {
						startNum = Integer.parseInt(startNumtf.getText());
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "���ڴ� �Է��� �� �����ϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
						textInit();
						return;
					} // end catch
					try {
						lastNum = Integer.parseInt(lastNumtf.getText());
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "���ڴ� �Է��� �� �����ϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
						textInit();
						return;
					} // end catch

					if (startNum > lastNum) {
						JOptionPane.showMessageDialog(null, "���۶����� �����κ��� Ŭ �� �����ϴ�.", "Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (startNum < 0 || lastNum < 0) {
						JOptionPane.showMessageDialog(null, "���۶��ΰ� �� �������� 0���� Ŀ�� �մϴ�.", "Error",
								JOptionPane.ERROR_MESSAGE);
						textInit();
						return;
					}
					if (startNum == 0 || lastNum == 0) {
						JOptionPane.showMessageDialog(null, "���۰� �������� 0���� �Է��� �� �����ϴ�.", "Error",
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
						JOptionPane.showMessageDialog(null, "���۰� �������� �ִ���κ��� Ŭ �� �����ϴ�.", "Error",
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

		// ���帹�� �ð� �߰�
		li.calMaxHour();
		jlblMostAccessTime.setText(li.getMaxHour() + "��");

		// ��ġ
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

		// [����ȭ]
		setVisible(true);

		// [���� �̺�Ʈ]
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