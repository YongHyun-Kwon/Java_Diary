package javastandard.oop.abstractclass;

/**
 * �߻�Ŭ����(abstract class)<br>
 * ����<br>
 * �Ѱ� �̻��� �߻�method�� ������ class<br>
 * �Ϲ����� Ŭ������ �������̰�, ��ü���̴�.<br>
 * ������ �߻�Ŭ������ �Ϲ�Ŭ������ ���� ��ü������ �ʰ� �߻����̴�.<br>
 * ����<br>
 * �߻�method�� ���𸸵ǰ� ������ ���� ���� �ҿ����� method�̹Ƿ� ��ü�� �����Ǿ�� �ȵȴ�.<br>
 * �̷� class�� abstract class �μ����Ͽ� ��ü ������ ���� ��Ų��.<br>
 * 
 * �߻�Ŭ������ �ݵ�� �ϳ� �̻��� �߻� method�� ������ ��ü�� ������ �� ����. ������ super class�δ� ����� ��
 * �ִ�.<br>
 * �߻�mehotd�� ����ϱ� ���ؼ��� �ݵ�� �ش� method�� ������ �ؾ��Ѵ�.
 * 
 * @author 82109
 */
public class AbstractTest {

	public static void maint(String[] args) {

		FirstDog fd = new FirstDog();
		SecondDog sd = new SecondDog();

		fd.call();
		sd.call();
		fd.call2();
		sd.call2();

	} // main

} // class

abstract class Dog { // �߻� method�� �����ϹǷ� �߻�Ŭ������ ����
	abstract void call();// �߻�method�� �������� �ʴ´�.

	void call2() {
		System.out.println("�Ϲ� method");
	}
}

// Dog �߻� class�� ����� Ŭ������
class FirstDog extends Dog {
	void call() { // �߻�method�� sub class���� �ݵ�� ������ �Ǿ���Ϥ���.
		System.out.println("ù��° �۸���");
	}
}

class SecondDog extends Dog {
	void call() {
		System.out.println("�ι�° �۸���");
	}
}
