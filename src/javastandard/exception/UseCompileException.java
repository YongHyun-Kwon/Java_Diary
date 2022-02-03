package javastandard.exception;

/**
 * Compile Exception 코딩시에 예외가 발생하는 예외( byte code가 제대로 만들어지지 않음 )
 * 
 * @author user
 */
public class UseCompileException {

	@SuppressWarnings("rawtypes")
	public UseCompileException() {

		// new를 사용하지않고 외부 클래스를 객체로 생성할 때.
		try {
//			Class obj = Class.forName("java.lang.String");
			Class obj = Class.forName("exception.UseRuntimeException1");
			System.out.println(obj);
		} catch (ClassNotFoundException cnfe) {
			System.out.println("클래스의 이름을 확인하세요.");
			String msg = cnfe.getMessage();
			System.err.println("간단한 메시지 : " + msg);
			String msg1 = cnfe.toString();
			System.err.println("예외처리객체와 간단한 메시지 : " + msg1);

			cnfe.printStackTrace(); // console 출력도 함께 수행
			System.out.println("-------------------------------------");
			// } catch(FileNotFoundException n) { try~안쪽의 코드가 예외를 throws 한것만 catch 가능하다.
		}

	} // UseCompileException

	public static void main(String[] args) {

		new UseCompileException();

	} // main

} // class
