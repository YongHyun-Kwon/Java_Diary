package javastandard.oop.usemethod;

/**
 * ���� �̸��� ������ ���
 * @author user
 */
public class VariableName {
	//class field : instance(member) variable, static(class) variable
	// class field���� ����Ǵ� ������ �̸��� �����ϴ�.
	int i;
	static int j;
//	static int i; // ���� �̸��� ������ �����ϱ� ������ Err
	
	
	public static void main(String[] args) {
		//local : local variable
		// ������ class field�� ������ �ٸ��� ������ class field�� ����� �̸��� ���� ������ ������ �� �ִ�.
		int i=0;
		System.out.println("�������� : " + i ); // local variable�� �������� �ٷ� ���
		//�ν��Ͻ� �������
		
		VariableName tvn = new VariableName();
		tvn.i = 1;
		VariableName.j = 2;
		System.out.println("instance(member) variable: " + tvn.i);
		System.out.println("class variable : " + VariableName.j);
		
	} // main

} // class
