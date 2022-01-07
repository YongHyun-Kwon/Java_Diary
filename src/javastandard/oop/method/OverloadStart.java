package javastandard.oop.usemethod;

/**
 * method overload. ���� �̸��� method�� ������ �ۼ��ϴ� ��<br>
 * . �Ű������� �ٸ��� �����Ѵ�.
 */
public class OverloadStart {
	
	/**
	 * ���� �ϳ� ����ϴ� ��.
	 */
	public void printStar() {
		
		System.out.print("��");
	} // printStar
	
	/**
	 * �Էµ� ����� ���� ����ϴ� ��.
	 * @param cnt ����� ���� ����.
	 */
	public void printStar(int cnt) {
		for(int i = 0; i <cnt; i ++) {
			System.out.print("��");
		}// end for
	} // printStar
	
	

	public static void main(String[] args) {
		
		OverloadStart to = new OverloadStart();
		// ���ϳ� ���
		to.printStar();
		System.out.println();
		// �u ������ ���
		to.printStar(5);

	} // main

} // class
