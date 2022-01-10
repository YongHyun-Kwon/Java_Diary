package javastandard.oop.learnclass;

/**
 * 마카펜을 추상화하여 생성한 클래스.<br>
 * 명사적인 특징 : 뚜껑, 몸체, 색<br>
 * 동사적인 특징 : 쓴다.
 * 
 * @author user
 */
public class Maker {
	private int cap; // 뚜껑의 갯수
	private int body; // 몸체의 객수
	private String color; // 마카펜의 색깔
	
	/**
	 * 01-10-2022 에 추가된 생성자.<br>
	 * 뚜겅 1개, 몸체 1개, 검은색인 마카펜 객체를 생성할 때 사용한다.<br>
	 * Marker 객체명 = new Marker();<br>
	 * 의 문법으로 생성하여 사용한다.
	 */
	public Maker() {
		cap = 1;
		body = 1;
		color = "검은";
	}

	/**
	 * 생성된 마카펜 객체에 뚜껑의 갯수를 설정하는 일.
	 * 
	 * @param cap 설정할 뚜껑의 갯수
	 */
	public void setCap(int cap) {
		this.cap = cap;
	} // setCap

	/**
	 * 생성된 마카펜 객체에 설정된 뚜껑 갯수를 반환하는 일.
	 * 
	 * @return 뚜껑의 갯수
	 */
	public int getCap() {
		return cap;
	} // getCap

	/**
	 * 생성된 마카펜 객체의 몸체 갯수를 설정하는 일.
	 * 
	 * @param body 설정할 몸체의 갯수
	 */
	public void setBody(int body) {
		this.body = body;
	} // setBody

	/**
	 * 생성된 마카펜 객체에 설정된 몸체 객수를 반환하는 일.
	 * 
	 * @return body 몸체의 갯수
	 */
	public int getBody() {
		return body;
	} // getBody

	/**
	 * 생성된 마카펜 객체의 색깔을 설정하는 일.
	 * 
	 * @param color 마카의 색깔을 설정
	 */
	public void setColor(String color) {
		this.color = color;
	} // setColor

	/**
	 * 생성된 마카펜 객체에 설정된 섹깔을 반환하는 일.
	 * 
	 * @return color 마카의 색깔 반환
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 칠판에 생성된 마카펜 객체를 사용하여 "안녕하세요?"를 쓰는 일 구현
	 * 
	 * @return message
	 */
	public String write() {
		return color + " 색 마카펜으로 \"안녕하세요?\" 를 칠판에 쓴다.";
	} // write

	/**
	 * "칠판에 생성된 마카펜 객체를 사용하여 입력된 메세지를 쓰는 일 구현
	 * 
	 * @param msg 칠판에 기록할 메세지
	 * @return 메세지
	 */
	public String write(String msg) {
		return color + "색 마카펜으로 \"" + msg + "\"를 칠판에 쓴다.";
	} // write

} // class
