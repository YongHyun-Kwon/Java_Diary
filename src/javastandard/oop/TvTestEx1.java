package javastandard.oop;

class MyTv {
	// Tv의 속성 tv라는 하나의 설계도를 만든 것과 같다

	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

/**
 * member 변수는 따로 초기화 하지 않아도 이미 초기화가 되어있다. 
 * 정수형 초기화 값 : 0        출력값 : 0
 * 문자형 초기화 값 : \u0000   출력값 : 공백
 * 실수형 초기화 값 : 0.0      출력값 : 0.0
 * 불린형 초기화 값 : false    출력값 : false 
 * 참조형 초기화 값 : null     출력값 : null
 *
 */
public class TvTestEx1 {

	public static void main(String[] args) {
		// 아래 객체를 생성하는 코드를 보면 String, Array, Scanner등을 선언할 때와 동일하다.
		// 이것은 String, Array, Scanner 등이 전부 클래스라는 것을 알 수 있다.
		MyTv tv1 = new MyTv(); // tv라는 데이터형 tv1을 변수로 선언 하고 new TV()를 통해 생성
		MyTv tv2 = new MyTv();

		tv1.channel = 7; // tv1의 채널 값을 7로 설정
		tv2.channel = 6; // tv2의 채널 값을 6으로 설정

		System.out.println("tv1의 채널은 : " + tv1.channel);
		System.out.println("tv2의 채널은 : " + tv2.channel);

		tv1.channelUp();
		tv2.channelDown();

		System.out.println("tv1의 채널은 : " + tv1.channel);
		System.out.println("tv2의 채널은 : " + tv2.channel);

		tv1 = tv2; // tv2에 저장된 모든 값이 tv1에 대입 된다. 이렇게 되면 t1이 원래 참조하고 인스턴스는 사용이 불가하다

		System.out.println("tv1의 채널은 : " + tv1.channel);
		System.out.println("tv2의 채널은 : " + tv2.channel);

	} // main

} // class
