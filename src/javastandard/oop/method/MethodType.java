package javastandard.oop.usemethod;

/**
 * method의 4가지 형태와 호출.
 */
public class MethodType {
	
	/**
	 * 고정일( 반환형 없고, 매개변수 없는 형) 형태의 Method
	 */
	public void typeA() {
		System.out.println("고정일 : 호출을 하더라도 항상 같은 일을 수행한다.");
	} // typeaA

	/**
	 * 가변 일( 반환 형이 없고, 매개변수 있는 형) 형태의 method. <br>
	 * 입력되는 값으로 동적인 일을 수행 할 수 있다.<br>
	 *  @param i
	 */
	public void typeB(int i) {
		System.out.println("가변일 : 입력값에 따라 다른 일을 수행한다. " + i);
	}//typeB
	
	/**
	 * 고정 값(반환형 있고, 매개변수 없는 형) 형태의 method.<br>
	 * 항상 같은 값이 반환 된다.
	 * @return 올해인 2022가 반환
	 */
	public int typeC() {
		int i = 2022;
		return i;
	} // typeC
	
	/**
	 * 가변 값 ( 반환형 있고, 매개변수 있는 형) 형태의 method.<br>
	 * 매개변수에 따라 다른 결과가 반환 된다.<br>
	 * @param d 실수형의 입력 값
	 * @return 정수의 반환 값
	 */
	public int typeD(double d) {
		
		return (int) d;
	}
	
	
	
	
	public static void main(String[] args) {
		
		// 객체화 : 인스턴스 변수나 인스턴스 method를 사용하기 위해서 반드시 필요한 작업
		MethodType tmt = new MethodType();
		tmt.typeA(); // 고정 일
//		tmt.typeA();
//		tmt.typeA();
//		tmt.typeA();
//		tmt.typeA();
		
		tmt.typeB(0); // 가변 일
//		tmt.typeB(10);
//		tmt.typeB(100);
		

		int value = tmt.typeC(); // 고정 값. 처리결과를 변수에 저장
		System.out.println("고정 값 : 호출하면 항상 같은 값이 반환된다. " + value);
//		int value2 = tmt.typeC();
//		System.out.println("고정 값 : 호출하면 항상 같은 값이 반환된다. " + value2);
		
		int value3 = tmt.typeD(2022.0106);
		System.out.println("가변 값 : 매개변수에 따라 호출했을 때 다른 값이 반환된다. " + value3);
		int value4 = tmt.typeD(2021.0106);
		System.out.println("가변 값 : 매개변수에 따라 호출했을 때 다른 값이 반환된다. " + value4);
		
	} // main

} // class
