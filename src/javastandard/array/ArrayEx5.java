package javastandard.array;

public class ArrayEx5 {

	public static void main(String[] args) {

		// 배열의 인자를 섞어 보기(카드게임, 로또번호 뽑기 등으로 응용 가능)

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i] + " ");
		} // end for

		System.out.println();

		for (int i = 0; i < 100; i++) { // 100번 shuffle
			int n = (int) (Math.random() * 10); // 0~9값의 숫자로 초기화
			int tmp = numArr[0]; // tmp는 numArr의 첫번째 자리로 초기화
			numArr[0] = numArr[n]; // random함수로 나온 0~9사이의 index로 저장
			numArr[n] = tmp; // tmp의 값을 n자리에 저장

		} // end for
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		} // end for
		
		System.out.println("\n-------------------");
		
		// 로또 생성기
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i;
		}
		
		int temp = 0; // 값을 바꾸기 위해 사용할 변수
		int ranNum = 0; // 랜덤한 값을 저장할 변수
		
		// 앞의 6자리만 섞어서 출력할 것이기에 6번만 반복하면 된다.
		for(int i = 0; i < 6; i++) {
			ranNum = (int)(Math.random() * 45);  // 0~44범위의 값을 얻는다.

			temp = ball[i]; 
			ball[i] = ball[ranNum];
			ball[ranNum] = temp;	
		} // end for
		
		// 6자리 로또 번호 추첨
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		} // end for

	} // main

} // class
