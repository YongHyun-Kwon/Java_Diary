package javastandard.oop.base;

/**
 * ���� parameter�� ��ȯ �ϴ� type�� �������� void�� ������ �����ϴ�.<br>
 * 
 * MethodEx1�̶�� Ŭ�����ȿ� �����ִ� method�̱� ������ class object�� ��������<br>
 *
 * print99danAll() ��ȣ�� �ٿ��� ȣ���� ����� Method�� ����ȴ�.<br>
 * 
 * Method��� �ٸ����� function, �Լ���� Ī�Ѵ�.
 */
public class GuGudanEx1 {

	static void print99danAll() { // static���� �����ϸ� ��ü�� �������� �ʾƵ� ȣ���� �����ϴ�.
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d ", i, j, i * j);
			} // end for j
			System.out.println();
		} // end for i
	} // end method

	public static void main(String[] args) {

		print99danAll();

	} // main

} // class
