package javastandard.oop.base;

/**
 * 반환 값이 있는 경우 return으로 반환 값을 호출한 method로 전달 해야 한다.<br>
 * 
 *  여러 개의 변수를 선언 할수 있는 매개변수와는 달리 return은 단 하나의 값만 반환한다.
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
