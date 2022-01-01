package javastandard.operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f;

		// int형간의 나눗겜 int/int를 수행하면 float이나 double이 아닌 int다 꼭 기억할 것
		System.out.println(shortPi); // 따라서 뒤의 소수점 값이 버려져 3.141이란 결과가 나왔다.

		// 반올림 하기 위한 방법 1

		double pi1 = 3.141592;
		double shortPi1 = (int) (pi1 * 1000 + 0.5) / 1000.0;
		// 위 수식에서 먼저 수행되는 것은 괄호한의 pi*1000이다.
		// pi1이 double 형태이기에 1000도 double 형태로 변환되어 3141.592가된다.
		// 따라서 + 0.5를 해주게되면 3142.092가 되기에 결과 값은 3.142가 된다.
		System.out.println(shortPi1); // 3.142
		// 만약 1000.0가 아니라 1000이였으면 3의 결과값을 얻었을 것이다.
		shortPi1 = (int) (pi1 * 1000 + 0.5) / 1000;
		System.out.println(shortPi1); // 3.0

		// 반올림 하기 위 한 방법 2
		//Math클래스의 round 메소드를 사용하면 매개변수로 받은 값을 소수점 첫째자리에서 반올림하고 결과를 정수로 돌려준다.
		double pi2 = 3.141592;
		double shortPi2 = Math.round(pi2 * 1000) / 1000.0;
		System.out.println(shortPi2); // 3.142

	}

}
