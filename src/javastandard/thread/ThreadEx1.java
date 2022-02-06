package javastandard.thread;

public class ThreadEx1 {

	
	public static void main(String[] args) {
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new  Thread(r);
		
		// start() method�� ���� ��Ų��.
		// �ϳ���  thread���� �ѹ��� start�� �����ϴ�.
		t1.start();
		t1 = new  ThreadEx1_1(); // ���ο�  thread�� ������ �� start�� �����ϴ�.
		t1.start();
		t2.start();

	} // main

} // class

class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(getName()); // ThreadŬ������ method�� ���
		} // end for
	} // run
} // class ThreadEx1_1

class ThreadEx1_2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 4; i ++) {
			// Thread.currentThread() : ���� �������� Thread�� ��ȯ
			System.out.println(Thread.currentThread().getName());
		} // end for
		
	} // run
	
} // class ThreadEx1_2

