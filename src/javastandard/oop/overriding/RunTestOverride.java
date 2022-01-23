package javastandard.oop.overriding;

import java.util.Date;

public class RunTestOverride {
	
	@Override
	
	public String toString() {
		return "객체가 출력될 때 주소가 아닌 다른 메세지 출력하도록 설정 " +  super.toString();
	}

	public static void main(String[] args) {

		// 상속 관계의 객체화 : 자식클래스를 생성하여 부모클래스에 저장한다. - 부모클래스의 자원만 사용 가능.
		// 부모클래스명 객체명 = new 자식클래스생성자();
		TestOverrideSuper tos = new TestOverrideSub();
		tos.test(); // 부모에만 정의된 method
		tos.temp(); // Override 된 method : 자식클래스가 Overrid한 method가 최우선적으로 호출.
//		tos.sub();  // 자식클래스가 가진 자원은 사용할 수 없다.
		
		System.out.println("--------------------------------------");
		
		// 자식클래스로 객체화 : 부모클래스의 모든 자원과 자식클래스의 모든 자원을 사용할 수 있다.
		TestOverrideSub tos2 = new TestOverrideSub();
		tos2.test(); // 코드의 재사용성
		tos2.sub(); // 자식클래스가 가진 method
		tos2.temp(); // 자식클래스가 부모클래스 ㅡmethod를 Override한 method
		
		System.out.println("--------------------------------------");
		
		RunTestOverride rto = new RunTestOverride(); 
		System.out.println(rto.toString()); // heap 주소
		
		String str = new String("오늘은 월요일 입니다.");
		System.out.println(str.toString()); // 메시지 출력
		
		Date date = new Date();
		System.out.println( date.toString() ); // 메시지
		
		System.out.println(tos2.toString()); // heap 주소

	}// main

} // class
