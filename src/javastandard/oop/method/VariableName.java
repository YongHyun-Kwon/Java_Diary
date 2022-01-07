package javastandard.oop.usemethod;

/**
 * 같은 이름의 변수를 사용
 * @author user
 */
public class VariableName {
	//class field : instance(member) variable, static(class) variable
	// class field에서 선언되는 변수의 이름은 유일하다.
	int i;
	static int j;
//	static int i; // 같은 이름의 변수가 존재하기 때문에 Err
	
	
	public static void main(String[] args) {
		//local : local variable
		// 지역은 class field와 영역이 다르기 때문에 class field에 선언된 이름과 같은 변수를 선언할 수 있다.
		int i=0;
		System.out.println("지역변수 : " + i ); // local variable는 변수명을 바로 사용
		//인스턴스 변수사용
		
		VariableName tvn = new VariableName();
		tvn.i = 1;
		VariableName.j = 2;
		System.out.println("instance(member) variable: " + tvn.i);
		System.out.println("class variable : " + VariableName.j);
		
	} // main

} // class
