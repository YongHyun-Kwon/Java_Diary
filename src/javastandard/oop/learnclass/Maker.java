package javastandard.oop.learnclass;

/**
 * ��ī���� �߻�ȭ�Ͽ� ������ Ŭ����.<br>
 * ������� Ư¡ : �Ѳ�, ��ü, ��<br>
 * �������� Ư¡ : ����.
 * 
 * @author user
 */
public class Maker {
	private int cap; // �Ѳ��� ����
	private int body; // ��ü�� ����
	private String color; // ��ī���� ����
	
	/**
	 * 01-10-2022 �� �߰��� ������.<br>
	 * �Ѱ� 1��, ��ü 1��, �������� ��ī�� ��ü�� ������ �� ����Ѵ�.<br>
	 * Marker ��ü�� = new Marker();<br>
	 * �� �������� �����Ͽ� ����Ѵ�.
	 */
	public Maker() {
		cap = 1;
		body = 1;
		color = "����";
	}

	/**
	 * ������ ��ī�� ��ü�� �Ѳ��� ������ �����ϴ� ��.
	 * 
	 * @param cap ������ �Ѳ��� ����
	 */
	public void setCap(int cap) {
		this.cap = cap;
	} // setCap

	/**
	 * ������ ��ī�� ��ü�� ������ �Ѳ� ������ ��ȯ�ϴ� ��.
	 * 
	 * @return �Ѳ��� ����
	 */
	public int getCap() {
		return cap;
	} // getCap

	/**
	 * ������ ��ī�� ��ü�� ��ü ������ �����ϴ� ��.
	 * 
	 * @param body ������ ��ü�� ����
	 */
	public void setBody(int body) {
		this.body = body;
	} // setBody

	/**
	 * ������ ��ī�� ��ü�� ������ ��ü ������ ��ȯ�ϴ� ��.
	 * 
	 * @return body ��ü�� ����
	 */
	public int getBody() {
		return body;
	} // getBody

	/**
	 * ������ ��ī�� ��ü�� ������ �����ϴ� ��.
	 * 
	 * @param color ��ī�� ������ ����
	 */
	public void setColor(String color) {
		this.color = color;
	} // setColor

	/**
	 * ������ ��ī�� ��ü�� ������ ������ ��ȯ�ϴ� ��.
	 * 
	 * @return color ��ī�� ���� ��ȯ
	 */
	public String getColor() {
		return color;
	}

	/**
	 * ĥ�ǿ� ������ ��ī�� ��ü�� ����Ͽ� "�ȳ��ϼ���?"�� ���� �� ����
	 * 
	 * @return message
	 */
	public String write() {
		return color + " �� ��ī������ \"�ȳ��ϼ���?\" �� ĥ�ǿ� ����.";
	} // write

	/**
	 * "ĥ�ǿ� ������ ��ī�� ��ü�� ����Ͽ� �Էµ� �޼����� ���� �� ����
	 * 
	 * @param msg ĥ�ǿ� ����� �޼���
	 * @return �޼���
	 */
	public String write(String msg) {
		return color + "�� ��ī������ \"" + msg + "\"�� ĥ�ǿ� ����.";
	} // write

} // class
