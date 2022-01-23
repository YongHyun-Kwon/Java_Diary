package javastandard.oop.learninterface;

/**
 * Person 클래스를 객체화하여 사용할 목적으로 만드는 클래스.
 * 
 * @author user
 */
public class UsePerson {

	/**
	 * Java Application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		HongGilDong hgd = new HongGilDong();
		// 코드의 재사용성 : 부모클래스의 자원을 자식클래스에 존재하는 것처럼 사용한다.
		hgd.setName("홍길동");
		System.out.printf("%s 의 눈 %d개, 코 %d개, 입 %d개\n", hgd.getName(), hgd.getEye(), hgd.getNose(), hgd.getMouth());
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("뜨끈한 국밥", 1));
		// 자신만의 특징을 구현한 method 호출.
		System.out.println(hgd.fight(4)); // 5 -> 6
		System.out.println(hgd.fight(5)); // 6 -> 7
		System.out.println(hgd.fight(7)); // 7 -> 7
		System.out.println(hgd.fight(10)); // 7 -> 6
		System.out.println(hgd.fight(6)); // 6 -> 6

		System.out.println("=============================================");

		Clark superman = new Clark();
		// 코드의 재사용성.
		superman.setName("클락 켄트");
		System.out.printf("%s 의 눈 %d개, 코 %d개, 입 %d개\n", superman.getName(), superman.getEye(), superman.getNose(),
				superman.getMouth());
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크", 10));

		// 자신만의 특징을 구현
		String stone = "짱돌";
		System.out.println(superman.power(stone));
		stone = "다이아몬드";
		System.out.println(superman.power(stone));
		stone = "크립토나이트";
		System.out.println(superman.power(stone));

		// 날기위한 작업
		System.out.println(superman.drivingForce());
		System.out.println(superman.upwardForce());
		
	} // main

} // class
