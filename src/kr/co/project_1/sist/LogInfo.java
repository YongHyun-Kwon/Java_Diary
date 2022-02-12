package kr.co.project_1.sist;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class LogInfo extends JFrame {

	private int status200, status403, status404, status500, lineCnt;
	private String maxKey, maxLineKey, maxHour, filePath, fileName;
	private Map<String, Integer> mapKey = new HashMap<String, Integer>();
	private Map<String, Integer> mapLineKey = new HashMap<String, Integer>();
	private Map<String, Integer> mapHour = new HashMap<String, Integer>();
	private Map<String, Integer> mapBrowser = new HashMap<String, Integer>();
	private String[] arrBrowser = { "ie", "opera", "firefox", "Safari", "Chrome" };
	private int[] arrCntBrowser = new int[arrBrowser.length];

	public LogInfo() throws IOException, FileNotFoundException {

		FileDialog fd = new FileDialog(this, "파일선택", FileDialog.LOAD);
		fd.setVisible(true);
		String path = fd.getDirectory();
		fileName = fd.getFile();

		File file = new File(path + fileName);
		filePath = path + fileName;
		if (file.exists()) {
			BufferedReader br = null; // 줄단위로 읽는 기능
			try {
				// 파일에 연결하는 기능을 가진 스트림과 연결.
				br = new BufferedReader(new FileReader(filePath));
				String data = "";

				while ((data = br.readLine()) != null) {
					cntKey(data);
					cntBrowser(data);
					cntHour(data);
					statusCount(data);
					lineCnt++;
				} // end while

			} finally {
				if (br != null) {
					br.close();
				} // end if
			} // end finally

		} else {
			dispose();
		} // end else

	}// LogInfo

	// 상태코드 횟수 Count
	public void statusCount(String data) {
		String status = data.substring(data.indexOf("[") + 1, data.indexOf("]"));

		switch (status) {
		case "200":
			status200++;
			break;
		case "404":
			status404++;
			break;
		case "403":
			status403++;
			break;
		case "500":
			status500++;
			break;
		} // end switch

	} // statudCount

	// 총 시간 Count
	public void cntHour(String data) {
		String hour = "";
		hour = data.substring(data.lastIndexOf("[") + 1, data.lastIndexOf("]")).substring(11, 13);
		mapHour.put(hour, mapHour.get(hour) == null ? 1 : mapHour.get(hour) + 1);

	} // cntHour

	// 가장 많은 시간 계산
	public void calMaxHour() {
		int maxVal = (Collections.max(mapHour.values()));
		for (String val : mapHour.keySet()) {
			if (mapHour.get(val) == maxVal) {
				maxHour = val;
			} // end if
		} // end for

	} // calMaxHour

	// 403 응답 횟수 비율 반환
	public String request403() {
		return String.format("%d회(%.2f%%)", status403, (status403 / (double) lineCnt) * 100);
	} // request403

	// 500 횟수 비율 반환
	public String request500() {
		return String.format("%d회(%.2f%%)", status500, (status500 / (double) lineCnt) * 100);
	} // request500

	// 총 key의 갯수 Count
	public void cntKey(String data) {
		String key = null;
		if (data.contains("key")) {
			key = data.substring(data.indexOf("=") + 1, data.indexOf("&"));
			mapKey.put(key, mapKey.get(key) == null ? 1 : mapKey.get(key) + 1);
		} // end if
	} // end key

	// 라인이 입력 되었을 때 key Count
	public void cntLineKey(String data) {
		String key = null;
		if (data.contains("key")) {
			key = data.substring(data.indexOf("=") + 1, data.indexOf("&"));
			mapLineKey.put(key, mapLineKey.get(key) == null ? 1 : mapLineKey.get(key) + 1);
		} // end if
	} // cntLineKey

	// 가장 많이 사용한 key 계산
	public void calMaxKey() {
		int maxVal = (Collections.max(mapKey.values()));
		for (String val : mapKey.keySet()) {
			if (mapKey.get(val) == maxVal) {
				maxKey = val;
			} // end if
		} // end for
	} // calMaxKey

	// 라인이 입력 되었을 때 가장 많이 사용한 key 계산
	public void calMaxLineKey() {
		int maxVal = (Collections.max(mapLineKey.values()));
		for (String val : mapLineKey.keySet()) {
			if (mapLineKey.get(val) == maxVal) {
				maxLineKey = val;
			} // end if
		} // end for

	} // calMaxLineKey

	// 접속 브라우저 Count
	public void cntBrowser(String data) {
		for (int i = 0; i < arrBrowser.length; i++) {
			if (data.contains(arrBrowser[i])) {
				arrCntBrowser[i]++;
				mapBrowser.put(arrBrowser[i], arrCntBrowser[i]);
			} // end if
		} // end for
	} // cntBrowser

	public int getStatus200() {
		return status200;
	} // getStatus200

	public int getStatus403() {
		return status403;
	} // getStatus403

	public int getStatus404() {
		return status404;
	} // getStatus404

	public int getStatus500() {
		return status500;
	} // getStatus500

	public int getLineCnt() {
		return lineCnt;
	} // getLineCnt

	public String getMaxKey() {
		return maxKey;
	} // getMaxKey

	public String getMaxLineKey() {
		return maxLineKey;
	} // getMaxLineKey

	public String getMaxHour() {
		return maxHour;
	} // getMaxHour

	public Map<String, Integer> getMapKey() {
		return mapKey;
	} // getMapKey

	public Map<String, Integer> getMapLineKey() {
		return mapLineKey;
	} // getMapLineKey

	public Map<String, Integer> getMapHour() {
		return mapHour;
	} // getMapHour

	public Map<String, Integer> getMapBrowser() {
		return mapBrowser;
	} // getMapBrowser

	public String getFilePath() {
		return filePath;
	} // getFilePath

	public String getFileName() {
		return fileName;
	} // getFileName
	

} // class
