package javastandard.oop.usemethod;

/**
 * static method : 인스턴스 변수를 사용하지 않고 입력된 값으로만 업무를 처리할 때
 */
public class StaticMethod {
	// 1. 메소드 정의
	public static void test() {
		System.out.println("static method 호출");
	}

	public static void main(String[] args) {
		//호출
		StaticMethod.test();

	} // main

} // class
