package javastandard.variable;

public class PrintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 1;
		short s = 2;
		char c = 'A';

		int finger = 10;
		long big = 100_000_000_000L; // long big = 100000000L Java 1.7 부터 _로 숫자 구분 가능
		long hex = 0xFFFF_FFFF_FFFFL; // 0x로 시작시 16진수 x는 대,소문자 구분없이 사용 가능

		int octNum = 010; // 앞에 0으로 시작시 8진수
		int hexNum = 0x10;
		int binNum = 0b10; // b는 2진 리터럴 Java 1.7부터 추가되었다.

		// printf는 c의 printf와 동일 개념 따라서 지시자를 사용하고, 특수문자는 문자 리터럴 사용 필요

		System.out.printf("b = %d\n", b);
		System.out.printf("s = %d\n", s);
		System.out.printf("c = %c, %d\n", c, (int)c);
		System.out.printf("finger = [%5d]\n", finger);
		System.out.printf("finger = [%-5d]\n", finger);
		System.out.printf("finger = [%05d]\n", finger);
		System.out.printf("big = %d\n", big);
		System.out.printf("hex = %#x\n", hex); //#은 접두사 16진수0x 8진수0
		System.out.printf("octNum = %o, %d\n", octNum, octNum); 
		System.out.printf("hexNum = %x, %d\n", hexNum, hexNum); 
		// 10진수를 2진수로 출력하는 지시자가 없기 때문에 toBinaryString 사용 따라서 %s 문자열로 표현했음
		System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(binNum), binNum); 
		
		

	}

}
