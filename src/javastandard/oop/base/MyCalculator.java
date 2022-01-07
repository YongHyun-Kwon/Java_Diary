package javastandard.oop.base;

/**
 * ��ȯ ���� �ִ� ��� return���� ��ȯ ���� ȣ���� method�� ���� �ؾ� �Ѵ�.<br>
 * 
 *  ���� ���� ������ ���� �Ҽ� �ִ� �Ű������ʹ� �޸� return�� �� �ϳ��� ���� ��ȯ�Ѵ�.
 */
public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		System.out.println(c1.add(5, 3));
		System.out.println(c1.subtract(5, 3));
		System.out.println(c1.multiply(5, 3));
		System.out.println(c1.divide(5, 3));

	} // main

} // class

class Calculator{
	long add(long a, long b) {
		return a + b;
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a*b;
	}
	double divide(double a, double b) {
		return a/b;
	}
} // class
