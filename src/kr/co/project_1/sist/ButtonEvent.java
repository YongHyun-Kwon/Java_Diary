package kr.co.project_1.sist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 * view 버튼 클릭 시, 1~6의 내용을 Dialog에 출력 report 생성 버튼이 클릭 시, c:/dev/report 생성 후,
 * report_생성날짜.dat" 파일 생성
 * 
 * @author 정인선
 */
public class ButtonEvent implements ActionListener {

	private ButtonView bv;
	private ViewDialog vd;
	// LoginView has a
	private LoginView lv;
	private LogInfo li;

	public ButtonEvent() throws FileNotFoundException, IOException {
		li = new LogInfo();

	}

	public ButtonEvent(ButtonView bv, LoginView lv) {
		this.bv = bv;
		this.lv = lv;
	}



	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bv.getJbtnView()) {
			try {
				openViewDialog();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (ae.getSource() == bv.getJbtnReport()) {
			if (lv.getIdText().getText().equals("root")) {
				JOptionPane.showMessageDialog(null, "root 계정으로는 Report불가", "Report", JOptionPane.WARNING_MESSAGE);
			} else {
				try {
					li = new LogInfo();
					createNewFile();
					JOptionPane.showMessageDialog(null, "파일이 생성되었습니다.");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}// actionPerformed

public void openViewDialog() throws FileNotFoundException, IOException {
		vd = new ViewDialog(bv);
		vd.setVisible(true);

	}// openViewDialog

	public void createNewFile() throws IOException {

		// 생성날짜 변수값 도출
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyMMddkkmmss");
		Date time = new Date();
		String creationDate = simpleDate.format(time);
		try {
			Date date = simpleDate.parse(creationDate);
			Calendar cal = new GregorianCalendar();
			cal.setTime(time);
			creationDate = simpleDate.format(cal.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}

		String path = "c:/dev/report/";
		String name = "report_" + creationDate + ".dat";

		System.out.println("생성경로 및 파일명 : " + path + name);

		// 파일 생성
		File directory = new File(path);
		File report = new File(path + name);

		if (!directory.exists()) {
			directory.mkdirs();
			report.createNewFile();
			System.out.println("폴더가 생성되었습니다");
		} else {
			System.out.println("폴더가 이미 생성되었습니다.");
		} // end else

		BufferedWriter bfWriter = new BufferedWriter(new FileWriter(report));

		String line = "―――――――――――――――――――――――――――――";
		String totalName = "파일명("+li.getFileName()+")" + "(" + creationDate + ")";
		
		//최대키 값
		li.calMaxKey();
		String maxKey = li.getMaxKey();
		String maxCountKey = String.valueOf(li.getMapKey().get(maxKey))+"회";
		
		//브라우저 값
		Set<String> keys = li.getMapBrowser().keySet();
		Iterator<String> ita = keys.iterator();
		
		//요청 사항 값
		String status200 = String.valueOf(li.getStatus200());
		String status404 = String.valueOf(li.getStatus404());
		String status403 = String.valueOf(li.request403());
		String status500 = String.valueOf(li.request500());
		
		//가장 많은 요청 시간
		li.calMaxHour();
		String requestTime = li.getMaxHour()+"시";
		
		
		//StringBuilder 생성해서 문자열 이어 붙이기
		StringBuilder sb = new StringBuilder();
		StringBuilder sbMaxKey = new StringBuilder();
		StringBuilder sbService = new StringBuilder();
		StringBuilder sbTime = new StringBuilder();
		StringBuilder sbUnnorm = new StringBuilder();
		StringBuilder sbLine = new StringBuilder();
		StringBuilder sbError = new StringBuilder();
		
		//append
		sb.append(line).append("\n").append(totalName).append("\n").append(line).append("\n");
		sbMaxKey.append("1.최다 사용 키 : ").append(maxKey).append(" ").append(maxCountKey).append("\n").append("\n");
		sbService.append("3. 서비스 수행 성공(200) 횟수, 실패(404) 횟수: ").append("\n").append("200 : ").append(status200).append("번").append(" ").append("404: ")
		.append(status404).append("번").append("\n").append("\n");
		sbTime.append("4. 요청이 가장 많은 시간 : ").append(requestTime).append("\n\n");
		sbUnnorm.append("5. 비정상적인 요청(403)이 발생한 횟수: ").append(status403).append("\n").append("\n");
		sbError.append("6. 요청에 대한 에러(500)가 발생한 횟수: ").append(status500);
		
		
		//빌더 문자열로 만들기
		String intro = sb.toString();
		String maxK=sbMaxKey.toString();
		String servNum = sbService.toString();
		String varTime = sbTime.toString();
		String varUnnorm = sbUnnorm.toString();
		String varError = sbError.toString();
	
	
		//파일출력메시지
		String fileMsg = intro + maxK + printBrowser()+ "\n" + servNum  + varTime + varUnnorm + varError ;
	

		try {

			bfWriter.write(fileMsg);
			bfWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bfWriter != null) {
				bfWriter.close();
			}
		}

	}// createNewFile
	
	public String printBrowser() {

		Set<String> keys = li.getMapBrowser().keySet();
		Iterator<String> ita = keys.iterator();
		StringBuilder sb = new StringBuilder();
		String key = "";
		sb.append("2. 브라우저별 접속 횟수 및 비율 : \n");
		while (ita.hasNext()) {
			key = ita.next();
			sb.append(key).append(":").append(li.getMapBrowser().get(key)).append("회(")
					.append(String.format("%.2f)\n", (li.getMapBrowser().get(key) / (double) li.getLineCnt()) * 100));
		} // end while

		return sb.toString();

	} // printBrowser

}// class