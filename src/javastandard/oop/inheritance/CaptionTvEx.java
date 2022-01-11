package javastandard.oop.inheritance;

/**
 * ����̶� : ������ Ŭ������ �����Ͽ� ���ο� Ŭ������ �ۼ��ϴ� ���̴�.
 * 
 * �ڵ��� ���뼺�� ���̰� �ڵ��� �ߺ��� �����Ͽ� ���α׷��� ���꼺�� ���������� ũ�� �⿩�Ѵ�.
 *
 *���� : class �ڽ� Ŭ���� �� extends ��ӹ��� �θ� Ŭ������
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
		
		//CpationTv�� ��ü�� ���������� extends�� ���� TV�� instance variable, method�� ��� �޾� ����� �� �ִ�.
		ctv.channel = 8;
		ctv.channelUp();
		System.out.println(ctv.channel);
		// CaptionTv�� �����ϴ� caption�� ���� �⺻ �ʱ�ȭ �Ǿ� false�� �����̱⿡ �޼ҵ� ������ ���� �ʾҴ�.
		ctv.displayCaption("hello"); 
		ctv.caption = true; 
		System.out.println("hello");
	}

}
