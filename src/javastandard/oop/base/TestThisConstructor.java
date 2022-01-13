package javastandard.oop.base;

/**
 * this()를 사용한 생성자 호출
 * @author user
 */
public class TestThisConstructor {
	
	public TestThisConstructor() {
		this(1); 
		System.out.println("default 생성자");
	} //TestThisConstructor
	public TestThisConstructor(int i) {
//		this();
		System.out.println("Overload된 생성자");
		// this()//생성자의 첫번째 줄에서만 기술할 수 있다.
	} // TestThisConstructor
	

	public static void main(String[] args) {
		
//		new TestThisConstructor();
		new TestThisConstructor(13);

	} // main

} //class
