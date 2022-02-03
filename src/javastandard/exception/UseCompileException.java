package javastandard.exception;

/**
 * Compile Exception �ڵ��ÿ� ���ܰ� �߻��ϴ� ����( byte code�� ����� ��������� ���� )
 * 
 * @author user
 */
public class UseCompileException {

	@SuppressWarnings("rawtypes")
	public UseCompileException() {

		// new�� ��������ʰ� �ܺ� Ŭ������ ��ü�� ������ ��.
		try {
//			Class obj = Class.forName("java.lang.String");
			Class obj = Class.forName("exception.UseRuntimeException1");
			System.out.println(obj);
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Ŭ������ �̸��� Ȯ���ϼ���.");
			String msg = cnfe.getMessage();
			System.err.println("������ �޽��� : " + msg);
			String msg1 = cnfe.toString();
			System.err.println("����ó����ü�� ������ �޽��� : " + msg1);

			cnfe.printStackTrace(); // console ��µ� �Բ� ����
			System.out.println("-------------------------------------");
			// } catch(FileNotFoundException n) { try~������ �ڵ尡 ���ܸ� throws �Ѱ͸� catch �����ϴ�.
		}

	} // UseCompileException

	public static void main(String[] args) {

		new UseCompileException();

	} // main

} // class
