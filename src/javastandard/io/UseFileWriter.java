package javastandard.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * 문자열 데이터를 목적지 파일로 기록.
 * 
 * @author user
 */
public class UseFileWriter {

	public void writeData() throws IOException {
		String msg = "오늘은 즐거운 금요일 입니다.";

		File file = new File("e:/dev/temp/write_data.txt");
		// 파일이 존재하면 ConfirmDialog로 덮어쓸 것이지 물어보고 "예" 가 눌리는 경우에만
		// 덮어 쓴다. 파일이 존재하지 않으면 파일을 생성한다. => 아래의 코드를 제어하기 위한
		// flag 변수를 만들어 사용한다.

		boolean createFlag = false;

		if (file.exists()) {
			switch (JOptionPane.showConfirmDialog(null, file.getAbsolutePath() + "이 존재 합니다. 덮어 쓰시겠습니까?")) {
			case JOptionPane.OK_OPTION:
				createFlag = true;
			} // end switch
		} else { // 파일이 없는 경우
			createFlag = true;
		} // end if

		if (createFlag) {

			FileWriter fw = null;
			try {
				// 1.스트림 연결.
				fw = new FileWriter(file);// 스트림 생성되면 파일을 덮어 쓴다.
				// 2. 스트림에 데이터를 기록.
				fw.write(msg);
				// 3. 스트림에 기록된 데이터를 목적지로 분출.
				fw.flush();

				System.out.println("파일로 데이터를 기록하였습니다.");
			} finally {
				// 4. 스트림을 끊는다. ( 메모리 누수 방지 )
				if (fw != null) {
					fw.close();
				} // end if
			} // end finally
		} // end if

	}// writeData

	public static void main(String[] args) {
		UseFileWriter ufw = new UseFileWriter();
		try {
			ufw.writeData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

}// class
