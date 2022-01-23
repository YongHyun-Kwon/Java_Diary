package javastandard.oop.learninterface;

/**
 * Interface<br>
 * 추상클래스와 비슷한 기능을 하지만 극단적인 경우이다.<br>
 * 
 * abstract method와 상수로만 이루어져있다.(즉 logic을 작성할 수 없다.)<br>
 * 
 * 다중 상속이 가능하다.<br>
 * 
 * interface를 상속받는 class는 반드시 interface에 있는 method를 구현해야하지만<br>
 * abstract class를 상속받는 class는 abstract method만 구현하고 일반method는 사용하지 않아도 문제가
 * 없다.<br>
 * 
 * 다형성에 대한 개념을 이해하면 interface를 더 정확하게 알 수 있다.<br>
 * 
 * interface : 동물<br>
 * method : 먹는다. 걷는다. 잔다. (일) <br>
 * implements(구현체) : 고양이, 원숭이, 닭<br>
 * 
 * interface 인터페이스명 [extends 상속받을 인터페이스명,,,,]
 * 
 * @author 82109
 *
 */
interface animals {
	public void eat(String feed);

	public void work(String move);

	public void sleep(String dreamland);

	public void animalCrying(String cry);

}

class Cat implements animals {

	@Override
	public void eat(String feed) {
		System.out.println("고양이는 " + feed + "를 먹는다.");
	}

	@Override
	public void work(String move) {
		System.out.println("고양이는 " + move + "걷는다.");
	}

	@Override
	public void sleep(String dreamland) {
		System.out.println("고양이는 " + dreamland + "잔다.");
	}

	@Override
	public void animalCrying(String cry) {
		System.out.println("고양이는 " + cry);
	}
}

class Dog implements animals {

	@Override
	public void eat(String feed) {
		System.out.println("강아지는 " + feed + "를 먹는다.");
	}

	@Override
	public void work(String move) {
		System.out.println("강아지는 " + move + "걷는다.");
	}

	@Override
	public void sleep(String dreamland) {
		System.out.println("강아지는 " + dreamland + "잔다.");
	}

	@Override
	public void animalCrying(String cry) {
		System.out.println("강아지는 " + cry);
	}
}

class Tiger implements animals {

	@Override
	public void eat(String feed) {
		System.out.println("호랑이는 " + feed + "를 먹는다.");
	}

	@Override
	public void work(String move) {
		System.out.println("호랑이는 " + move + "걷는다.");
	}

	@Override
	public void sleep(String dreamland) {
		System.out.println("호랑이는 " + dreamland + "잔다.");
	}

	@Override
	public void animalCrying(String cry) {
		System.out.println("강이즌 " + cry);
	}
}

public class InterfaceTest{
	public static void main(String[] args) {
		
		/*
		 * interface는 각동물들이 무엇을 먹고 어떻게 걷고 자고 우는지 구현하도록 되어있다.
		 * 그렇기에 class가 animals라는 interface를 상속받을 시 eat, work, move, animalCrying
		 * 를 Override 하여 구현하여야 한다. 한 class(Cat)의 먹이 자는법 우는법이 달라지더라도
		 * 다른 class Dog, Tiger에는 아무런 영향이 없다.
		 */
		
		Cat mimi = new Cat();
		Dog coco = new Dog();
		Tiger Tiger = new Tiger();
		
		mimi.eat("생선");
		coco.eat("사료");
		Tiger.eat("고기");
		
		mimi.work("네발로");
		coco.work("두발 또는 네발로");
		Tiger.work("두발 또는 네발로");
		
		mimi.animalCrying("야용");
		coco.animalCrying("왈왈");
		Tiger.animalCrying("어흥");
		
		mimi.sleep("엎드려서");
		coco.sleep("누워서");
		Tiger.sleep("이불을 덮고");
		
	}
	
}
