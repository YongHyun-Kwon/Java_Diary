package javastandard.operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;

		System.out.println(" a = " + a); // -72379968
		System.out.println(" b = " + b); // 1000000000000

		// a, b �Ѵ� ���� ���������� ��°������� ���̰� ����.
		// ������ int Ÿ�԰� int Ÿ���� �������� int�̰� ���� int���� ������ �ʰ��߱� �����̴�.
		// long�̿��� ����� �� ���� �Ͱ����� ���ͷ��� ������ �̹� 4byte�̱⿡ ����ȯ�� ����� �ùٸ� ���� ���� �� �ִ�.
	}

}
