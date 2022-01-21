package javastandard.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomName {

	static Random ran = new Random();

	/**
	 * random한 수를 전달받아 그 횟수만큼 반복하고 list에 random한 값을 저장한다.
	 * @param ranNum
	 * @return
	 */
	public List<String> ranName(int ranNum) {

		List<String> list = new ArrayList<String>();
		String[] data = { "강명준", "강산", "강현모", "권용현", "김예진", "김의정", "김정하", "김진영", "김현우" };
		for (int i = 0; i < ranNum; i++) {
			list.add(data[ran.nextInt(data.length)]);
		} // end for
		return list;

	} // ranName 

	/**
	 * ranName에서 return받은 list를 매개변수로 받아 출력하고 hash set을 이용해 중복 값을 확인
	 * @param list
	 */
	public void printList(List<String> list) {
		Set<String> set = new HashSet<String>(list);

		int cnt = 0;
		for (String value : list) {
			System.out.printf("%d번 %s\n", ++cnt, value);
		} // end for
		System.out.printf("임의수는 %d\n", cnt);

		for (String value : set) {
			System.out.printf("%s : %d번 ",value,Collections.frequency(list, value));
		}  // end for

	} // printList

	public static void main(String[] args) {

		RandomName w1 = new RandomName();

		int ranNum = ran.nextInt((20 - 10) + 1) + 10;
		w1.printList(w1.ranName(ranNum));

	} //main

} // class
