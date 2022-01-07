package javastandard.oop.base;

/**
 * 받은 parameter와 반환 하는 type이 없을때는 void로 선언이 가능하다.<br>
 * 
 * MethodEx1이라는 클래스안에 속해있는 method이기 때문에 class object를 생성한후<br>
 *
 * print99danAll() 괄호를 붙여서 호출을 해줘야 Method가 실행된다.<br>
 * 
 * Method드는 다른말로 function, 함수라고 칭한다.
 */
public class GuGudanEx1 {

	static void print99danAll() { // static으로 선언하면 객체를 생성하지 않아도 호출이 가능하다.
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d ", i, j, i * j);
			} // end for j
			System.out.println();
		} // end for i
	} // end method

	public static void main(String[] args) {

		print99danAll();

	} // main

} // class
