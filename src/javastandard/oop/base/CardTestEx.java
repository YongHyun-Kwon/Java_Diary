package javastandard.oop.base;

class Card{
	
	String kind; // ī���� ����
	int number; // ī���� ����
	
	// static���� member������ �������� ���� card1, card2 �� ������ ���� ��ü���� �������� ���� ���̸� ����ϰ� �ȴ�.
	static int width = 100; // �� 
	static int height = 250; // ����
}

public class CardTestEx {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "clover";
		c2.kind = "spade";
		
		c1.number = 4;
		c2.number = 7;
		
		System.out.println("c1�� ī�� ����� : " + c1.kind + ", c1�� ī�� ���ڴ� : " + c1.number
//				+ ", c1�� ī�� ���� : "  + c1.width + ", c1�� ī�� ���̴� : " + c1.height ); 
		// ���⼭ static���� ����� Ŭ���� ������ instance ����ó�� ����� �� ������ �ڹٿ����� �������� �ʴ´ٰ� ǥ���Ѵ�.
		// class ������ �ϳ��� Ŭ�������� ��� �������� ����ϴ� ���̱� ������ �Ʒ��� ���� ����ϴ� ���� �Ĵ�.
				+ ", c1�� ī�� ���� : "  + Card.width + ", c1�� ī�� ���̴� : " + Card.height ); 
		System.out.println("c2�� ī�� ����� : " + c2.kind + ", c1�� ī�� ���ڴ� : " + c2.number
				+ ", c2�� ī�� ���� : "  + Card.width + ", c2�� ī�� ���̴� : " + Card.height ); 
		
		Card.width = 50;
		Card.height = 100;
		
		// ��ó�� class ������ ��� ��ü�� �����ϰ� ���� ���ȴ�.
		System.out.println("c1�� ī�� ����� : " + c1.kind + ", c1�� ī�� ���ڴ� : " + c1.number
				+ ", c1�� ī�� ���� : "  + Card.width + ", c1�� ī�� ���̴� : " + Card.height ); 
		System.out.println("c2�� ī�� ����� : " + c2.kind + ", c1�� ī�� ���ڴ� : " + c2.number
				+ ", c2�� ī�� ���� : "  + Card.width + ", c2�� ī�� ���̴� : " + Card.height ); 
		
		

	} // main

} // class
