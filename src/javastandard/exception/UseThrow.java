package javastandard.exception;

import javax.security.auth.login.FailedLoginException;

/**
 * Ư�� ��Ȳ���� ���ܸ� ������ �߻����� ó��.
 * 
 * @author user
 */
public class UseThrow {

	public void login(String id, String pass) throws FailedLoginException { // 2. �߻��� ���ܸ� ������
		if (!(id.equals("admin") && pass.equals("1234"))) {
			// 1. ���ܰ� ������ �߻�.
//			try {
//			throw new Exception("�α��ν���. ���̵� ����� Ȯ��") // ���� method�� �ϰ� �߻��Ǵ� ���ܰ� �ƴϴ�.
			throw new FailedLoginException("�α��� ����. ���̵� ����� Ȯ�����ּ���.");
//			} catch(Exception e) {} ���������� �ʴ´�.
		} // end if
		System.out.println(id + "�� �α��� �ϼ̽��ϴ�.");
	} // login

	public static void main(String[] args) {
		UseThrow ut = new UseThrow();
		String id = "admin";
		String pass = "1234";

		// 3. ȣ���� ������ throws ���ܸ� ó���Ѵ�.
		try {
			ut.login(id, pass);
		} catch (FailedLoginException fle) { // ����(method)�� ���þ��� �̸��� ���ܰ� ó�� �Ǿ���.
			System.err.println("������ �޽��� : " + fle.getMessage());
			System.err.println("����ó�� ��ü��� �޽��� : " + fle);
			System.err.println("----------------�ڼ��� ����----------------");
			fle.printStackTrace();
		} // end catch

	} // main

} // class
