package javastandard.oop.inheritance;

/**
 * 상속이란 : 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
 * 
 * 코드의 재사용성을 높이고 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.
 *
 *사용범 : class 자식 클래스 명 extends 상속받을 부모 클래스명
 */
class Tv{
	boolean power;
	int channel;
	
	void poewr() { power =! power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
} //Tv

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvEx {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		//CpationTv의 객체를 생성했지만 extends를 통해 TV의 instance variable, method를 상속 받아 사용할 수 있다.
		ctv.channel = 8;
		ctv.channelUp();
		System.out.println(ctv.channel);
		// CaptionTv에 존재하는 caption은 현재 기본 초기화 되어 false인 상태이기에 메소드 실행이 되질 않았다.
		ctv.displayCaption("hello"); 
		ctv.caption = true; 
		System.out.println("hello");
	}

}
