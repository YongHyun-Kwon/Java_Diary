package javastandard.oop.overriding;

class Parent {
	void parentMethod() {}
}

class Child extends Parent{
	void parentMethod() {}// �������̵�
	void parentMethod(int x) {} //�����ε�
	
	void childMethod() {}
	void childMethod(int x) {} //���� �ε�
}

public class OverlodingRiding {
	/*
	 * �������̵��̶�?
	 * ����Ŭ�����κ��� ��ӹ��� method�� ������ �����ϴ� ��
	 * ��ӹ��� method�� �״�� ����ϱ⵵ ������ �ڽ� class�� ��ɿ� �°� �����ؾ��� ���� �ִ�.
	 * �̷� ��� ������ method�� overriding�Ѵ�.
	 * 
	 * �������̵��� ����
	 * �ڼ�Ŭ�������� ��������ϴ� method�� ���� class�� method��
	 * �̸��� ���ƾ��ϰ�, �Ű������� ���ƾ��ϸ�, ��ȯ Ÿ���� ���ƾ��Ѵ�.
	 * 
	 * ���������ڴ� ���� Ŭ������ method���� ���� ������ ���� �Ұ�
	 * -> ���� method�� ���������ڰ� protected��� overriding�� method�� protected�ų� public�̿��Ѵ�)
	 * ���ܴ� ����Ŭ������ method���� ���� ������ �� ����.
	 * instancemethod�� static method�� �Ǵ� �� �ݴ�� ������ �Ұ����ϴ�. 
	 * 
	 */

	public static void main(String[] args) {

	}

}
