package javastandard.oop.inheritance;

public class DeckEx {

	public static void main(String[] args) {
		Deck d = new Deck(); // ī�� �ѹ��� �����.
		Card c = d.pick(0); // ���� �� ���� ���� ī�带 �̴´�.
		System.out.println(c);
		
		d.shuffle(); // ī�带 ���´�.
		c=d.pick(0); // ���� �� ���� ���� ī�带 �̴´�.
		System.out.println(c);
	} // main

} // class

class Deck {
	final int CARD_NUM = 52; // ��Ŀ ī���� ����;
	Card cardArr[] = new Card[CARD_NUM]; // Card ��ü �迭�� ����
	
	Deck () { // Deck�� ī�带 �ʱ�ȭ
		int i = 0;
		
		for(int k = Card.KiND_MAX; k > 0; k--) 
			for(int n = 0; n < Card.NUM_MAX; n ++) 
				cardArr[i++] = new Card(k, n+1);
		}
	
		Card pick(int index) { // ������ ��ġ(index)�� �ִ� ī�带 ������ ��ȯ;
			return cardArr[index];
		}
		
		Card pick() { // Deck���� ī�� �ϳ��� �����Ѵ�.
			int index = (int)(Math.random()* CARD_NUM);
			return pick(index);
		}
		
		void shuffle() { // ī���� ������ ���´�.
			for(int i = 0; i < cardArr.length; i ++) {
				int r = (int)(Math.random() * CARD_NUM);
				
				Card temp = cardArr[i];
				cardArr[i] = cardArr[r];
				cardArr[r] = temp;
			}
		}
		
		
	}

class Card {
	static final int KiND_MAX = 4; // ī�� ���� ��
	static final int NUM_MAX = 13; // ���̺� ī�� ��
	
	static final int SPADE = 4;
	static final int DiAMOND = 3;
	static final int HEART = 2;
	static final int CLOVAER = 1;
	int kind;
	int number;
	
	Card(){
		this(SPADE, 1);
	}
	
	Card(int kind, int number){
		this.kind =kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String number = "0123456789XJQK";
		
		return "kind : " + kinds[this.kind] + ", number : " + number.charAt(this.number);
	}
}