package javastandard.oop.learninterface;

/**
 * ����� ������� ��ü�𵨸� �Ͽ� �ۼ��� Ŭ����.<br>
 * 
 * 01-17-2022 Person class�� �߻�Ŭ������ ����.<br>
 * 
 * ����� : ��, ��, ��, �̸� ������ : �Դ��� ( ��� ����� �Դ� ���� ������ �� �ٸ��� �Դ´�. => �θ�Ŭ�������� ������ �ʿ䰡
 * ����. => �߻� method)
 * 
 * @author user
 */
public abstract class Person {

	private String name; // �̸�
	private int eye; // ��
	private int nose; // ��
	private int mouth; // ��

	/**
	 * �����ü�� ������ �� �⺻������ ������ �־���� �� �����ϴ� �⺻ ������<br>
	 * �� 2��, �� 1��, �� 1��
	 */
	public Person() {
		// �����ü�� ������ �� �⺻������ ������ �־���� �� ����
		this(2, 1, 1); // 01-13-2022�� �����ڸ� ȣ���ϴ� �ڵ�� ����.
//		eye = 2;
//		nose = 1;
//		mouth = 1;
	} // Person

	/**
	 * ��, ��, ���� ������ �ٸ� ��� ��ü�� ������ �� ����ϴ� ������.( Overload�� ������ )
	 * 
	 * @param eye
	 * @param nose
	 * @param mouth
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
	} // Person

	/**
	 * setter method : �Էµ� ���� instance variable�� �����ϴ� ��. ������ ��� ��ü�� �̸�
	 * 
	 * @param name ������ ��ü�� �̸�
	 */
	public void setName(String name) {
		this.name = name;
	} // setName

	/**
	 * getter method : ��ü�� ������ �ִ� instance variable�� ���� ��� �� ������ ��� ��ü�� ������ �ִ� name
	 * instance variable�� ���� ��� ��
	 * 
	 * @return ��ü�� �̸�
	 */
	public String getName() {
		return name;
	} // getName

	/**
	 * setter method ������ ��� ��ü�� ���� ������ �����ϴ� ��
	 * 
	 * @param eye ������ ���� ����
	 */
	public void setEye(int eye) {
		this.eye = eye;
	} // setEye

	/**
	 * ������ ��� ��ü�� ������ �ִ� eye ������ ���� ��� ��
	 * 
	 * @return ��ü�� ���� ����
	 */
	public int getEye() {
		return eye;
	} // getEye

	/**
	 * ������ ��� ��ü�� ���� ������ �����ϴ� ��
	 * 
	 * @param nose ������ ���� ����
	 */
	public void setNose(int nose) {
		this.nose = nose;
	} // setNose

	/**
	 * ������ ��� ��ü�� ������ �ִ� nose ������ ���� ��� ��
	 * 
	 * @return ��ü�� �ڿ� ����.
	 */
	public int getNose() {
		return nose;
	} // getNose

	/**
	 * ������ �����ü�� ���� ������ �����ϴ� ��
	 * 
	 * @param moouth ������ ���� ����
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	} // setMouth

	/**
	 * ������ ��� ��ü�� ������ �ִ� mouth instance variable�� ���� ��� ��
	 * 
	 * @return ��ü�� ���� ����.
	 */
	public int getMouth() {
		return mouth;
	} // getMouth

	/**
	 * �������� Ư¡ ����. ������ ��� ��ü�� ������ ���� �Դ� ��.
	 * 
	 * @return �Դ� ��
	 */
	public abstract String eat();

	/**
	 * ������ ��� ��ü�� �ۿ��� ������ ��Դ� ��.
	 * 
	 * @param menu  ��������
	 * @param price ���� ��
	 * @return �ۿ��� ��Դ� ��
	 */
	public abstract String eat(String menu, int price);

} // class
