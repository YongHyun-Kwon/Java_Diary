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
		
		// �� �����ڰ� ȿ�������� ���ư������� Ȯ���� ����
		// ���� b�� ++�� ����� ���� �ǿ����ڰ� ó���Ǹ� �����ϵ��� �Ͽ�����
		//b�� ���� �� 0���� �����ִ�.
		// ||�� ��� ������ ���̱� �����̰� &&�� ���� a==0�� �����̿��� ������ ������� �ʱ� �����̴�.
		
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
