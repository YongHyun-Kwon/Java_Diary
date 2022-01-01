package javastandard.operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f;

		// int������ ������ int/int�� �����ϸ� float�̳� double�� �ƴ� int�� �� ����� ��
		System.out.println(shortPi); // ���� ���� �Ҽ��� ���� ������ 3.141�̶� ����� ���Դ�.

		// �ݿø� �ϱ� ���� ��� 1

		double pi1 = 3.141592;
		double shortPi1 = (int) (pi1 * 1000 + 0.5) / 1000.0;
		// �� ���Ŀ��� ���� ����Ǵ� ���� ��ȣ���� pi*1000�̴�.
		// pi1�� double �����̱⿡ 1000�� double ���·� ��ȯ�Ǿ� 3141.592���ȴ�.
		// ���� + 0.5�� ���ְԵǸ� 3142.092�� �Ǳ⿡ ��� ���� 3.142�� �ȴ�.
		System.out.println(shortPi1); // 3.142
		// ���� 1000.0�� �ƴ϶� 1000�̿����� 3�� ������� ����� ���̴�.
		shortPi1 = (int) (pi1 * 1000 + 0.5) / 1000;
		System.out.println(shortPi1); // 3.0

		// �ݿø� �ϱ� �� �� ��� 2
		//MathŬ������ round �޼ҵ带 ����ϸ� �Ű������� ���� ���� �Ҽ��� ù°�ڸ����� �ݿø��ϰ� ����� ������ �����ش�.
		double pi2 = 3.141592;
		double shortPi2 = Math.round(pi2 * 1000) / 1000.0;
		System.out.println(shortPi2); // 3.142

	}

}
