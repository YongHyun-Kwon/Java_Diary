package javastandard.oop.usemethod;

/**
 * class field에 선언되는 변수는 자동초기화가 된다. (개발자가 초기 값을 넣을 필요가 없다.)
 */
public class DefaultValue {

	int i; // 정수형 : 0
	char c; // 문자형 : \u0000 공백
	double d; // 실수형 : 0.0
	boolean b; // 불린형 : false
	DefaultValue tdv; // 참조형 null
	String str; // 참조형 null
	int[] arr; // 참조형 null

	public static void main(String[] args) {
		DefaultValue instance = new DefaultValue();
		System.out.println("정수형 [" + instance.i + "]");
		System.out.println("문자형 [" + instance.c + "]");
		System.out.println("실수형 [" + instance.d + "]");
		System.out.println("불린형 [" + instance.b + "]");
		System.out.println("참조형 class [" + instance.tdv + "]");
		System.out.println("참조형 String [" + instance.str + "]");
		System.out.println("참조형 Array [" + instance.arr + "]");
		
	}

}
