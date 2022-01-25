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

		map.put("마을버스", 800);
		map.put("버스", 1250);
		map.put("지하철", 1300);

		if (map.containsKey(trans)) {
			if (distance > 10) {
				overFare = (((distance - 10) / 5) + 1) * 100;
			}
		} else {
			return "대중교통이 아닙니다."; // end if
		}

		return String.format("입력 교통수단 : %s, 이동거리 : %d, 기본요금 : %d원, 초과요금 %d원 한달 20일 기준 교통비 %d원", trans, distance,
				map.get(trans), overFare, (map.get(trans) + overFare) * 20);
	} // getTransport

	public String getTrans(int transNum) {

		switch (transNum) {
		case 0:
			return "버스";
		case 1:
			return "지하철";
		case 2:
			return "택시";

		} // end switch
		return "따릉이";

	} // getTrans

	public static void main(String[] args) {

		Transport hw = new Transport();
		System.out.println(hw.getTransport("마을버스", 11));

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
