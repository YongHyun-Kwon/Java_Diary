package javastandard.variable;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ja" + "va";
		String str = name + 11;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(2 + " ");
		System.out.println(" " + 2);
		System.out.println(2 + "");
		System.out.println("" + "");
		System.out.println(2 + 2 + "");
		System.out.println("" + 2 + 2);
		// 연산은 왼쪽부터 오른쪽으로 넘어가기에 맨앞에 문자열이 있으면 뒤에 + 연산도 문자열로 취급한다.
		

	}

}
