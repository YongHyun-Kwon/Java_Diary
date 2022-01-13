package javastandard.array;

public class VariableArray {
	
	public VariableArray() {
		
		// 1.선언) 데이터형[][] 배열명 = null;
		int[][] arr = null;
		
		//2.생성) 배열명 = new 데이터형[행의수][];열의 갯수를 설정하지 않는다.
		arr = new int[5][];
		
		//3. 행마다 일차원 배열로 열을 생성) 배열명[행의 번호] = new 데이터형[열의 수];
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[1];
		arr[3] = new int[] {1,2,3,4,5};
		arr[4] = new int[] {10,20,30};
		
		for(int i = 0; i <arr.length; i ++ ) {
			System.out.println("arr[" + i + "]행 열의 갯수 : " + arr[i].length);
		} // end for
		
		// 4. 값할당) - 인덱스 주의
		arr[0][0] = 100;
		arr[1][1] = 100;
		
		//5. 값 사용) - 인데스 주의
		System.out.println(arr[0][0] + "/" + arr[0][1]);
		
		//일괄처리
		for( int i = 0; i < arr.length ; i++) { // 행
			for(int j = 0; j <arr[i].length; j ++) { // 열
				System.out.printf("arr[%d][%d]=%d\t",i,j, arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		//기본형형식의 사용. : 행구분 괄호에서 값의 갯수를 다르게 설정
		int[][] arr2 = {{10,20,30},{40},{50,60,70,80}};
		
		for(int i = 0; i <arr2.length; i ++ ) {
			System.out.println("arr2[" + i + "]행 열의 갯수 : " + arr2[i].length);
		} // end for
		
		for(int[] tempArr1 : arr2 ) {
			for(int value : tempArr1) {
				System.out.printf("%-4d",value);
			}
			System.out.println();
		}
		
//		int[] temp = arr2[0];
		temp(arr2[2]); // 이차원 배열의 행은 일차원 배열로 이루어져 있다.
	}
	
	public void temp(int[] arr) {
		for(int i =0; i <arr.length;i++) {
			System.out.println(arr[i]);
		}//end for
	} // temp
	

	/**
	 * 행마다 열의 갯수가 다른 배열.
	 * @param args
	 */
	public static void main(String[] args) {
		new VariableArray();
	} // main

} // class
