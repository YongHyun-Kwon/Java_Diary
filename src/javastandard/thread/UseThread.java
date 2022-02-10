package javastandard.thread;

/**
 * Thread를 상속으로 사용.
 * 
 * @author user
 */
// 1. Thread를 상속
public class UseThread extends Thread {

	// 2. run method Override
	@Override
	public void run() {
		// 3. Thread로 동작해야할 코드를 정의.(동시에 실행되어야할 코드 정의)
		for(int i = 0; i < 500 ; i++) {
			System.out.println("run i ====== > " + i);
		} // end for
	} // run

	public static void main(String[] args) {
		// 4. 클래스를 객체화
		UseThread ut = new UseThread();
		long st = System.currentTimeMillis();
		// 5. start() 호출
		ut.start();
		for(int i = 0; i < 500; i++) {
			System.out.println("main i ====== >" + i);
		}
		long et = System.currentTimeMillis();
		System.out.println("실행시간:" + (et-st) + "ms");
	} // main

} // class
