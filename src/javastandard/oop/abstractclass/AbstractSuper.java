package javastandard.oop.abstractclass;

/**
 * ������ ��üȭ���� �ʴ� Ŭ����
 * 
 * @author user
 *
 */
public abstract class AbstractSuper {

	int i;

	public AbstractSuper() { // �ڽ�Ŭ������ ���ؼ��� ȣ��
		System.out.println("�߻�Ŭ������ ������");
	} // AbstractSuper

	public void methodA() {
		System.out.println("�θ��� �Ϲ� method");
	} // methodA

	public abstract void methodB(); // �߻� method

	public abstract int methodC(String name); // �߻� method

//	public static void main(String[] args) {
//
//	} // main

} // class
