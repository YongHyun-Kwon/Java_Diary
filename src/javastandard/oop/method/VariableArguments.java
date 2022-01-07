package javastandard.oop.usemethod;

/**
 * 가변인수의 사용.
 * 
 */
public class VariableArguments {

	/**
	 * Variable Arguments를 사용한 method로 JDK 1.5이상에서 부터 사용할 수 있다. V.A는 method 내부에서
	 * 배열(주소를 가지고 있는 참조형 데이터형)로 사용된다.
	 * 
	 * @param param
	 */
	public void useVA(int... param) {
//		System.out.println(param);// 참조형 데이터형은 주소가 출력
		for (int i = 0; i < param.length; i++) {
			System.out.print(param[i] + " ");
		} // end forF
		System.out.println();
	} // end method
	
//	public void useVA2(int ... paramI, int ...param) { // V.A는 가장 마지막 parameter로만 정의된다.
	public void useVA2(int paramI, int ...paramJ) { 
		System.out.println(paramI);
		System.out.println(paramJ);
		
	} // use VA2

	public static void main(String[] args) {
		// 객체화 : 인스턴스 method나 변수를 사용하기 위해

		VariableArguments uva = new VariableArguments();
		uva.useVA();
		System.out.println("------------------------------------");
		uva.useVA(1);
		System.out.println("------------------------------------");
		uva.useVA(1, 2, 43, 5, 10, 100, 6000); // 동일 형으로 n개의 값을 넣을 수 있다.
//		uva.useVA(1, "2"); // 데이터 형이 다르면 error
		System.out.println("------------------------------------");
//		uva.useVA2(1, 1,2,3,4);
//		uva.useVA2(); int형은 반드시 값이 입력되어야한다. V.A는 생략 가능
		

	} // main

} // class
