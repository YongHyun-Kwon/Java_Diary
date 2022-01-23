package javastandard.oop.learninterface;

/**
 * 사람을 대상으로 객체모델링 하여 작성한 클래스.<br>
 * 
 * 01-17-2022 Person class를 추상클래스로 수정.<br>
 * 
 * 명사적 : 눈, 코, 입, 이름 동사적 : 먹는일 ( 모든 사람이 먹는 일은 하지만 다 다른걸 먹는다. => 부모클래스에서 구현할 필요가
 * 없음. => 추상 method)
 * 
 * @author user
 */
public abstract class Person {

	private String name; // 이름
	private int eye; // 눈
	private int nose; // 코
	private int mouth; // 입

	/**
	 * 사람객체가 생설될 때 기본적으로 가지고 있어야할 값 설정하는 기본 생성자<br>
	 * 눈 2개, 코 1개, 입 1개
	 */
	public Person() {
		// 사람객체가 생성될 때 기본적으로 가지고 있어야할 값 설정
		this(2, 1, 1); // 01-13-2022년 생성자를 호출하는 코드로 변경.
//		eye = 2;
//		nose = 1;
//		mouth = 1;
	} // Person

	/**
	 * 눈, 코, 입의 갯수가 다른 사람 객체를 생성할 때 사용하는 생성자.( Overload된 생성자 )
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
	 * setter method : 입력된 값을 instance variable에 설정하는 일. 생성된 사람 객체의 이름
	 * 
	 * @param name 설정할 객체의 이름
	 */
	public void setName(String name) {
		this.name = name;
	} // setName

	/**
	 * getter method : 객체가 가지고 있는 instance variable의 값을 얻는 일 생성된 사람 객체가 가지고 있는 name
	 * instance variable에 값을 얻는 일
	 * 
	 * @return 객체의 이름
	 */
	public String getName() {
		return name;
	} // getName

	/**
	 * setter method 생성된 사람 객체에 눈의 개수를 설정하는 일
	 * 
	 * @param eye 설정할 눈의 갯수
	 */
	public void setEye(int eye) {
		this.eye = eye;
	} // setEye

	/**
	 * 생성된 사람 객체가 가지고 있는 eye 변수에 값을 얻는 일
	 * 
	 * @return 객체의 눈의 갯수
	 */
	public int getEye() {
		return eye;
	} // getEye

	/**
	 * 생성된 사람 객체에 코의 갯수를 설정하는 일
	 * 
	 * @param nose 설정할 코의 갯수
	 */
	public void setNose(int nose) {
		this.nose = nose;
	} // setNose

	/**
	 * 생성된 사람 객체가 가지고 있는 nose 변수에 값을 얻는 일
	 * 
	 * @return 객체의 코에 갯수.
	 */
	public int getNose() {
		return nose;
	} // getNose

	/**
	 * 생성된 사람객체에 입의 갯수를 설정하는 일
	 * 
	 * @param moouth 설정할 입의 갯수
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	} // setMouth

	/**
	 * 생성된 사람 객체가 가지고 있는 mouth instance variable에 값을 얻는 일
	 * 
	 * @return 객체의 입의 갯수.
	 */
	public int getMouth() {
		return mouth;
	} // getMouth

	/**
	 * 동사적인 특징 구현. 생성된 사람 객체가 집에서 밥을 먹는 일.
	 * 
	 * @return 먹는 일
	 */
	public abstract String eat();

	/**
	 * 생성된 사람 객체가 밖에서 음식을 사먹는 일.
	 * 
	 * @param menu  음식종류
	 * @param price 음식 값
	 * @return 밖에서 사먹는 일
	 */
	public abstract String eat(String menu, int price);

} // class
