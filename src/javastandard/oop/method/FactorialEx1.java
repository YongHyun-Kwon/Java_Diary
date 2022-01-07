package javastandard.oop.usemethod;

/**
 * method 내부에서 method 자신을 다시 호출하는 것을 재귀호출(recursive call) 이라 칭하며<br>
 * 재귀호출을 하는 method를 재귀 메소드라고 한다.
 *
 */
public class FactorialEx1 {

	public static void main(String[] args) {
		
		FactorialEx1 fe = new FactorialEx1();
		
		System.out.println(fe.factorial(4));
		

	}
	
	public int factorial(int n) { // 가변 값 반환인자 있고 매개변수 있는 method
		int result = 0;
		if(n==1) {
			result = 1;	
		} else {
			result = n * factorial(n-1);		
		}
		return result;
	}

}
