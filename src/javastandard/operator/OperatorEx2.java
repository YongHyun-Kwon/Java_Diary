package javastandard.operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 4;
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d / %f = %f\n", a, (float)b, a / (float)b);
		
		// 나누기 연산자의 경우 두 피연산자의 값이 int인 경우 int로 반환하기 때문에 소수점 이하는 버려진다.
		// 따라서 정확한 값을 얻기 위해는 실수형으로 형변환이 필요하다.

	}

}
