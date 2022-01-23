package javastandard.oop.learninterface;

/**
 * interface를 구현(implements)한 클래스
 * 
 * @author user
 *
 */
public class TestInterfaceImple implements TestInterface {

	@Override
	public void test() {
		System.out.println("Override 한 test method");
	}

	@Override
	public String test(int i) {
		return String.valueOf(i);
	}

	public static void main(String[] args) {
		// 인터페이스는 객체화가 되지 않는다.
//		TestInterface ti = new TestInterface();
		// default method는 static method가 아니므로 직접 호출할 수 없다.
//		TestInterface.temp();

		// 자식클래스의 객체화.(interface의 default method와 Override한 method 모두 사용가능)
		TestInterfaceImple tii = new TestInterfaceImple();
		System.out.println(tii.temp()); // default method
		tii.test(); // Override
		System.out.println(tii.test(2022)); // Override

		System.out.println("--------------------------------------------");
		// is a 관계의 객체화 interface의 default method와 Override한 method만 사용 가능
		TestInterface ti = new TestInterfaceImple();
		System.out.println(tii.temp()); // default method
		tii.test(); // Override
		System.out.println(tii.test(17)); // Override

	} // main

} // class
