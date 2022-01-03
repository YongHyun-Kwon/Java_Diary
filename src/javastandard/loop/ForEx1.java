package javastandard.loop;

public class ForEx1 {

	public static void main(String[] args) {
		
		// c의 for과 기능은 동일하다.
		// for문은 반복 횟수를 알고 있을 때 적합
		
		for(int i = 1, j = 10; i <=10;i++,j--) { //반복횟수 조건을 중첩할 수 도 있다.
			System.out.printf("%d \t %d\n", i, j);
		}
		
	}

}
