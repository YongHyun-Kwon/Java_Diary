package javastandard.oop.overriding;

class Parent {
	void parentMethod() {}
}

class Child extends Parent{
	void parentMethod() {}// 오버라이딩
	void parentMethod(int x) {} //오버로딩
	
	void childMethod() {}
	void childMethod(int x) {} //오버 로딩
}

public class OverlodingRiding {
	/*
	 * 오버라이딩이란?
	 * 조상클래스로부터 상속받은 method의 내용을 변경하는 것
	 * 상속받은 method를 그대로 사용하기도 하지만 자식 class의 기능에 맞게 변경해야할 때도 있다.
	 * 이럴 경우 조상의 method를 overriding한다.
	 * 
	 * 오버라이딩의 조건
	 * 자손클래스에서 오버라딩하는 method는 조상 class의 method와
	 * 이름이 같아야하고, 매개변수가 같아야하며, 반환 타입이 같아야한다.
	 * 
	 * 접근제어자는 조상 클래스의 method보다 좁은 범위로 변경 불가
	 * -> 조상 method의 접근제어자가 protected라면 overriding의 method는 protected거나 public이여한다)
	 * 예외는 조상클래스의 method보다 많이 선언할 수 없다.
	 * instancemethod를 static method로 또는 그 반대로 변경이 불가능하다. 
	 * 
	 */

	public static void main(String[] args) {

	}

}
