package javastandard.loop;

public class ForEx3 {

	public static void main(String[] args) {
		// 2단에서 9단까지 구구단 출력
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int num = 1; num <= dan; num ++) {
				System.out.printf("%d * %d = %d\n", dan, num, dan*num);
			}
		}
		

	}

}
