package javastandard.oop.learninterface;

/**
 * TestA, TestB를 상속받는 하위 인터페이스
 * 
 * @author user
 */
public interface TestC extends TestA, TestB {

	public abstract void testC();

	// 부모인터페이스의 추상 method는 자식인터페이스에서 구현(Override)할 필요가 없다.
//	@Override
//	public abstract void testA();
}
