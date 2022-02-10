package javastandard.thread;

/**
 * Thread�� ������� ���.
 * 
 * @author user
 */
// 1. Thread�� ���
public class UseThread extends Thread {

	// 2. run method Override
	@Override
	public void run() {
		// 3. Thread�� �����ؾ��� �ڵ带 ����.(���ÿ� ����Ǿ���� �ڵ� ����)
		for(int i = 0; i < 500 ; i++) {
			System.out.println("run i ====== > " + i);
		} // end for
	} // run

	public static void main(String[] args) {
		// 4. Ŭ������ ��üȭ
		UseThread ut = new UseThread();
		long st = System.currentTimeMillis();
		// 5. start() ȣ��
		ut.start();
		for(int i = 0; i < 500; i++) {
			System.out.println("main i ====== >" + i);
		}
		long et = System.currentTimeMillis();
		System.out.println("����ð�:" + (et-st) + "ms");
	} // main

} // class
