package javastandard.oop.usemethod;

/**
 * class field�� ����Ǵ� ������ �ڵ��ʱ�ȭ�� �ȴ�. (�����ڰ� �ʱ� ���� ���� �ʿ䰡 ����.)
 */
public class DefaultValue {

	int i; // ������ : 0
	char c; // ������ : \u0000 ����
	double d; // �Ǽ��� : 0.0
	boolean b; // �Ҹ��� : false
	DefaultValue tdv; // ������ null
	String str; // ������ null
	int[] arr; // ������ null

	public static void main(String[] args) {
		DefaultValue instance = new DefaultValue();
		System.out.println("������ [" + instance.i + "]");
		System.out.println("������ [" + instance.c + "]");
		System.out.println("�Ǽ��� [" + instance.d + "]");
		System.out.println("�Ҹ��� [" + instance.b + "]");
		System.out.println("������ class [" + instance.tdv + "]");
		System.out.println("������ String [" + instance.str + "]");
		System.out.println("������ Array [" + instance.arr + "]");
		
	}

}
