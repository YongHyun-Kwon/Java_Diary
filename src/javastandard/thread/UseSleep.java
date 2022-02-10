package javastandard.thread;

import java.util.Random;

// 프로그램이 실행되면 아래와 같이 .을 20개를 찍는다.
// 단. "."은 최대 0ms 999ms
public class UseSleep implements Runnable {
	Random r = new Random();

	@Override
	public void run() {

		System.out.print("Loding");
		int time = 0;
		// 3. Thread로 동작해야할 코드 정의
		for (int i = 0; i < 20; i++) {
			time = r.nextInt(901);
			System.out.print(".");
			// 지정한 시간동안 block 상태로 이전
			try {
				Thread.sleep(time);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			} // end catch
		} // end for
		System.out.print("Finish");
	} // run

	public static void main(String[] args) {

		UseSleep us = new UseSleep();
		Thread t = new Thread(us);
		t.start();
	} // main

} // class
