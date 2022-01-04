package javastandard.array;

import java.util.Scanner;

/**
 * 다차원 배열 <br>
 * 쉽게 말하면 [행][열] 이다. <br>
 * 엑샐의 [1][A] 이기도 하다. <br>
 */
public class MultiArrayEx1 {

	public static void main(String[] args) {
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"coffe", "커피"},
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length;i++) {
			System.out.printf("Q%d. %s 의 뜻은? >", i, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다. \n\n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s 였습니다. \n\n", words[i][1]);
			}
		} // end for
		sc.close();
	} // main
} // class