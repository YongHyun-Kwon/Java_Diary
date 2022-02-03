package javastandard.exception;

/**
 * RuntimeException
 * 코딩시에는 예외가 발생하지 않고( 문법적으로는 문제가 없음 ) 실행 시 발생하는 예외
 * @author user
 */
public class UseRuntimeException {

	public void testRuntimeException(String[] args) {
		// 1. args[0]과 args[1]을 받아서 2. 정수로 변환한 후 3. 나누기 연산 작업을 수행 출력.

		try {
			int num1 = Integer.parseInt(args[0]); // ArrayIndex.. 발생예상
			int num2 = Integer.parseInt(args[1]); // ArrayIndex.. 발생예상
			int result = 0;

			result = num1 / num2; // ArithmeticException 발생 예상

			System.out.println(num1 + "/" + num2 + "=" + result);
		} catch (NumberFormatException nfe) {
			System.err.println("입력 값은 숫자형태만 가능합니다.");
		} catch (ArithmeticException ae) {
			System.err.println("0으로 나눌 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("사용법) java UseRuntimeException 값1 값2");
			aioobe.printStackTrace();
		} catch (Exception e) {
			System.err.println("개발자가 인식하지 못한 예외");
		} finally {
			System.out.println("반드시 실행되는 코드");
		}
	} // testRuntimeException

	public static void main(String[] args) {
		UseRuntimeException ure = new UseRuntimeException();
		ure.testRuntimeException(args);
	}

}
