package javastandard.operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;

		System.out.println(" a = " + a); // -72379968
		System.out.println(" b = " + b); // 1000000000000

		// a, b 둘다 같은 연산이지만 출력값에서는 차이가 난다.
		// 이유는 int 타입과 int 타입의 연산결과는 int이고 값이 int값의 범위를 초과했기 때문이다.
		// long이여서 결과가 잘 나올 것같지만 리터럴의 범위가 이미 4byte이기에 형변환을 해줘야 올바른 값을 얻을 수 있다.
	}

}
