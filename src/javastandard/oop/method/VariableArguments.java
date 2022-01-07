package javastandard.oop.usemethod;

/**
 * �����μ��� ���.
 * 
 */
public class VariableArguments {

	/**
	 * Variable Arguments�� ����� method�� JDK 1.5�̻󿡼� ���� ����� �� �ִ�. V.A�� method ���ο���
	 * �迭(�ּҸ� ������ �ִ� ������ ��������)�� ���ȴ�.
	 * 
	 * @param param
	 */
	public void useVA(int... param) {
//		System.out.println(param);// ������ ���������� �ּҰ� ���
		for (int i = 0; i < param.length; i++) {
			System.out.print(param[i] + " ");
		} // end forF
		System.out.println();
	} // end method
	
//	public void useVA2(int ... paramI, int ...param) { // V.A�� ���� ������ parameter�θ� ���ǵȴ�.
	public void useVA2(int paramI, int ...paramJ) { 
		System.out.println(paramI);
		System.out.println(paramJ);
		
	} // use VA2

	public static void main(String[] args) {
		// ��üȭ : �ν��Ͻ� method�� ������ ����ϱ� ����

		VariableArguments uva = new VariableArguments();
		uva.useVA();
		System.out.println("------------------------------------");
		uva.useVA(1);
		System.out.println("------------------------------------");
		uva.useVA(1, 2, 43, 5, 10, 100, 6000); // ���� ������ n���� ���� ���� �� �ִ�.
//		uva.useVA(1, "2"); // ������ ���� �ٸ��� error
		System.out.println("------------------------------------");
//		uva.useVA2(1, 1,2,3,4);
//		uva.useVA2(); int���� �ݵ�� ���� �ԷµǾ���Ѵ�. V.A�� ���� ����
		

	} // main

} // class
