package javastandard.oop.learninterface;

/**
 * 2. 인터페이스를 구현화.
 * @author user
 */
public class TestAimpl implements TestA {

	@Override
	public void testA() {
		System.out.println("인터페이스를 구현한 클래스의 testAmethod");
	} // testA

} // class
