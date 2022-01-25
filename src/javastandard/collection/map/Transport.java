package javastandard.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Transport {

	static Random ran = new Random();

	public String getTransport(String trans, int distance) {
		int overFare = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("��������", 800);
		map.put("����", 1250);
		map.put("����ö", 1300);

		if (map.containsKey(trans)) {
			if (distance > 10) {
				overFare = (((distance - 10) / 5) + 1) * 100;
			}
		} else {
			return "���߱����� �ƴմϴ�."; // end if
		}

		return String.format("�Է� ������� : %s, �̵��Ÿ� : %d, �⺻��� : %d��, �ʰ���� %d�� �Ѵ� 20�� ���� ����� %d��", trans, distance,
				map.get(trans), overFare, (map.get(trans) + overFare) * 20);
	} // getTransport

	public String getTrans(int transNum) {

		switch (transNum) {
		case 0:
			return "����";
		case 1:
			return "����ö";
		case 2:
			return "�ý�";

		} // end switch
		return "������";

	} // getTrans

	public static void main(String[] args) {

		Transport hw = new Transport();
		System.out.println(hw.getTransport("��������", 11));

		List<String> list = new ArrayList<String>();

		int useDate = ran.nextInt(3) + 20;

		for (int i = 0; i < useDate; i++) {
			list.add(hw.getTransport(hw.getTrans(ran.nextInt(4)), ran.nextInt(30) + 1));
		} // end for

		for (String val : list) {
			System.out.println(val);
		} // end for

	} // main

} // class
