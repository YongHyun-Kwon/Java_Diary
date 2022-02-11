package javastandard.lambda;

import java.util.Calendar;

public class UseLambda {

	public static void main(String[] args) {

		// ��ȯ�� ����, �Ű������� ���� abstract method�� ���� interface�� ���ٽ����� ���
		Test t = () -> {
			System.out.println("�̰��� ���ٽ�");
		};
		// �������̽��� �߻� method�� ȣ���ϸ� ���ٽ����� ������ �ڵ尡 ȣ��Ǿ� ����ȴ�.
		t.method();

		// ��ȯ�� ����, �Ű������� �ִ� abstract method�� ���� �������̽�.
		Test2 t2 = (int age, String name) -> {
			System.out.println("���̴� " + age);
			System.out.println("�̸��� " + name);

		};
		t2.method(25, "�ǿ���");

		System.out.println("-------------------------");
		Test3 t3 = (int age) -> {
			Calendar cal = Calendar.getInstance();
			int birth = cal.get(Calendar.YEAR) - age + 1;
			return "�¾ �� :" + birth;
		};

		int age = 25;
		String value = t3.method(age);
		System.out.println(age + "����" + value);

		// 1 ~ 100���� ����ϴ� �ڵ带 Thread�� ��������

//		Runnable run = () -> {
//			for (int i = 1; i < 101; i++) {
//				System.out.println(i);
//			}
//
//		};
		Thread thread = new Thread(() -> {
			for (int i = 1; i < 101; i++) {
				System.out.println(i);
			}
		});
		thread.start();

	} // main

//	}

} // class
