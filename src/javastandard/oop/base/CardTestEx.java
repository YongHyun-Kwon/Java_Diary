package javastandard.oop.base;

class Card{
	
	String kind; // 카드의 무늬
	int number; // 카드의 숫자
	
	// static으로 member변수를 선언했을 때는 card1, card2 등 생성한 많은 객체들은 공용으로 폭과 넓이를 사용하게 된다.
	static int width = 100; // 폭 
	static int height = 250; // 높이
}

public class CardTestEx {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "clover";
		c2.kind = "spade";
		
		c1.number = 4;
		c2.number = 7;
		
		System.out.println("c1의 카드 모양은 : " + c1.kind + ", c1의 카드 숫자는 : " + c1.number
//				+ ", c1의 카드 폭은 : "  + c1.width + ", c1의 카드 높이는 : " + c1.height ); 
		// 여기서 static으로 선언된 클래스 변수를 instance 변수처럼 사용할 수 있으나 자바에서는 권장하지 않는다고 표기한다.
		// class 변수는 하나의 클래스에서 모두 공통으로 사용하는 값이기 때문에 아래와 같이 사용하는 것이 옭다.
				+ ", c1의 카드 폭은 : "  + Card.width + ", c1의 카드 높이는 : " + Card.height ); 
		System.out.println("c2의 카드 모양은 : " + c2.kind + ", c1의 카드 숫자는 : " + c2.number
				+ ", c2의 카드 폭은 : "  + Card.width + ", c2의 카드 높이는 : " + Card.height ); 
		
		Card.width = 50;
		Card.height = 100;
		
		// 이처럼 class 변수는 모든 객체에 동일하게 값이 편성된다.
		System.out.println("c1의 카드 모양은 : " + c1.kind + ", c1의 카드 숫자는 : " + c1.number
				+ ", c1의 카드 폭은 : "  + Card.width + ", c1의 카드 높이는 : " + Card.height ); 
		System.out.println("c2의 카드 모양은 : " + c2.kind + ", c1의 카드 숫자는 : " + c2.number
				+ ", c2의 카드 폭은 : "  + Card.width + ", c2의 카드 높이는 : " + Card.height ); 
		
		

	} // main

} // class
