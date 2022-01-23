package javastandard.oop;

class MyTv {
	// Tv�� �Ӽ� tv��� �ϳ��� ���赵�� ���� �Ͱ� ����

	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

/**
 * member ������ ���� �ʱ�ȭ ���� �ʾƵ� �̹� �ʱ�ȭ�� �Ǿ��ִ�. 
 * ������ �ʱ�ȭ �� : 0        ��°� : 0
 * ������ �ʱ�ȭ �� : \u0000   ��°� : ����
 * �Ǽ��� �ʱ�ȭ �� : 0.0      ��°� : 0.0
 * �Ҹ��� �ʱ�ȭ �� : false    ��°� : false 
 * ������ �ʱ�ȭ �� : null     ��°� : null
 *
 */
public class TvTestEx1 {

	public static void main(String[] args) {
		// �Ʒ� ��ü�� �����ϴ� �ڵ带 ���� String, Array, Scanner���� ������ ���� �����ϴ�.
		// �̰��� String, Array, Scanner ���� ���� Ŭ������� ���� �� �� �ִ�.
		MyTv tv1 = new MyTv(); // tv��� �������� tv1�� ������ ���� �ϰ� new TV()�� ���� ����
		MyTv tv2 = new MyTv();

		tv1.channel = 7; // tv1�� ä�� ���� 7�� ����
		tv2.channel = 6; // tv2�� ä�� ���� 6���� ����

		System.out.println("tv1�� ä���� : " + tv1.channel);
		System.out.println("tv2�� ä���� : " + tv2.channel);

		tv1.channelUp();
		tv2.channelDown();

		System.out.println("tv1�� ä���� : " + tv1.channel);
		System.out.println("tv2�� ä���� : " + tv2.channel);

		tv1 = tv2; // tv2�� ����� ��� ���� tv1�� ���� �ȴ�. �̷��� �Ǹ� t1�� ���� �����ϰ� �ν��Ͻ��� ����� �Ұ��ϴ�

		System.out.println("tv1�� ä���� : " + tv1.channel);
		System.out.println("tv2�� ä���� : " + tv2.channel);

	} // main

} // class
