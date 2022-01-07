package javastandard.oop.usemethod;

/**
 * method ���ο��� method �ڽ��� �ٽ� ȣ���ϴ� ���� ���ȣ��(recursive call) �̶� Ī�ϸ�<br>
 * ���ȣ���� �ϴ� method�� ��� �޼ҵ��� �Ѵ�.
 *
 */
public class FactorialEx1 {

	public static void main(String[] args) {
		
		FactorialEx1 fe = new FactorialEx1();
		
		System.out.println(fe.factorial(4));
		

	}
	
	public int factorial(int n) { // ���� �� ��ȯ���� �ְ� �Ű����� �ִ� method
		int result = 0;
		if(n==1) {
			result = 1;	
		} else {
			result = n * factorial(n-1);		
		}
		return result;
	}

}
