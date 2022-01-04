package javastandard.array;

/**
 * 배열의 복사<br>
 * 배열은 한번 생성하면 길이를 복사해서 늘려줘야하며 이런 작업은 비용이 많이 든다.<br>
 * 처음부터 생각한 배열의 길이 *2를 해서 넉넉히 잡아주자.<br>
 * 배열의 복사는 for과 arraycopy()를 사용한다<br>
 * for문은 배열의 요소를 하나씩 접근하여 복사하지만<br>
 * arraycopy()는 지정된 범위의 값들을 한번에 복사한다.<br>
 * 이는 배열의 요소들이 연속적으로 저장되어 있는 특성 떄문에 가능한 처리 방법이다.
 */
public class ArrayEx2 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		// 배열 arr에 값 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		} // end for

		System.out.println("[변경 전]");
		System.out.println("arr.length : " + arr.length);

		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		} // end for

		int[] tmp = new int[arr.length * 2]; // arr의 길이보다 2배인 tmp 배열 생성

		// for문으로 arr 배열의 값을 tmp로 복사
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		} // end for

		arr = tmp;

		System.out.println("[변경 후]");
		System.out.println("arr.length : " + arr.length);
		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		} // end for
		
		System.out.println();

		char[] abc = { 'A', 'B', 'C', 'D', };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc); // println은 char 배열인 경우에만 오류없이 인자 출력
		System.out.println(num);
		
		// 배열 abc와 num을 붙여서 하나의 [result] 생성
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		// 배열 abc를 num의 첫번째 위치부터 abc의 길이만큼 복사.
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number의 인덱스 6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	} // main

} // class
