package algorithm.baekjoon.flow;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// beakjoon 2884 번 알람 시계
		
		// 알람설정을 45분 앞서는 시간으로 변환하기
		
		System.out.print("알람을 맞출 시와 분을 입력해주세요. >");
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
		System.out.println("알람을 설정 하신 시간은 " + hour + "시 " + minute + "분 입니다." );
		
		if (minute < 45 ) {
			hour--;
			minute = 60 - (45 - minute);
			if(hour < 0) {
				hour = 23;
			}
			System.out.println("알람시간은 45분을 앞선 " + hour + "시 " + minute + "분 으로 설정되었습니다."  );
		} else {
			System.out.println("알람시간은 45분을 앞선 " + hour + "시 " + (minute - 45) + "분 으로 설정되었습니다."  );
		}
		
		

	}

}
