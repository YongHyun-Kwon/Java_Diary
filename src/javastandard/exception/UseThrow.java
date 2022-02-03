package javastandard.exception;

import javax.security.auth.login.FailedLoginException;

/**
 * 특정 상황에서 예외를 강제로 발생시켜 처리.
 * 
 * @author user
 */
public class UseThrow {

	public void login(String id, String pass) throws FailedLoginException { // 2. 발생된 예외를 던지고
		if (!(id.equals("admin") && pass.equals("1234"))) {
			// 1. 예외가 강제로 발생.
//			try {
//			throw new Exception("로그인실패. 아이디나 비번을 확인") // 현재 method의 일과 발생되는 예외가 아니다.
			throw new FailedLoginException("로그인 실패. 아이디나 비번을 확인해주세요.");
//			} catch(Exception e) {} 를권장하지 않는다.
		} // end if
		System.out.println(id + "님 로그인 하셨습니다.");
	} // login

	public static void main(String[] args) {
		UseThrow ut = new UseThrow();
		String id = "admin";
		String pass = "1234";

		// 3. 호출한 곳에서 throws 예외를 처리한다.
		try {
			ut.login(id, pass);
		} catch (FailedLoginException fle) { // 업무(method)와 관련없는 이름의 예외가 처리 되었다.
			System.err.println("간단한 메시지 : " + fle.getMessage());
			System.err.println("예외처리 객체명과 메시지 : " + fle);
			System.err.println("----------------자세한 예외----------------");
			fle.printStackTrace();
		} // end catch

	} // main

} // class
