package javastandard.oop.learnclass;

public class UseMaker {

	public static void main(String[] args) {

		// 4. 마카펜 클래스를 사용하여 검은색 마카펜 생성.
		Maker black = new Maker(); // 참조 형 데이터 형을 생성
		System.out.println(black);
		// black객체에 뚜겅 1개, 몸체 1개, 검은색을 설정해보자
		// black.cap = 1; // instance 변수에 private 접근지정자가 선언되어 있어 외부에서 절대로 접근할 수 없다.

		// 밑의 코드 처럼 instance변수의 값을 초기화 시켜주지 않으면 자동 초기화된 값으로 설정되기 때문에 모순이 생긴다.
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("검은");
		
		// 생성자를 추가한 후 따로 초기화 하지 않고 객체
		
		System.out.println(black.getColor() + "색인 마카펜의 뚜껑 :" + black.getCap() + "개, 몸체 :"
				+ black.getBody()+ "개");
		
		// 5. 마카펜 클래스가 제공하는 기능 사용
		System.out.println(black.write());
		
		// 빨간색 마카펜을 생성하여 값을 넣고 사용
		Maker red = new Maker();
		red.setCap(2);
		red.setBody(2);
		red.setColor("빨강");
		System.out.println(red.getColor() + "색인 마카펜의 뚜껑 :" + red.getCap() + "개, 몸체 :"
				+ red.getBody()+ "개");
		System.out.println(red.write("안녕"));

	} // main

} // class
