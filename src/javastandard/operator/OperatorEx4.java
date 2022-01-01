package javastandard.operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열도 연산이 가능하다.
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d\n", d, a, d - a); // 'd' - 'a' = 3;
		System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);
		System.out.printf("'%c' = %d\n", a, (int)a);
		System.out.printf("'%c' = %d\n", d, (int)d);
		System.out.printf("'%c' = %d\n", zero, (int)zero);
		System.out.printf("'%c' = %d\n", two, (int)two);
		
		char c1 = 'A';
		char c2 = c1;
		char c3 = ' ';
		
		int i = c1 + 1;
		
		c3 = (char)(c1+1);
		c2++;
		c2++;
		
		System.out.println("i = " + i);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		char lowerCase = (char) (c1 + 32);
		System.out.println(lowerCase); // 'A' -> 'a' 대문자와 소문자는 32차이


	}

}
