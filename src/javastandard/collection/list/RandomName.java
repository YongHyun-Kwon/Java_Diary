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
	 * random�� ���� ���޹޾� �� Ƚ����ŭ �ݺ��ϰ� list�� random�� ���� �����Ѵ�.
	 * @param ranNum
	 * @return
	 */
	public List<String> ranName(int ranNum) {

		List<String> list = new ArrayList<String>();
		String[] data = { "������", "����", "������", "�ǿ���", "�迹��", "������", "������", "������", "������" };
		for (int i = 0; i < ranNum; i++) {
			list.add(data[ran.nextInt(data.length)]);
		} // end for
		return list;

	} // ranName 

	/**
	 * ranName���� return���� list�� �Ű������� �޾� ����ϰ� hash set�� �̿��� �ߺ� ���� Ȯ��
	 * @param list
	 */
	public void printList(List<String> list) {
		Set<String> set = new HashSet<String>(list);

		int cnt = 0;
		for (String value : list) {
			System.out.printf("%d�� %s\n", ++cnt, value);
		} // end for
		System.out.printf("���Ǽ��� %d\n", cnt);

		for (String value : set) {
			System.out.printf("%s : %d�� ",value,Collections.frequency(list, value));
		}  // end for

	} // printList

	public static void main(String[] args) {

		RandomName w1 = new RandomName();

		int ranNum = ran.nextInt((20 - 10) + 1) + 10;
		w1.printList(w1.ranName(ranNum));

	} //main

} // class
