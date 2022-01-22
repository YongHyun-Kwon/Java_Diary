package javastandard.oop.abstractclass;

/**
 * 추상클래스(abstract class)<br>
 * 정의<br>
 * 한개 이상의 추상method를 가지는 class<br>
 * 일반적인 클레스는 세부적이고, 구체적이다.<br>
 * 하지만 추상클래스는 일반클래스에 비해 구체적이지 않고 추상적이다.<br>
 * 목적<br>
 * 추상method는 선언만되고 구현이 되지 않은 불완전한 method이므로 객체로 생성되어서는 안된다.<br>
 * 이런 class는 abstract class 로선언하여 객체 생성을 금지 시킨다.<br>
 * 
 * 추상클래스는 반드시 하나 이상의 추상 method를 가지며 객체를 생성할 수 없다. 하지만 super class로는 사용할 수
 * 있다.<br>
 * 추상mehotd를 사용하기 위해서는 반드시 해당 method를 재정의 해야한다.
 * 
 * @author 82109
 */
public class AbstractTest {

	public static void maint(String[] args) {

		FirstDog fd = new FirstDog();
		SecondDog sd = new SecondDog();

		fd.call();
		sd.call();
		fd.call2();
		sd.call2();

	} // main

} // class

abstract class Dog { // 추상 method를 포함하므로 추상클래스로 선언
	abstract void call();// 추상method는 구현하지 않는다.

	void call2() {
		System.out.println("일반 method");
	}
}

// Dog 추상 class를 상속한 클래스들
class FirstDog extends Dog {
	void call() { // 추상method는 sub class에서 반드시 재정의 되어야하ㄴ다.
		System.out.println("첫번째 멍멍이");
	}
}

class SecondDog extends Dog {
	void call() {
		System.out.println("두번째 멍멍이");
	}
}
