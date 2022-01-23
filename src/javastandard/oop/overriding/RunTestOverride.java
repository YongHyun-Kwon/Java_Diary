package javastandard.oop.overriding;

import java.util.Date;

public class RunTestOverride {
	
	@Override
	
	public String toString() {
		return "��ü�� ��µ� �� �ּҰ� �ƴ� �ٸ� �޼��� ����ϵ��� ���� " +  super.toString();
	}

	public static void main(String[] args) {

		// ��� ������ ��üȭ : �ڽ�Ŭ������ �����Ͽ� �θ�Ŭ������ �����Ѵ�. - �θ�Ŭ������ �ڿ��� ��� ����.
		// �θ�Ŭ������ ��ü�� = new �ڽ�Ŭ����������();
		TestOverrideSuper tos = new TestOverrideSub();
		tos.test(); // �θ𿡸� ���ǵ� method
		tos.temp(); // Override �� method : �ڽ�Ŭ������ Overrid�� method�� �ֿ켱������ ȣ��.
//		tos.sub();  // �ڽ�Ŭ������ ���� �ڿ��� ����� �� ����.
		
		System.out.println("--------------------------------------");
		
		// �ڽ�Ŭ������ ��üȭ : �θ�Ŭ������ ��� �ڿ��� �ڽ�Ŭ������ ��� �ڿ��� ����� �� �ִ�.
		TestOverrideSub tos2 = new TestOverrideSub();
		tos2.test(); // �ڵ��� ���뼺
		tos2.sub(); // �ڽ�Ŭ������ ���� method
		tos2.temp(); // �ڽ�Ŭ������ �θ�Ŭ���� ��method�� Override�� method
		
		System.out.println("--------------------------------------");
		
		RunTestOverride rto = new RunTestOverride(); 
		System.out.println(rto.toString()); // heap �ּ�
		
		String str = new String("������ ������ �Դϴ�.");
		System.out.println(str.toString()); // �޽��� ���
		
		Date date = new Date();
		System.out.println( date.toString() ); // �޽���
		
		System.out.println(tos2.toString()); // heap �ּ�

	}// main

} // class
