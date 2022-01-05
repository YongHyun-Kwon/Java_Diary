package javastandard.oop;

/**
 * 많은 수의 객체를 다뤄야 할 때 배열로 다루면 편리하다.<br>
 * 
 * 객체역시 배열로 다룰 수 있으며 이를 객체 배열이라고 한다.<br>
 * 
 * 다만 객체배열안에 객체가 저장되는 것이 아닌 개체의 주소가 저장되는 점만 명심하자<br>
 *
 */
public class TvTestEx2 {

	public static void main(String[] args) {
		TvTest[] tvArr = new TvTest[3]; // 길이가 3인 객체 배열
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new TvTest();
			tvArr[i].channel = i + 10;
		} // end for
		
		for(int i = 0; i < tvArr.length; i++){
			System.out.println(tvArr[i].channel);
		} // end for
	} // main
} // class
	class TvTest{ // oop라는 패키지 안에서 이미 Tv라는 class 를 생성했기에 같은 Tv명을 사용하지 못한다.
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



