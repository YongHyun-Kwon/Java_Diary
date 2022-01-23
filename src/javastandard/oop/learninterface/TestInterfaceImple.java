package javastandard.oop.learninterface;

/**
 * interface�� ����(implements)�� Ŭ����
 * 
 * @author user
 *
 */
public class TestInterfaceImple implements TestInterface {

	@Override
	public void test() {
		System.out.println("Override �� test method");
	}

	@Override
	public String test(int i) {
		return String.valueOf(i);
	}

	public static void main(String[] args) {
		// �������̽��� ��üȭ�� ���� �ʴ´�.
//		TestInterface ti = new TestInterface();
		// default method�� static method�� �ƴϹǷ� ���� ȣ���� �� ����.
//		TestInterface.temp();

		// �ڽ�Ŭ������ ��üȭ.(interface�� default method�� Override�� method ��� ��밡��)
		TestInterfaceImple tii = new TestInterfaceImple();
		System.out.println(tii.temp()); // default method
		tii.test(); // Override
		System.out.println(tii.test(2022)); // Override

		System.out.println("--------------------------------------------");
		// is a ������ ��üȭ interface�� default method�� Override�� method�� ��� ����
		TestInterface ti = new TestInterfaceImple();
		System.out.println(tii.temp()); // default method
		tii.test(); // Override
		System.out.println(tii.test(17)); // Override

	} // main

} // class
