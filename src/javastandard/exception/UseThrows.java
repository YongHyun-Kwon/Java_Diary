package javastandard.exception;

/**
 * throws를 사용한 예외 던짐. 생성자, 일반 method, main method에 붙일 수 있다.
 * 
 * 생성자에 throws를 붙이면 - 객체화할 때 예외를 처리한다. 일반 method에 throws붙이면 - 호출하는 곳에서 예외를 처리한다.
 * main method에 throws 붙이면 - JVM이 예외를 처리한다.
 * 
 * @author user
 */
public class UseThrows {

	/**
	 * 호출한 곳에서 method내에서 발생한 예외를 처리하도록 throws정의.
	 * 
	 * @throws ClassNotFoundException
	 */
	public void work() throws ClassNotFoundException {
		Class.forName("java.lang.Integer1"); // 예외가 발생하면 throws로 호출한 곳의 catch로 돌아간다.
		System.out.println("클래스 로딩 성공");
	} // work

	public static void main(String[] args) throws Exception {
		UseThrows ut = new UseThrows();
		try {
			ut.work();
		} catch (ClassNotFoundException cnfe) {
			System.err.println("클래스가 존재하지 않습니다.");
			cnfe.printStackTrace();
		} // end catch
	} // main

} // class
