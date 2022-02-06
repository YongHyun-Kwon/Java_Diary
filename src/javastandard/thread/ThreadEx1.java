package javastandard.thread;

public class ThreadEx1 {

	
	public static void main(String[] args) {
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new  Thread(r);
		
		// start() method로 실행 시킨다.
		// 하나의  thread에는 한번만 start가 가능하다.
		t1.start();
		t1 = new  ThreadEx1_1(); // 새로운  thread를 생성후 재 start는 가능하다.
		t1.start();
		t2.start();

	} // main

} // class

class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(getName()); // Thread클래스의 method를 사용
		} // end for
	} // run
} // class ThreadEx1_1

class ThreadEx1_2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 4; i ++) {
			// Thread.currentThread() : 현재 실행중인 Thread를 반환
			System.out.println(Thread.currentThread().getName());
		} // end for
		
	} // run
	
} // class ThreadEx1_2

