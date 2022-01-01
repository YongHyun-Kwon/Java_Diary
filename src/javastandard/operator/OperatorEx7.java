package javastandard.operator;

public class OperatorEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d\n", a, b); //a=5, b=0
		System.out.printf("a != 0 || ++b != 0 = %b\n", a != 0 || ++b != 0);
		System.out.printf("a=%d, b=%d\n", a, b); //a=5, b=0
		System.out.printf("a != 0 && ++b != 0 = %b\n", a == 0 && ++b != 0);
		System.out.printf("a=%d, b=%d\n", a, b); //a=5, b=0
		
		// 논리 연산자가 효율적으로 돌아가는지를 확인한 예제
		// 변수 b에 ++을 사용해 우측 피연산자가 처리되면 증가하도록 하였으나
		//b의 값은 다 0으로 남아있다.
		// ||의 경우 좌측이 참이기 때문이고 &&의 경우는 a==0이 거짓이여서 우측이 실행되지 않기 때문이다.
		
		int x,y,z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x = %c%d\n", signX, absX);
		System.out.printf("y = %c%d\n", signY, absY);
		System.out.printf("z = %c%d\n", signZ, absZ);
		
	}

}
