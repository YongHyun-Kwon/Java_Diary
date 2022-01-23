package javastandard.oop.overriding;

/**
 * 부모클래스
 * 
 * @author user
 *
 */
public class TestOverrideSuper { // 부모클래스에서는 자식클래스의 정보를 저장하지 않는다.(부모는 자식을 모른다.)

	public void test() {
		System.out.println("부모클래스의 test method");
	}// test

	protected void temp() {
		System.out.println("부모클래스의 temp method");
	}// temp
}
