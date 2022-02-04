package javastandard.io;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 16bit 스트림을 사용한 파일의 줄 단위 읽기
 * 
 * @author user
 */
@SuppressWarnings("serial")
public class UseFileReader extends JFrame {

	public void readFile() throws IOException {
		// 1. 연결할 파일에 정보를 얻는 객체 생성
		FileDialog fd = new FileDialog(this, "파일선택", FileDialog.LOAD);
		fd.setVisible(true);
		String path = fd.getDirectory();
		String name = fd.getFile();

		File file = new File(path + name);
		if (file.exists()) {
			BufferedReader br = null; // 줄단위로 읽는 기능

			try {
				// 파일에 연결하는 기능을 가진 스트림과 연결.
				br = new BufferedReader(new FileReader(file));
//				System.out.println(br.readLine()); // \n까지 한줄 읽기
				String data = "";
//				while ((data = br.readLine()) != null) {
//					System.out.println(data);
//				}
				StringBuilder outputData = new StringBuilder();
				while ((data = br.readLine()) != null) {
					outputData.append(data).append("\n");
				} // end while
				JTextArea jta = new JTextArea(outputData.toString(), 10, 50);
				JScrollPane jsp = new JScrollPane(jta);

				JOptionPane.showMessageDialog(this, jsp);

			} finally {
				if (br != null) {
					br.close();
				} // end if
			} // end finally

		} else {
			JOptionPane.showMessageDialog(this, file + "이 존재하지 않습니다.");
		} // end else

	} // readFile

	public static void main(String[] args) {

		UseFileReader ufr = new UseFileReader();
		try {
			ufr.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end catch
		System.exit(0);

	} // main

} // class
