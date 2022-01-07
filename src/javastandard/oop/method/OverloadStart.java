package javastandard.oop.usemethod;

/**
 * method overload. 같은 이름의 method를 여러개 작성하는 것<br>
 * . 매개변수를 다르게 설정한다.
 */
public class OverloadStart {
	
	/**
	 * 별을 하나 출력하는 일.
	 */
	public void printStar() {
		
		System.out.print("★");
	} // printStar
	
	/**
	 * 입력된 수대로 별을 출력하는 일.
	 * @param cnt 출력할 별의 갯수.
	 */
	public void printStar(int cnt) {
		for(int i = 0; i <cnt; i ++) {
			System.out.print("☆");
		}// end for
	} // printStar
	
	

	public static void main(String[] args) {
		
		OverloadStart to = new OverloadStart();
		// 별하나 출력
		to.printStar();
		System.out.println();
		// 뱔 여러개 출력
		to.printStar(5);

	} // main

} // class
