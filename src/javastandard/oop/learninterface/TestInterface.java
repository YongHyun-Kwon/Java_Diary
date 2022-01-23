package javastandard.oop.learninterface;

public interface TestInterface {
//	int i; // instance variable을 가질 수 없다.
	public static final int i = 100;

//	public TestInterface() {} //생성자를 가질 수 없다. = > 객체 생성 불가능

//	public void test() {} // 일반 method를 가질 수 없다. = > 일을 할 수 없다.

	public void test(); // abstract이 없는 abstract method

	public abstract String test(int i); // abstract이 있는 abstract method

	public default String temp() {
		return "JDK1.8에서 부터 추가된 defualt method";
	} // end

}
