package javastandard.oop;

/**
 * ���� ���� ��ü�� �ٷ�� �� �� �迭�� �ٷ�� ���ϴ�.<br>
 * 
 * ��ü���� �迭�� �ٷ� �� ������ �̸� ��ü �迭�̶�� �Ѵ�.<br>
 * 
 * �ٸ� ��ü�迭�ȿ� ��ü�� ����Ǵ� ���� �ƴ� ��ü�� �ּҰ� ����Ǵ� ���� �������<br>
 *
 */
public class TvTestEx2 {

	public static void main(String[] args) {
		TvTest[] tvArr = new TvTest[3]; // ���̰� 3�� ��ü �迭
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new TvTest();
			tvArr[i].channel = i + 10;
		} // end for
		
		for(int i = 0; i < tvArr.length; i++){
			System.out.println(tvArr[i].channel);
		} // end for
	} // main
} // class
	class TvTest{ // oop��� ��Ű�� �ȿ��� �̹� Tv��� class �� �����߱⿡ ���� Tv���� ������� ���Ѵ�.
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



