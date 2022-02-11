package javastandard.lambda;

import java.util.Calendar;

public class UseLambda {

	public static void main(String[] args) {

		// 반환형 없고, 매개변수가 없는 abstract method를 가진 interface를 람다식으로 사용
		Test t = () -> {
			System.out.println("이것이 람다식");
		};
		// 인터페이스의 추상 method를 호출하면 람다식으로 구현된 코드가 호출되어 실행된다.
		t.method();

		// 반환형 없고, 매개변수가 있는 abstract method를 가진 인터페이스.
		Test2 t2 = (int age, String name) -> {
			System.out.println("나이는 " + age);
			System.out.println("이름은 " + name);

		};
		t2.method(25, "권용현");

		System.out.println("-------------------------");
		Test3 t3 = (int age) -> {
			Calendar cal = Calendar.getInstance();
			int birth = cal.get(Calendar.YEAR) - age + 1;
			return "태어난 해 :" + birth;
		};

		int age = 25;
		String value = t3.method(age);
		System.out.println(age + "살의" + value);

		// 1 ~ 100까지 출력하는 코드를 Thread로 돌려보기

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
