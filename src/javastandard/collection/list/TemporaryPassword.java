package javastandard.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author user 임의의 문자 6~13자를 잘라내서 lIST에 저장하여 반환하는 일
 */
public class TemporaryPassword {

	static Random ran = new Random();

	/**
	 * random한 수를 전달받아 임의의 문자열 값을 저장
	 * @param ranNum
	 * @return
	 */
	public List<String> createPassword(int ranNum) {
		List<String> list = new ArrayList<String>();
		String data = "1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm,./QWERTYUIOPASDFGHJKLZXCVBNM";

		for (int i = 0; i < ranNum; i++) {
			list.add(String.valueOf(data.charAt(ran.nextInt(data.length()))));
		}

		return list;
	}

	public void printPassword(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s", list.get(i));
		}
	}

	public static void main(String[] args) {

		TemporaryPassword w = new TemporaryPassword();
		int ranNum = ran.nextInt((13 - 6) + 1) + 6;
		List<String> list = w.createPassword(ranNum);

		w.printPassword(list);

	}

}
