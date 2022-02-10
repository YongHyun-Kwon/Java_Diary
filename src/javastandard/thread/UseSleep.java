package javastandard.thread;

import java.util.Random;

// ���α׷��� ����Ǹ� �Ʒ��� ���� .�� 20���� ��´�.
// ��. "."�� �ִ� 0ms 999ms
public class UseSleep implements Runnable {
	Random r = new Random();

	@Override
	public void run() {

		System.out.print("Loding");
		int time = 0;
		// 3. Thread�� �����ؾ��� �ڵ� ����
		for (int i = 0; i < 20; i++) {
			time = r.nextInt(901);
			System.out.print(".");
			// ������ �ð����� block ���·� ����
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
