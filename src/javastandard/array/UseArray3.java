package javastandard.array;

/**
 * 3차원 배열의 사용
 * 
 * @author user
 */
public class UseArray3 {
	public UseArray3() {
		// 1. 선언) 데이터형[][][] 배열명 = null;
		int[][][] arr = null;

		// 2.생성 ) 배열명 = new 데이터형[면][행][열]
		arr = new int[3][3][4];
		System.out.println("면의 수 : " + arr.length + ", 행의 수 : " + arr[0].length + ", 열의 수 : " + arr[0][0].length);

		// 3. 값할당 ) 배열명[면][행][열] = 값;
		arr[0][0][0] = 2022;
		arr[1][1][1] = 1;
		arr[2][2][3] = 13;

		// 4. 값사용 ) 배열명[면][행][열]
		System.out.println(arr[0][0][0] + "/" + arr[0][0][1]);

		// 일괄처리
		for (int i = 0; i < arr.length; i++) { // 면
			System.out.println(i + "면 시작");

			for (int j = 0; j < arr[i].length; j++) { // 행
				System.out.println(j + " 행 시작");

				for (int k = 0; k < arr[i][j].length; k++) { // 열
					System.out.printf("arr[%d][%d][%d] = %-5d", i, j, k, arr[i][j][k]);
				}

				System.out.println(j + " 행 끝");
			}

			System.out.println(i + "면 끝");
		}

		// 기본형문법: 면구분 괄호, 행 구분괄호
		int[][][] arr2 = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9, }, { 10, 11, 12 } } };
		System.out.println(arr.length + "면," + arr[0].length + "행," + arr[0][0].length + "열");

		for (int[][] tempArr2 : arr2) { // 삼차원 배열의 한면은 이차원 배열
			for (int[] tempArr1 : tempArr2) { // 이차원 배열의 한면은 일차원 배열
				for (int value : tempArr1) { // 일차원 배열의 한열은 단일형
					System.out.printf("%-6d", value);
				} // end for
				System.out.println();
			} // end for
			System.out.println();
		} // end for

	} // UseArray3

	public static void main(String[] args) {
		new UseArray3();
	}// main

} // class
