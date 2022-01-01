package javastandard.operator;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double) f;

		System.out.printf("10.0==10.0f %b\n", 10.0 == 10.0f);
		System.out.printf("0.1==0.1f %b\n", 0.1 == 0.1f);
		System.out.printf("f = %19.17f\n", f);
		System.out.printf("d = %19.17f\n", d);
		System.out.printf("d2 =%19.17f\n", d2);
		System.out.printf("d==f  %b\n", d==f);
		System.out.printf("d==d2  %b\n", d==d2);
		System.out.printf("d2==f  %b\n", d2==f);
		System.out.printf("(float)d==f  %b\n", (float)d==f);
		//double 타입과 flaot 타입을 제대로 비교하기 위해선 double type을 float type으로 변환해줘야 정확한 값이 나온다.
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b\n", "abc"=="abc");
		System.out.printf("\"str1\"==\"abc\" ? %b\n", str1 =="abc");
		System.out.printf("\"str2\"==\"abc\" ? %b\n", str2 =="abc"); // false
		System.out.printf("str1.equals(\"abc\") ? %b\n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b\n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b\n", str2.equals("ABC"));
		System.out.printf("str1.equalsIgnoreCase(\"ABC\") ? %b\n", str2.equalsIgnoreCase("ABC"));
		
		// str2와 "abc"는 같지만 false로 나오게 되는데 이는 다른 객체이 때문이다.
		// 두 문자열을 비교할 때는 ==이 아닌 equals를 사용해야한다. equals는 객체가 달라도 내용이같으면 true를 반환하기 때문이다.
		// 대소문자를 구분하지 않고 비교하고싶을 경우에는 squalsIgnoreCase를 사용하자
		

	}

}
