package javastandard.oop.learninterface;

/**
 * 인터페이스를 구현하는 자식클래스에서는 구현 인터페이스의 모든
 * 
 *  abstract method를 Override해야한다.
 * 
 * @author user
 */
public class TestClmpl implements TestC {

	@Override
	public void testA() { // TestA 인터페이스의 abstract method

	}// testA

	@Override
	public void testB() { // TestB 인터페이스의 abstract method

	} // testB

	@Override
	public void testC() {

	} // testC

}
